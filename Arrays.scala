
import scala.collection.mutable.ArrayBuffer;
object Arrays {
  def main(args:Array[String]):Unit = {
    val names = new ArrayBuffer[String];
    names += "Syed"
    
    names+= "Souban"
    
    names.insert(1,"A","B")
    
    names.remove(2)
    
    for(name <- names) {
      println(name)
    }
    
    names.toBuffer
    names.toArray
    
  }
}