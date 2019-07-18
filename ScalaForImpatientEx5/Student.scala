package ScalaForImpatientEx5

import scala.beans.BeanProperty

class Student(@BeanProperty var id:Long,@BeanProperty var name:String) {
  
}