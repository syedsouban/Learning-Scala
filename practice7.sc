import myMath.{Rational,Integer};
import Numeric._
object practice7 {
  new myMath.Rational(1,2)                        //> res0: myMath.Rational = 1/2
	new myMath.Integer(12)                    //> res1: myMath.Integer = 12
	val a=new Integer(1)                      //> a  : myMath.Integer = 1
	val b=new Integer(2)                      //> b  : myMath.Integer = 2
	val c=a+(b)                               //> c  : myMath.Integer = 3
	
	a-b                                       //> res2: myMath.Integer = -1
	
	val x = new Rational(1)                   //> x  : myMath.Rational = 1/1
	val y = new Rational(1)                   //> y  : myMath.Rational = 1/1
	x+y                                       //> res3: myMath.Rational = 2/1
	
	
	
	
	
	
}