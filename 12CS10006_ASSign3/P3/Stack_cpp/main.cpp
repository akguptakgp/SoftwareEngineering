/*
Created by:  Ankit Kumar Gupta
Roll No. : 12CS10006

this programm uses user defined Stack data type to convert infix expression into
postfix expression and Evaluate its value using stack.

*/

//inclusion of header files
#include <iostream>  //for IO
#include<cstring>    //for string library
#include<cstdlib>    //for pointers

using namespace std;

/******* Programm Starts *********/

//Define basic linked list class
 struct link_list
{
    int data;   //data field
    struct link_list *next; //pointer to next
};


//Define Stack class
class Stack
{
 public :
    struct link_list *top; //pointer to top of stack

 public :
    //constructor
    Stack() :
     top(NULL){} //returns null stack

   //member functions
   //empty ness check
   int is_empty()
   {
       if(this->top==NULL) return 1;
     else return 0;
   }
   //push into stack
  void push(int el)
  {
      if(this->top==NULL)
      {
          this->top=(struct link_list*)malloc(sizeof(struct link_list));
          this->top->data=el;
          this->top->next=NULL;
      }
      else
        {
           struct link_list* node;
           node=(struct link_list*)malloc(sizeof(struct link_list)) ;
           node->data=el;
           node->next=this->top;
           this->top=node;
        }
  }
 //pop from stack
   int pop()
   {
        if(!is_empty())
    {
        int to_return =this->top->data;
        struct link_list* to_free=this->top;
        this->top=this->top->next;
       free(to_free);
       return to_return;
    }
    else
        return -1;
   }
};

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
//returns for '+' -1,for '-' 1,for '*' -3, for '/' 3 otherwise 4 ;
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
void check_operator(string& post_str,char c,Stack& s)
{
    int tmp=equi_int(c); //compute eqivalent char for operator code
    if(s.is_empty())
    {
      s.push(tmp);   //push equi_char if stack is empty
      return ;
    }
    while(!s.is_empty())
    {
        //compare priroty of operator
        if(abs(tmp) > abs(s.top->data)) //if current has priority has greater priority than top
        {
            s.push(tmp); //push current if stack is empty
            return;
        }
        else //pop until current has higher priority  greater priority than top
        {
            int pop_out=s.pop();
            char ceq=equi_char(pop_out);
            post_str=post_str+' ';
            post_str=post_str+ceq;  //add poped to postfix string
            post_str=post_str+' ';
        }
        if(s.is_empty())
         {
           s.push(tmp); //push equi_char if stack is empty
           return ;
         }
    }
}

//function to evaluate value of postfix expression
//using stack
int eval_postfix(string postfix_str)
{
   int size=postfix_str.size();
  // cout<<size<<endl;
   int i=0,flag=1;
   Stack s;
   char c;
   int to_push=0;
   for(;i<size;i++)
   {
       c=postfix_str[i];
      // cout<<"char="<<c<<endl;
       if(c!=' ')
       {
           int eq_int =equi_int(postfix_str[i]);
           int top1,top2,res;

           switch(eq_int)
           {
              case -1: //pop out top 2  from stack
                    top1=s.pop();
                    top2=s.pop();
                    res=top2+top1; //operate + operator on top1 and top2
                    s.push(res);  //push result into stack
                    break;
              case 1: //pop out top 2  from stack
                    top1=s.pop();
                    top2=s.pop();
                    res=top2-top1;  //operate - operator on top1 and top2
                    s.push(res);    //push result into stack
                    break;
             case -3://pop out top 2  from stack
                    top1=s.pop();
                    top2=s.pop();
                    res=top2*top1;  //operate * operator on top1 and top2
                    s.push(res);     //push result into stack
                    break;
             case 3://pop out top 2  from stack
                    top1=s.pop();
                    top2=s.pop();
                    res=top2/top1;   //operate / operator on top1 and top2
                    s.push(res);    //push result into stack
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
               }
               else  //push operand into stack
               {
                  s.push(to_push);
                  to_push=0;
                  flag=0;
               }
           }
       }
   return s.pop(); //return result that is on top
}
int main()
{
    Stack s;
    string infix_str,postfix_str;

   //read infix string
   cin>>infix_str;
   cout<<"entered infix expression="<<endl;
   cout<<infix_str<<endl;

      char c;
      int type;

 for(int i=0;i<infix_str.size();i++)
     {
         c=infix_str[i];
        type=check_type(c); //check type of operator
       // cout<<type<<endl;
        switch(type)
        {
            case 1:
                {
                    //add operand to postfix string
                   postfix_str=postfix_str+c;
                //=   cout<<c<<endl;
                    break;
                }
            case 2:
                {
                    //call check_operator to check operator stack
                    postfix_str=postfix_str+' ';
                    check_operator(postfix_str,c,s);
                    postfix_str=postfix_str+' ';
                    break;
                }
            case 3:
                cout<<"expression is not a valid infix expression"<<endl;
                exit(0);
        }
     }

  //add top of stack to postfix until stack is not empty
        while(s.is_empty()!=1)
        {
             int top=s.pop();
             c=equi_char(top);
             postfix_str=postfix_str+' ';
             postfix_str=postfix_str+c;
             postfix_str=postfix_str+' ';
        }

    cout<<"postfix expression is= "<<endl;
    cout<<postfix_str<<endl;
    cout<<"value of expression is = ";
    cout<<eval_postfix(postfix_str)<<endl; // evaluates value of postfix expression
    return 0;
}

/***** programm ends *******/
