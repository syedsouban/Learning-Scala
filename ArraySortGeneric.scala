
import scala.math.Ordering;
object ArraySortGeneric {
  
  def sort[T](x:Array[T])(implicit ord:Ordering[T]) = {
    for(i <- 0 until x.length) {
      for(j <-0 until x.length) {
        if(ord.lt(x(i),x(j))) {
          var t= x(i)
          x(i)=x(j)
          x(j)=t
        }
      }
    }
    for(e <- x) {
      print(e+",")
    }
  }
  
  def main(args:Array[String]) {
    
//    (sort(Array("hello","world","eclpise","scala"))(Ordering[String]))
      (sort(Array("hello","world","eclpise","scala")))
  }
}