package ScalaForImpatientEx5

object Q1_main {
  def main(args:Array[String]) {
    
    var counter = new Counter_Q1(Int.MaxValue)
    
    counter.increment()
    counter.increment()
    counter.increment()
    println(counter.current)
    
  }
}