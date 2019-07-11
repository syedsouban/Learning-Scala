
import scala.collection.mutable.ArrayBuffer;
object Arrays {
  def main(args:Array[String]):Unit = {
    val names = new ArrayBuffer[String]
    
    val values=Array(1,2,3,4,5)
    val valuesBuffer=ArrayBuffer(1,2,3,4,5)
    
    names += "Syed"
    
    names += "Souban"
    
    names.insert(1,"A","B")
    
    names.remove(2)
    
    for(name <- names) {
      println(name)
    }
    
   
    names.toArray
    
  }
}