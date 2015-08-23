#ifndef __FRACTION_INL	// Control inclusion of header files
#define __FRACTION_INL
#include <iostream>
#include<cmath>  // for abs function

// in this inl file methods of Fraction class are implemented...
/******* Definition of CONSTRUCTORS ********/

   // Definition of Simple Constructor
     Fraction::Fraction(int i, int j)
        : iNumerator_ (i), uiDenominator_ (j)
        {
            if(j==0) {cout<<"not a valid Fraction"<<endl; return;}
            Normalize();
        }

    // Definition of Constructor for explicit Conversion
	 Fraction::Fraction(double d)			// explicit double to Fraction conversion
     {
        iNumerator_=(int)(d*precision());
        uiDenominator_=precision();
        Normalize();
     }

    // Definition of Copy Constructor
	Fraction::Fraction(const Fraction& to_copy)
	  : iNumerator_(to_copy.iNumerator_),uiDenominator_(to_copy.uiDenominator_)
	{
	    Normalize();
	}

/******* Definition of DESTRUCTORS ********/
   Fraction::~Fraction(){};

/******* Definition of OPERATORS ********/


	// Definition of BASIC ASSIGNEMENT OPERATOR
	Fraction& Fraction::operator=(const Fraction&  to_assign)
	{
	    if(this != &to_assign)
        {
	      iNumerator_=to_assign.iNumerator_;   //assign numerator
	      uiDenominator_=to_assign.uiDenominator_;  //assign denominator
	    }
	    return *this;            //return  refrence to Fraction
	}

	// Definition of UNARY ARITHMETIC OPERATORS
	// ----------------------------

	Fraction Fraction::operator-()		// Operand 'this' implicit
	{
	    Fraction temp(-1*iNumerator_,uiDenominator_);     //multiply numerator by -1
	    return temp;
	}

	Fraction Fraction::operator+()
	{
	    return *this;                    //return same
	}

	Fraction& Fraction::operator--()		// Pre-decrement. Dividendo. p/q <-- p/q - 1
	{
	    iNumerator_=iNumerator_-uiDenominator_;
	    Normalize();
	    return *this;
	}

	Fraction& Fraction::operator++()		// Pre-increment. Componendo. p/q <-- p/q + 1
	{
	    iNumerator_=iNumerator_+uiDenominator_;
	    Normalize();
	    return *this;
	}

	Fraction Fraction::operator--(int)	// Post-decrement. Lazy Dividendo. p/q <-- p/q - 1. Returns old p/q
	{
	    Fraction temp(iNumerator_,uiDenominator_);
	    iNumerator_=iNumerator_-uiDenominator_;
	    Normalize();
	    return temp;
	}
	Fraction Fraction::operator++(int)	// Post-increment. Lazy Componendo. p/q <-- p/q + 1. Returns old p/q
	{
	    Fraction temp=Fraction(iNumerator_,uiDenominator_);
	    iNumerator_=iNumerator_+uiDenominator_;
	    Normalize();
	    return temp;

	}

	// Definition of BINARY ARITHMETIC OPERATORS USING FRIEND FUNCTIONS
	// --------------------------------------------------

	 Fraction operator+(const Fraction& f1, const Fraction& f2)
	{
	    unsigned int lcm_uidenominator =Fraction::lcm(f1.uiDenominator_,f2.uiDenominator_);  // denominator of sum
	    //numerator of sum
	    int temp_inumerator = f1.iNumerator_*(lcm_uidenominator/f1.uiDenominator_ )+ f2.iNumerator_*(lcm_uidenominator/f2.uiDenominator_);
         //call to constructor of Fraction for construction of Fraction
	    Fraction temp(temp_inumerator,lcm_uidenominator);
	    return temp;
	}
	 Fraction operator-(const Fraction& f1, const Fraction& f2)
	{
	  unsigned int lcm_uidenominator =Fraction::lcm(f1.uiDenominator_,f2.uiDenominator_);
	    int temp_inumerator = f1.iNumerator_*(lcm_uidenominator/f1.uiDenominator_ )- f2.iNumerator_*(lcm_uidenominator/f2.uiDenominator_);

	    Fraction temp(temp_inumerator,lcm_uidenominator);
	    return temp;

	}
	 Fraction operator*(const Fraction& f1, const Fraction& f2)
	{
	     int temp_inumerator = f1.iNumerator_*f2.iNumerator_;
	    unsigned int temp_uidenominator = f1.uiDenominator_*f2.uiDenominator_;

	    Fraction temp(temp_inumerator,temp_uidenominator);
	    return temp;

	}
	 Fraction operator/(const Fraction& f1, const Fraction& f2)
	{
	    if(f2.iNumerator_!=0){
        int temp_inumerator = f1.iNumerator_*f2.uiDenominator_;
	    unsigned int temp_uidenominator = f1.uiDenominator_*f2.iNumerator_;

	    Fraction temp(temp_inumerator,temp_uidenominator);
	    return temp;}
	    else
            {
            if(f1.iNumerator_==f2.iNumerator_ && f1.uiDenominator_==f2.uiDenominator_) return   Fraction::sc_fUnity;
         else
            cout<<"can not divide by zero"<<endl;
            }
	}

    Fraction operator%(const Fraction& f1, const Fraction& f2)
	{
	    //divide f1 by f2 and store f1/f2
	   Fraction divd = f1/f2;
	   int Frac_div=divd.iNumerator_/divd.uiDenominator_;
	   divd=(Frac_div,1);
	   //calculation of  residue
       Fraction result= f1 -divd*f2;
       return result;  //return residue
	}

	// BINARY RELATIONAL OPERATORS
	// ---------------------------
	bool Fraction::operator==(const Fraction& to_compare)
	{
	    if(iNumerator_==to_compare.iNumerator_ && uiDenominator_==to_compare.uiDenominator_)
            return true;
        else
            return false;

	}
	bool Fraction::operator!=(const Fraction& to_compare)
	{
	  return !(*this==to_compare);  //return inverse of assignment
	}
	bool Fraction::operator<(const Fraction&  to_compare)
	{
	    //substract to_compare from this and check whether numerator of result is positive or negative
        unsigned int lcm_uidenominator =lcm(this->uiDenominator_,to_compare.uiDenominator_);
	    int temp_inumerator = this->iNumerator_*(lcm_uidenominator/this->uiDenominator_ )- to_compare.iNumerator_*(lcm_uidenominator/to_compare.uiDenominator_);
	    if(temp_inumerator < 0) return true; // if negative return true
	    else return false;
	}
	bool Fraction::operator<=(const Fraction& to_compare)
	{
	     //substract to_compare from this and check whether numerator of result is positive or negative
	     unsigned int lcm_uidenominator =lcm(this->uiDenominator_,to_compare.uiDenominator_);
	    int temp_inumerator = this->iNumerator_*(lcm_uidenominator/this->uiDenominator_ )- to_compare.iNumerator_*(lcm_uidenominator/to_compare.uiDenominator_);
	    if(temp_inumerator <= 0) return true; // if negative or zero return true
	    else return false;
	}
	bool Fraction::operator>(const Fraction& to_compare)
	{
	      //substract to_compare from this and check whether numerator of result is positive or negative
	    unsigned int lcm_uidenominator =lcm(this->uiDenominator_,to_compare.uiDenominator_);
	    int temp_inumerator = this->iNumerator_*(lcm_uidenominator/this->uiDenominator_ )- to_compare.iNumerator_*(lcm_uidenominator/to_compare.uiDenominator_);
	    if(temp_inumerator > 0) return true; // if positive return true
	    else return false;
	}
	bool Fraction::operator>=(const Fraction& to_compare)
	{
	    unsigned int lcm_uidenominator =lcm(this->uiDenominator_,to_compare.uiDenominator_);
	    int temp_inumerator = this->iNumerator_*(lcm_uidenominator/this->uiDenominator_ )- to_compare.iNumerator_*(lcm_uidenominator/to_compare.uiDenominator_);
	    if(temp_inumerator >= 0) return true; // if positive or zero return true
	    else return false;
	}


	// ADVANCED ASSIGNEMENT OPERATORS
	// ------------------------------
	Fraction& Fraction::operator+=(const Fraction& to_add)
	{
	    //simply use previously overloade + and = operator
	    *this=*this + to_add;
	    return *this;
	}

	Fraction& Fraction::operator-=(const Fraction& to_add)
	{
	     //simply use previously overloade - and = operator
         *this=*this-to_add;
         return *this;
	}
	Fraction& Fraction::operator*=(const Fraction& to_add)
	{
	     //simply use previously overloade * and = operator
	    *this=*this * to_add;
         return *this;
	}
	Fraction& Fraction::operator/=(const Fraction& to_add)
	{
        //simply use previously overloade /and = operator
	    *this=*this / to_add;
         return *this;
	}
	Fraction& Fraction::operator%=(const Fraction& to_add)
	{
	     //simply use previously overloade %b and = operator
        // if(this!=&to_add)
	    (*this) = (*this) % to_add;
         return (*this);
	}

	// SPECIAL OPERATORS
	// -----------------
	Fraction Fraction::operator!()		// Inverts a fraction. !(p/q) = q/p
    {
        int temp_num=iNumerator_;
        unsigned int temp_denom=uiDenominator_;
         iNumerator_=temp_denom;

         if(temp_num!=0)
         {
         if(temp_num > 0)
         uiDenominator_=temp_num;  //numerator will be simply demoninator of this if number is positive
         else    //if numer is negative
         {
             uiDenominator_=temp_num*-1;   //numerator will be negative of demoninator of this
             iNumerator_=iNumerator_*-1;   //numerator will be negative of demoninator of this
         }
         return *this;
         }
         else
            return Fraction::sc_fZero;
    }


