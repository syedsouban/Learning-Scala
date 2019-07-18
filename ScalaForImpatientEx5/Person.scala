package ScalaForImpatientEx5

import scala.beans.BeanProperty

class Person(fullName:String) {
  
  @BeanProperty val firstName=fullName.split(" ")(0)
  @BeanProperty val lastName=fullName.split(" ")(1)
  
  private var privateAge = 0
  def age = privateAge  
  
  def age_=(newValue: Int) {
  if (newValue > privateAge)
    privateAge = newValue; 
  }
  
  
  

  
}
