package ScalaForImpatientEx5

object Q5_ws {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  val st=new Student(1234,"Souban")               //> st  : ScalaForImpatientEx5.Student = ScalaForImpatientEx5.Student@880ec60
  st.getName                                      //> res0: String = Souban
  st.getId                                        //> res1: Long = 1234
  val student=new Person("Syed Souban")           //> student  : ScalaForImpatientEx5.Person = ScalaForImpatientEx5.Person@30c7da1
                                                  //| e
  student.getFirstName                            //> res2: String = Syed
}