// BASIC I/O using FRIEND FUNCTIONS
	// --------------------------------
    ostream& operator<<(ostream& os, const Fraction& frct)
	{
        os<<frct.iNumerator_<<"/"<<frct.uiDenominator_;
        return os;
	}
    istream& operator>>(istream  &input, Fraction& frct)
	{
	    char dummy;
        input >> frct.iNumerator_ >> dummy>>frct.uiDenominator_;
          while(frct.uiDenominator_==0)
        {
            cout<<"not a valid Fraction Enter Again"<<endl;
            input >> frct.iNumerator_ >> dummy>>frct.uiDenominator_;
        }
        return input;
	}

	// CONSTANTS OF DATATYPE
	// ---------------------
     const Fraction Fraction::sc_fUnity =Fraction(1,1);	// Defines 1/1
     const Fraction Fraction::sc_fZero  =Fraction(0,1);	// Defines 0/1


// STATIC UTILITY FUNCTIONS
	// ------------------------
	 int Fraction::gcd(int x, int y)	// Finds the gcd for two +ve integers
	 {
	     int gcd;
          for(int i=1;i<=x || i<=y ;i++)
          {
              if(x%i==0 && y%i==0)
                gcd=i;
          }
          return gcd;
	 }
	 int Fraction::lcm(int x, int y)	// Finds the lcm for two +ve integers
      {
        return x*y/Fraction::gcd(x,y);
      }
	// OTHER METHOD MEMBERS
	// --------------------
	Fraction& Fraction::Normalize()	// Normalizes a fraction
{
      int to_div=Fraction::gcd(abs(iNumerator_),abs(uiDenominator_));
      iNumerator_/=to_div;
      uiDenominator_/=to_div;
      return *this;
}
#endif // __FRACTION_INL
