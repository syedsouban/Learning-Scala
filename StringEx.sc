object StringEx {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  val multiword = "This is a String"              //> multiword  : String = This is a String
  
  
  multiword.split(" ")
  .map(_.length)
  .foreach(x => println("*"*x))                   //> ****
                                                  //| **
                                                  //| *
                                                  //| ******
  
 
  
}