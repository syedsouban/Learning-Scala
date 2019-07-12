object practice8 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  
  //Fold vs reduce
  
  var list1 = List(15,25,23,22,17,21)             //> list1  : List[Int] = List(15, 25, 23, 22, 17, 21)
  
  list1.reduceLeft(_+_)                           //> res0: Int = 123
  list1.reduceRight(_+_)                          //> res1: Int = 123
  
  list1.reduceLeft(_-_)                           //> res2: Int = -93
  list1.reduceRight(_-_)                          //> res3: Int = -13
  
  list1.foldLeft(0)(_+_)                          //> res4: Int = 123
  
  list1.foldLeft(0)(_-_)                          //> res5: Int = -123
  
  list1.foldLeft(1)(_*_)                          //> res6: Int = 67740750
  
  list1.foldLeft("")(_+_+",")                     //> res7: String = 15,25,23,22,17,21,
	list1.foldRight("")(","+_+_)              //> res8: String = ,15,25,23,22,17,21
	
	
	
	def isPrime(n:Int): Boolean = {
		2 until n forall(d=>n%d!=0)
	}                                         //> isPrime: (n: Int)Boolean
	
	
	isPrime(2)                                //> res9: Boolean = true
	
	isPrime(5)                                //> res10: Boolean = true
	
	isPrime(12)                               //> res11: Boolean = false
	isPrime(3)                                //> res12: Boolean = true
	
	isPrime(32)                               //> res13: Boolean = false
	
	isPrime(4)                                //> res14: Boolean = false
	
	val n=9                                   //> n  : Int = 9
	(((1 until n) map (i => (1 until i) map (j=>(i,j)))) flatten) filter (pair=>isPrime(pair._1+pair._2))
                                                  //> res15: scala.collection.immutable.IndexedSeq[(Int, Int)] = Vector((2,1), (3,
                                                  //| 2), (4,1), (4,3), (5,2), (6,1), (6,5), (7,4), (7,6), (8,3), (8,5))
	
	for{
		i <- 1 until n
		j <- 1 until i
		if(isPrime(i+j))
	}
	yield (i,j)                               //> res16: scala.collection.immutable.IndexedSeq[(Int, Int)] = Vector((2,1), (3,
                                                  //| 2), (4,1), (4,3), (5,2), (6,1), (6,5), (7,4), (7,6), (8,3), (8,5))

	//def scalarProduct(l1:List[Double],l2:List[Double]) :Double = {
		val l1=List(1,2,3)                //> l1  : List[Int] = List(1, 2, 3)
		val l2=List(4,5,6)                //> l2  : List[Int] = List(4, 5, 6)
		(for{
			xy <- l1 zip l2
		} yield((xy._1*xy._2))).sum       //> res17: Int = 32
	//	0
	//}
	//scalarProduct(List(1,2,3),List(4,5,6))
}