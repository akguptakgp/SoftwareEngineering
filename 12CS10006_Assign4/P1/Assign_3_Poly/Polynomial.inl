#ifndef __POLYNOMIAL_INL	// Control inclusion of INL file
#define __POLYNOMIAL_INL

/************ C++ Headers ************************************/
#include <iostream>	// Defines istream & ostream for IO
#include <vector>


/************ Project Headers ********************************/
#include "Fraction.hxx"
/************ CLASS Defintion ******************************/

	// Type of value , Coefficients
	// CONSTRUCTOR
	//Default Constructor
   template< class T, class U >
   inline Poly<T,U>::Poly(unsigned int i)	// Uses default parameters. Overloads to
		:degree_(i)		// Poly(...);   //initilization of degree
    {
        unsigned int j=0;
        while(j<= i)
        {
            coefficients_.push_back(0);  //creation of coefficient of i degree polynomial
            j++;
        }
    };

	// Copy Constructor
    template< class T, class U >
	inline Poly<T,U>::Poly(const Poly& p)	// Param cannot be changed (const)
      :degree_(p.degree_)
    {
        unsigned int i=0;
        while(i<= p.degree_)
      {  this->coefficients_.push_back(p.coefficients_[i]); i++;}
    };

	/*// DESTRUCTOR
    template< class T, class U >
	inline Poly<T,U>::~Poly() { ~coefficients_; };	// No virtual destructor needed*/

/******** BASIC ASSIGNEMENT OPERATOR  *********/
 	// --------------------------
 	//assignment operator overloading
    template< class T, class U >
	inline Poly<T , U>& Poly<T , U>::operator=(const Poly<T , U>& p)
   {

         int i=0;
         //copy upto same power
      while(i<=this->degree_ &&  i<=p.degree_)
      {
         this->coefficients_[i]=p.coefficients_[i];
          i++;
      }
      //push remaining powers into vector
      while(i<=p.degree_)
      {
          this->coefficients_.push_back(p.coefficients_[i]);
          i++;
          this->degree_=p.degree_;
      }
         return *this;
    }

	// UNARY ARITHMETIC OPERATORS
	// --------------------------
	//unary minus operator overloading
    template< class T, class U >
	inline Poly<T ,U > Poly<T,U>::operator-()
	{
	    Poly<T ,U > temp(this->degree_);
	    for(int i=0;i<=temp.degree_;i++)
            temp.coefficients_[i]=-1*(this->coefficients_[i]);
        return temp;
	}

    //unary plus operator overloading
    // Operand 'this' implicit
    template< class T, class U >
	inline Poly<T,U> Poly<T,U>::operator+()
	{
	     return *this;
	}

	// BINARY ARITHMETIC OPERATORS
	// ---------------------------
    template< class T, class U >
	inline Poly<T , U> Poly<T,U>::operator+(const Poly<T , U>& p)
	{
	    Poly<T , U> temp; //create a tempary polynomial
	    temp.coefficients_.clear();
              int i=0;
               //add coefficients upto same degree and push in vector
      while(i<=this->degree_ &&  i<=p.degree_)
      {
         temp.coefficients_.push_back(this->coefficients_[i]+p.coefficients_[i]);
          i++;
      }
      temp.degree_=this->degree_;
      //add remaining degrees of this to temp
      while(i<=this->degree_)
      {
          temp.coefficients_.push_back(this->coefficients_[i]);
          i++;
          temp.degree_=this->degree_;
      }
        //add remaining degrees of p to temp
      while(i<=p.degree_)
      {
          temp.coefficients_.push_back(p.coefficients_[i]);
          i++;
          temp.degree_=p.degree_;
      }
         return temp;
	}
    template< class T, class U >
	inline Poly<T , U> Poly<T,U>::operator-(const Poly<T , U>& p)
	{
	        Poly<T , U> temp;  //create a tempary polynomial
	    temp.coefficients_.clear();
              int i=0;
             //substract upto same degree and push in vector
      while(i<=this->degree_ &&  i<=p.degree_)
      {
         temp.coefficients_.push_back(this->coefficients_[i]-p.coefficients_[i]);
          i++;
      }
      temp.degree_=this->degree_;
      //add remaining degrees of this to temp
      while(i<=this->degree_)
      {
          temp.coefficients_.push_back(-1*(this->coefficients_[i]));
          i++;
          temp.degree_=this->degree_;
      }
      //add remaining degrees of p to temp
      while(i<=p.degree_)
      {
          temp.coefficients_.push_back(-1*(p.coefficients_[i]));
          i++;
          temp.degree_=p.degree_;
      }
         return temp;
	}

	// ADVANCED ASSIGNEMENT OPERATORS
	// ------------------------------
	//just use previously defined operator overloading
    template< class T, class U >
	Poly<T , U>& Poly<T,U>::operator+=(const Poly<T , U>& p)
	{
         *this=*this + p;
         return *this;
	}

   template< class T, class U >
	Poly<T , U>& Poly<T,U>::operator-=(const Poly<T , U>& p)
	{
	   *this=*this - p;
         return *this;
	}


// BASIC I/O using FRIEND FUNCTIONS
	// --------------------------------
  template< class T, class U >
	inline ostream& operator<<(ostream& os, const  Poly<T, U>& p)
	{

	    for(int i=p.degree_;i>=0;i--)
	    {
	        if(i!=0)
            {
                os<<p.coefficients_[i]<<"X^"<<i<<"+";  //add to output stream
            }
            else
                os<<p.coefficients_[i]<<"X^"<<i;

	    }
	    return os;

	}
   template< class T, class U >
    inline istream& operator>>(istream& is, Poly<T, U>& p)
    {

         //cout<<p.degree_<<endl;
        for(int i=p.degree_;i>=0;i--)
	    {
	       // cout<<i<<endl;
	         char c;
	        if(i!=0)
            {
                is>>p.coefficients_[i];  //get input from user and store it in coefficient vector
            }
            else
                is>>p.coefficients_[i];

	    }
	    return is;
    }

	// METHODS
	// -------
	 template<class T, class U>
	 inline T Poly<T,U>::Evaluate(const T& x) // Evaluates the polynomial - use Horner's Rule
     {
         int i=this->degree_;
         T value=0;
         //cout<<"invoked with ="<<x<<endl;
         while(i>=0)
         {
             value=value*x + this->coefficients_[i];
             i--;
           //  cout<<i<<" "<<value<<endl;
         }
         return value;
     }



#endif // __POLYNOMIAL_INL
