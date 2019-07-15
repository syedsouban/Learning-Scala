import scala.annotation.tailrec


object learningTailRec {
  println("Welcome to the Scala worksheet")
 
  

  
  
  val t1 = System.nanoTime

	println(tailRecSum((1 to 1000).toList))

	val duration = (System.nanoTime - t1) / 1e9d
  
  
}