package ScalaForImpatientEx8

object Items {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  val pen:Item = new SimpleItem(10,"Pen")         //> pen  : ScalaForImpatientEx8.Item = ScalaForImpatientEx8.SimpleItem@36d64342
  val pencil:Item =  new SimpleItem(3,"Pencil")   //> pencil  : ScalaForImpatientEx8.Item = ScalaForImpatientEx8.SimpleItem@39ba5a
                                                  //| 14
  val notebook=new SimpleItem(15,"Notebook")      //> notebook  : ScalaForImpatientEx8.SimpleItem = ScalaForImpatientEx8.SimpleIte
                                                  //| m@511baa65
  
  val textbook=new SimpleItem(150,"TextBook")     //> textbook  : ScalaForImpatientEx8.SimpleItem = ScalaForImpatientEx8.SimpleIte
                                                  //| m@340f438e
  
  val stationeryItems:Bundle = new Bundle(List(pen,pencil,new Bundle(List(notebook,textbook),"Books to carry")),"Things to put in bag")
                                                  //> stationeryItems  : ScalaForImpatientEx8.Bundle = ScalaForImpatientEx8.Bundle
                                                  //| @2ed94a8b
  
  stationeryItems.price                           //> res0: Double = 178.0
  
  
  
}