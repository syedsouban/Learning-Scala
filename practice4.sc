object practice4 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
	
	class Rational(x:Int,y:Int) {
		
		require(y!=0,"denominator must be non-zero")
		
		private def gcd(a:Int,b:Int):Int = if(b==0) a else gcd(b,a%b)
		
		def this(x:Int) = this(x,1)
		
		val g=gcd(x,y)
		
		def numer=x/g
		def denom=y/g
		
		
		
		
		def + (that:Rational) = {
			new Rational(numer*that.denom+denom*that.numer,denom*that.denom)
		}
		
		def - (that:Rational) = {
			this + -that
		}
		
		def * (that:Rational) = new Rational(numer*that.numer,denom*that.denom)
		
		def < (that:Rational) = {
			if(numer*that.denom<that.numer*denom) {
				true
			}
			else
				false
		}
		
		def max(that:Rational) = {
			if(this < that) {
				that
			}
			else
				this
		}
		
		override def toString = {
			numer + "/"+denom
		}
		
		def unary_- = {
			new Rational(-numer,denom)
		}
		
	}
	val x = new Rational(1,2)                 //> x  : practice4.Rational = 1/2
	x.numer                                   //> res0: Int = 1
	x.denom                                   //> res1: Int = 2
	
	val y = new Rational(2,3)                 //> y  : practice4.Rational = 2/3
	
	val z = x+ (y)                            //> z  : practice4.Rational = 7/6
	
	println(z)                                //> 7/6
	
	val w = y-(x)                             //> w  : practice4.Rational = 1/6
	
	println(w*(z))                            //> 7/36
	
	println( (new Rational(1,4))+(new Rational(1,4)) )
                                                  //> 1/2
	
	println(w)                                //> 1/6

	z<(w)                                     //> res2: Boolean = false
	
	w<(z)                                     //> res3: Boolean = true
	
	z.max(w)                                  //> res4: practice4.Rational = 7/6
	
	w.max(z)                                  //> res5: practice4.Rational = 7/6
	
	//println(new Rational(1,0))
	
	println(new Rational(19))                 //> 19/1
}