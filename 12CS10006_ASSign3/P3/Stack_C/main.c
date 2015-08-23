/*
Created by:  Ankit Kumar Gupta
Roll No. :12CS10006

this programm uses user defined Stack data type to convert infix expression into
postfix expression and Evaluate its value.

*/

/******* Programm Starts *********/

//include header files
#include <stdio.h> //for IO
#include <stdlib.h>   //for pointers
#include <string.h>   //for string library
#include<math.h>    // for abs function

//define basic linked list data type

typedef struct link_list
{
    int data;  //data field
    struct link_list *next; //pointer to next
} Link_List;


/********* user defined data type**********/
//Define Stack
typedef struct stack_int
{
    Link_List  *top; //pointer to top of stack

} STACK;

//returns null stack
STACK* init(STACK* s)
{
    s=(STACK*)malloc(sizeof(STACK));
    s->top=NULL;
    return s;
}

 //empty ness check
int is_empty(STACK *s)
{
    if(s->top==NULL) return 1;
    else return 0;
}

 //push into stack
STACK* push_stack(STACK *s,int d)
{
    if(is_empty(s))
    {
        s->top=(Link_List*)malloc(sizeof(Link_List));
        s->top->data=d;
        s->top->next=NULL;
        return s;
    }
    else
    {
       Link_List* node;
       node=(Link_List*)malloc(sizeof(Link_List)) ;
       node->data=d;
       node->next=s->top;
       s->top=node;
       return s;
    }

}

//pop from stack
int  pop_stack(STACK *s)
{
    if(!is_empty(s))
    {
        int to_return =s->top->data;
        Link_List* to_free=s->top;
        s->top=s->top->next;
       free(to_free);
       return to_return;
    }
    else
        return -1;
}

/****** user  defined functions *********/
//checks type of char in entered infix string
//returns 1 if number is an operand ,3 if operator ,else 3

int check_type(char c)
{
    if(c >='0' && c<='9')
        return 1;
    if(c=='+' || c=='-' || c=='*' || c=='/')
        return 2;
    else
        return 3;
}

//returns an integer code for each opertor
//returns for '+' -1,for '-' 1,for '*' -3, for '/' 3 ;
int equi_int(char c)
{
    switch(c)
    {
    case '+':
        return -1;
    case '-':
        return 1;
    case '*':
        return -3;
    case '/':
        return 3;
    default :
        return 4;
    }
}

//does reverse operation of above function
//means converts integer code back into operator
char equi_char(int a)
{
    switch(a)
    {
    case -1:
        return '+';
    case 1:
        return '-';
    case -3:
        return '*';
    case 3:
        return '/';
    }
}

//function to compute postfix string
void check_operator(char postfix_str[],char c,STACK *s, int* post_index)
{

    int tmp = equi_int(c); //compute eqivalent char for operator code
    if(is_empty(s))
    {
         push_stack(s,tmp);   //push equi_char if stack is empty
        return;
    }
   while(!is_empty(s))
   {
        //compare priroty of operator
       if(abs(s->top->data) < abs(tmp)) //if current has priority has greater priority than top
       {
            push_stack(s,tmp);  //push current if stack is empty
           return;
       }
       else //pop until current has higher priority  greater priority than top
       {
           int top=pop_stack(s);
            char ceq=equi_char(top);
            postfix_str[(*post_index)++]=' ';
            postfix_str[(*post_index)++]=ceq; //add poped to postfix string
            postfix_str[(*post_index)++]=' ';
       }
     if(is_empty(s))
      {
        push_stack(s,tmp); //push equi_char if stack is empty
        return;
      }
      }
}

//function to evaluate value of postfix expression
//using stack
int eval_postfix(char postfix_str[],int *post_index)
{

    int size=*post_index;
    int i=0,flag=1;
    STACK *s;
    s=init(s);
    char c;
    int eq_int,top1,top2,res;
    int to_push=0;
    for(;i<size;i++)
   {
       c=postfix_str[i];
      // printf("c=%c\n",c);
       if(c!=' ')
       {
           eq_int =equi_int(c);
            top1,top2,res;

           switch(eq_int)
           {
              case -1: //pop out top 2  from stack
                    top1= pop_stack(s);
                    top2=pop_stack(s);
                    res=top2+top1; //operate + operator on top1 and top2
                    s=push_stack(s,res);  //push result into stack
                    break;
              case 1: //pop out top 2  from stack
                    top1= pop_stack(s);
                    top2=pop_stack(s);
                    res=top2-top1;  //operate - operator on top1 and top2
                    s=push_stack(s,res);   //push result into stack
                    break;
             case -3://pop out top 2  from stack
                    top1= pop_stack(s);
                    top2=pop_stack(s);
                    res=top2*top1;  //operate * operator on top1 and top2
                   s=push_stack(s,res);    //push result into stack
                    break;
             case 3://pop out top 2  from stack
                    top1= pop_stack(s);
                    top2=pop_stack(s);
                    res=top2/top1;   //operate / operator on top1 and top2
                   s=push_stack(s,res);  //push result into stack
                    break;
             case 4:
                 to_push=to_push*10+c-'0';
                 flag=1;
                 break;
           }
       }
           else
           {
               if(i==size-1 || flag==0) //ignore empty braces
               {
                   // printf("igonerd \n",c);
               }
               else  //push operand into stack
               {
                  s=push_stack(s,to_push);
                  // printf("push=%d\n",to_push);
                  to_push=0;
                  flag=0;
               }
           }
       }
   return pop_stack(s); //return result that is on top
}
int main()
{
       int post_index=0;
    int i=0;
    STACK *s;
    //create empty stack
    s=init(s);
    char postfix_str[100];
    char infix_str[100];

     //scan infix expression
     scanf("%s",infix_str);
     printf("input infix expression = \n%s\n",infix_str);

      char c;
      int type;
     while((c=infix_str[i++])!=NULL)
     {
        type=check_type(c);
        switch(type)
        {
            case 1:
                {
                    //add operand to postfix string
                   postfix_str[post_index++]=c;
                   //printf("%c added \n",c);
                    break;
                }
            case 2:
                {
                    postfix_str[post_index++]=' ';
                    check_operator(postfix_str,c,s,&post_index);
                    postfix_str[post_index++]=' ';
                    break;
                }
            case 3:
                printf("expression is not a valid infix expression\n");
                exit(0);
        }
     }

        while(is_empty(s)!=1)
        {
            int top=pop_stack(s);
            c=equi_char(top);
            postfix_str[post_index++]=' ';
            postfix_str[post_index++]=c;
            postfix_str[post_index++]=' ';
        }
   postfix_str[post_index]=NULL;
   printf("postfix expression is =\n%s\n",postfix_str);
   int val=eval_postfix(postfix_str,&post_index);
   printf("value of expression =%d \n",val);
    return 0;
}

/***** programm ends *******/
