/*
Created by:  Ankit Kumar Gupta
Roll No. :12CS10006

this programm uses user defined Fraction data type to design
a simple console-based text interface Calculator

*/

//header files inclusion
#include<iostream>   //for basic IO
#include "Fraction.hxx"  // for Fractional arithmetic

using namespace std;
int main()
{

     //asking for user choice
    cout<<"/***** Rational Number Calculator ******/"<<endl;
    cout<<"Enter Your Choice"<<endl;
    cout<<"1 for addition"<<endl;
    cout<<"2 for substraction"<<endl;
    cout<<"3 for multiplication "<<endl;
    cout<<"4 for division"<<endl;
    cout<<"5 to exit"<<endl;

 //iterate unitl user chooses to quit
   while(1)
    {
    cout<<"Enter Your Choice"<<endl;
    int choice;
    cin>>choice;
    if(choice ==5) break;
    cout<<"enter first Rational number"<<endl;
    Fraction f1;
    cin>>f1;
    cout<<"enter second Rational number"<<endl;
    Fraction f2;
    cin>>f2;

 //fraction arithmetic using Fraction data typa defined in Fraction.hxx
    switch(choice)
    {
         case 1:
           cout<<f1+f2<<endl;;
           break;
         case 2:
           cout<<f1-f2<<endl;
           break;
         case 3:
           cout<<f1*f2<<endl;
           break;
        case 4:
           cout<<f1/f2<<endl;
           break;
    }
}
}
