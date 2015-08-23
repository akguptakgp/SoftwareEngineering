 /*
Created by :ankit kumar gupta
Roll No. :12CS10006
description : this programm uses setjmp.h library to pass control to different points for
different cases of quadratic equcation and solves quadratic equcation
*/

//inclusion of header files
#include <stdio.h>  // for basic IO
#include<setjmp.h>  // for exception handling
#include<math.h>    // for sqrt function

int main()
{
    //ask for input
    printf("enter coeficients in decreasing order of degree\n");
    double a,b,c,D;       //coefficent of quadratic equcation and discrement
    scanf("%lf%lf%lf",&a,&b,&c); // scan coefficients

    jmp_buf env;         // declare jmp_buf
    int val;             // value returned by setjump
    val=setjmp(env);     //initial value returned is 0
    switch(val)
    {
        case 0: {
            if(a==0) {  longjmp(env,4); break;}

            D=b*b-4*a*c;        //compute D
            //for different cases pass control to different handlings
            if(D==0) longjmp(env,1);
            if(D>0)  longjmp(env,2);
            else      longjmp(env,3);
             break;
        }
        case 1: //equal roots case
            {
                printf("only one Solution exists\n");
                printf("Solution is : %lf",-b/2/a);
                break;
            }
        case 2:     //distinct roots case
            {
                 printf("two distinct Solutions exists \n");
                 printf("Solution 1 is : %lf \nSolution 2 is : %lf ",(-b+sqrt(D))/2/a,(-b-sqrt(D))/2/a);
                break;
            }
        case 3:
            {      //complex roots case
                 printf("both Solutions are Complex \n");
                 printf("Solution 1 is : ");
                 printf("%lf +i %lf  \n",-b/2/a,sqrt(-D)/2/a);
                 printf("Solution 2 is : ");
                 printf("%lf +i %lf",-b/2/a,-sqrt(-D)/2/a);
                break;
            }
        case 4:     // for a==0 equation is linear
            {
                if(b==0 && c==0) printf("infinite many solutions exists\n");
                else
                {
                     if(b==0 && c!=0) printf("no solution exists \n");
                     else{ printf("only one solution exists \n");
                           printf("Solution is  : %lf",-c/b);
                           }
                }

                break;
            }

    }

    return 0;
}
