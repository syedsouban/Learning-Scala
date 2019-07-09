
import scala.io.StdIn.{readInt}
object ArraySum {
  def main(args: Array[String]) {
    val nums = new Array[Int](10);
    for(i <- 0 until 10) {
      nums(i)=readInt()
    }
    for(num <- nums) {
      print(num+" ")
    }
  }
}