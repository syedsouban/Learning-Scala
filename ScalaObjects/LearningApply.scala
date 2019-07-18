package ScalaObjects

class LearningApply(var a:Int) {
  
  
}
object LearningApply extends App{
  def apply(b:Int) : LearningApply = {
    new LearningApply(b)
  }
  for (c <- TrafficLightColor.values) println(c.id + ": " + c)
}

object TrafficLightColor extends Enumeration {
  val Red, Yellow, Green = Value
}