//header files inclusion
#include<iostream>   //for basic IO
#include "Fraction.hxx"  // for Fractional arthmetic

using namespace std;
int main()
{

    cout<<"/***** Rational Number Calculator ******/"<<endl;
    cout<<"Enter Your Choice"<<endl;
    cout<<"1 for addition"<<endl;
    cout<<"2 for substraction"<<endl;
    cout<<"3 for multiplication "<<endl;
    cout<<"4 for division"<<endl;

    int choice;
    cin>>choice;
    cout<<"enter first Rational number"<<endl;
    Fraction f1;
    cin>>f1;
    cout<<"enter second Rational number"<<endl;
    Fraction f2;
    cin>>f2;
    switch(choice)
    {
         case 1:
           cout<<f1+f2;
           break;
         case 2:
           cout<<f1-f2;
           break;
         case 3:
           cout<<f1*f2;
           break;
        case 4:
           cout<<f1/f2;
           break;
    }
}
