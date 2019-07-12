

object ArraySumGeneric {
  
  def sum[T](x:Array[T])(add: (T,T)=>T)(init:T) = {
    var total=init
    for(e <- x) {
      total=add(total,e)
    }
    total
  }
  
  def main(args:Array[String]) {
    println(sum(Array(1.3,2.5,36,4.2,5.3))((x,y)=>x+y)(0))
  }
}