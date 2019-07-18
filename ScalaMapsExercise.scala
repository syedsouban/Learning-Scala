import scala.sys.SystemProperties


object ScalaMapsExercise {
  
  def minmax(values: Array[Int])={
    
    (values.min,values.max)    
    
  }
  
  def main(args: Array[String]) {
    
    val sysprops = new SystemProperties 
    
    val maxKeyLength = sysprops.keySet map(_.length) max
    
    println(maxKeyLength)   
    
    
    sysprops.foreach(t=> {
      println(f"${t._1}%38s | ${t._2}")
    })
      
    val tuple:Tuple2[Int,Int]=minmax(Array(4,-2,12,-9,3,1,0))
    println(tuple._1+" "+tuple._2)
  }
}