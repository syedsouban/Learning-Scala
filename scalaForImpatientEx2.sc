import scala.math.sqrt
object scalaForImpatientEx2 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  def signum(x:Int) = {
  	if(x>0)
  		1
  	else if(x<0)
  		-1
  	else
  		0
  }                                               //> signum: (x: Int)Int
  def nto0(n:Int)  {
  	if(n==0)
  		println(0)
  	else {
  		println(n)
  		nto0(n-1)
  	}
  		
  }                                               //> nto0: (n: Int)Unit
  
  
  
  
  
  signum(5)                                       //> res0: Int = 1
  signum(-3)                                      //> res1: Int = -1
  signum(0)                                       //> res2: Int = 0
  //type and value of empty block expression
  val ebe = {}                                    //> ebe  : Unit = ()
  
  for (i <- (0 to 10).reverse) println(i);        //> 10
                                                  //| 9
                                                  //| 8
                                                  //| 7
                                                  //| 6
                                                  //| 5
                                                  //| 4
                                                  //| 3
                                                  //| 2
                                                  //| 1
                                                  //| 0
	nto0(10)                                  //> 10
                                                  //| 9
                                                  //| 8
                                                  //| 7
                                                  //| 6
                                                  //| 5
                                                  //| 4
                                                  //| 3
                                                  //| 2
                                                  //| 1
                                                  //| 0
	                                                  
	val s="Hello"                             //> s  : String = Hello
  var product=1                                   //> product  : Int = 1
  for(e <- s) {
  	product=product*e
  }
  product                                         //> res3: Int = 825152896
  
  s.foldLeft(1)(_*_)                              //> res4: Int = 825152896
  
  def power(x:Int,n:Int):Double = {
  	if(n==0) 1
  	else if(n>0) {
  		if(n%2==0) {
  			var p=power(x,n/2)
  			p*p
  		}
  		else{
  			x*power(x,n-1)
  		}
  	}
  	else {
  		1/power(x,-n)
  	}
  }                                               //> power: (x: Int, n: Int)Double
  
  power(2,-2)                                     //> res5: Double = 0.25
  
}