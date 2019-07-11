

case class Number(val x:Int) {
  
  override def toString = x.toString
}

object UnderstandingApply {
  def main(args: Array[String]) = {
    println("HelloWorld")
    val a:Number = Number(2)
    println(a)
  }
  
  
}