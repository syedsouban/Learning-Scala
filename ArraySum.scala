
import scala.io.StdIn.{readInt}
object ArraySum {
  var a:String=_
  def main(args: Array[String]) {
    //println(a)
    val nums = new Array[Int](10);
    for(i <- 0 until 10) {
      nums(i)=readInt()
    }
    a="hello"
    for(num <- nums) {
      print(num+" ")
    }
    println(a)
  }
}