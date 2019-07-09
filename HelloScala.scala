
import scala.io.StdIn.{readLine, readInt}
object HelloScala {
  def main(args: Array[String]): Unit = {
    
    val name = readLine()
    print("Hello: "+name);
    val age=readInt()
    println(age)
    
    
//    println(fact(5))
  }
  def myf():Int = {
    return 2;
  }
  def fact(n:Int):Int = {
    if(n<=1) 1; else n*fact(n-1);
  }
}