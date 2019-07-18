
import scala.annotation.tailrec

object learningTailRec {
   
	@tailrec
  def tailRecSum(list:List[Int],acc:BigInt=0):BigInt = {
  	
  	list match {
  		case Nil =>  acc
  		//case head::tail => head+tailRecSum(tail)
  		case head::tail => tailRecSum(tail,acc+head)
  	}
  	  	
  }
	
	@tailrec
	def nto0(n:Int)  {
  	if(n==0)
  		println(0)
  	else {
  		println(n)
  		nto0(n-1)
  	}
  		
  } 
	
	
	def headRecSum(list:List[Int]):BigInt = {
  	
  	list match {
  		case Nil =>  0
  		case head::tail => head+headRecSum(tail)
  	} 	
  }
  
  
  def main(args:Array[String]) {
    
<<<<<<< HEAD
   val range:Int=10000
=======
   val range:Int=10000000
>>>>>>> cc693cad8e4a2a38cc9b9d245415743e3de8aadc
   val t1 = System.nanoTime

	 val sum1=headRecSum((1 to 4000).toList)

	 val duration1 = (System.nanoTime - t1) / 1e9d
  
	 println("Time taken by head recursion to sum 1 to 4000 is: "+duration1)
  
   val list=(1 to range).toList
   val t2 = System.nanoTime

	 val sum2=tailRecSum(list)

	 val duration2 = (System.nanoTime - t2) / 1e9d
  
	 println("Time taken by tail recursion to sum 1 to "+range+ " is: "+duration2)
   
   val t3 = System.nanoTime

	 

   var sum3=0
   for(i <- 1 to range) {
     sum3=sum3+i
   }
	 val duration3 = (System.nanoTime - t3) / 1e9d
  
	 println("Time taken by for expression recursion to sum 1 to "+range+ " is: "+duration3)



  
  }
}