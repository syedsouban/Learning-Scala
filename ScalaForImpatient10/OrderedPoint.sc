package ScalaForImpatient10

object OrderedPointWS {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  val A = new OrderedPoint(2,4)                   //> A  : ScalaForImpatient10.OrderedPoint = ScalaForImpatient10.OrderedPoint[x=2
                                                  //| ,y=4]
  
  
  val B = new OrderedPoint(2,4)                   //> B  : ScalaForImpatient10.OrderedPoint = ScalaForImpatient10.OrderedPoint[x=2
                                                  //| ,y=4]
	A<B                                       //> res0: Boolean = false
	A>B                                       //> res1: Boolean = false
	A==B                                      //> res2: Boolean = true
  
}