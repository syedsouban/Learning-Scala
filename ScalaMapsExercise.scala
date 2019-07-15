import scala.sys.SystemProperties


object ScalaMapsExercise {
  
  def minmax(values: Array[Int])={
    
    (values.min,values.max)    
    
  }
  
  def main(args: Array[String]) {
    
    val sysprops = new SystemProperties 
    
    var keys = (sysprops).keySet
    
    val maxKeyLength = keys map(_.length) max
    
    println(maxKeyLength)   
    for((k,v) <- sysprops) {
      println(f"$k%38s | $v")
    }
      
    val tuple:Tuple2[Int,Int]=minmax(Array(4,-2,12,-9,3,1,0))
    println(tuple._1+" "+tuple._2)
  }
}