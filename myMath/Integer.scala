package myMath;

class Integer(x:Int) {
		
		
		def get=x
		
		
		
		
		def + (that:Integer) = {
			new Integer(get+that.get)
		}
		
		def - (that:Integer) = {
			new Integer(get-that.get)
		}
		
		
		
		
	
		
		override def toString = {
			get.toString
		}
		
		
		
	}