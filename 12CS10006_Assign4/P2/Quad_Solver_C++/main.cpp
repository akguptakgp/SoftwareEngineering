/*
Created by :ankit kumar gupta
Roll No. :12CS10006
description : this programm uses c++ exception handling to handle different
cases of quadratic equcation and solves quadratic equcation
*/

/***********  programm starts *********/
#include <iostream> // for basic IO
#include<cmath>     // for sqrt function

using namespace std; //using standard namespace

//class declaration to throw  invalid equcation
class invalid_argumnt
{
    public:
    void print(){cout<<"<<< error wrong input <<<"<<endl; }
};

//complex class declaration
class Complex
{
   double _re,_im;
public:
    Complex(double i=0,double j=0):_re(i),_im(j){}
    friend ostream& operator<<(ostream & ,const Complex& );
};

// overloading of operator << to print complex on std
ostream& operator<<(ostream & os,const Complex& c)
{
    os<<c._re<<" + i "<<c._im;
    return os;
}
/**********  main function starts *********/
int main()
{
    int flag=1;
    while(flag)
    {
     //ask for input
     cout << "enter coeficients in decreasing order of degree " << endl;
     double a,b,c,D;
     cin>>a>>b>>c;

        try
        {
            if(!cin) throw invalid_argumnt{};  // throw invalid arguments
            if(a==0)  throw 1.0;
            D=b*b-4*a*c;                        //compute D
            if(D==0) throw 1;                   // throw 1 for equal roots
            if(D>0)   throw 2;                  //throw 2 for distinct roots
            else throw  Complex{} ;             //else throw complex object for complex roots
        }

        catch(invalid_argumnt ex) //catch invlaid input
        {
          ex.print(); cin.clear();
          cin.ignore(10000,'\n');flag=1;
        }

        catch(double ex)     //catch linear equation
        {
            if(b==0 && c==0) cout<<"infininte many solutions "<<endl;
            else{
            if(b==0 &&  c!=0)cout<<"no Solution exists"<<endl;
            else {cout<<"only one solution exists"<<endl;
            cout<<"solutions is :"<<-c/b;}
            }
            flag=0;
        }

        catch(int ex)     // catch equal and distinct roots case
        {
            if(ex==1) {cout<<"only one solution exists"<<endl;
                         cout<<"solution is : "<<-b/2/a<<endl;}
            if(ex==2)  {cout<<"two distinct solutions exists"<<endl;
                         cout<<"Solution 1 is :";
                        cout<<(-b+sqrt(D))/2/a <<endl<<"Solution 2 is :";
                        cout<<(-b-sqrt(D))/2/a<<endl;}
            flag=0;
        }

        catch(Complex ex)     //catch complex roots case
        {
            cout<<"both Solutions are complex"<<endl;cout<<"Solution 1 is : ";
            cout<<Complex(-b/2/a,sqrt(-D)/2/a)<<endl;
            cout<<"Solution 2 is : ";
            cout<<Complex(-b/2/a,-sqrt(-D)/2/a)<<endl;
            flag=0;
        }

    }
    return 0;
}
