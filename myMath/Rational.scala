package myMath;

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