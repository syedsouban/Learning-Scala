package ScalaForImpatientEx8

object Points {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  new LabeledPoint("Black Thursday", 1929, 230.07)//> res0: ScalaForImpatientEx8.LabeledPoint = 1929.0 230.07 Black Thursday
  
  new Quadrileteral(Point(1,2),Point(10,10),Point(3,4),Point(5,6))
                                                  //> res1: ScalaForImpatientEx8.Quadrileteral = {(1.0,2.0),(10.0,10.0),(3.0,4.0),
                                                  //| ,(5.0,6.0)}
  
}