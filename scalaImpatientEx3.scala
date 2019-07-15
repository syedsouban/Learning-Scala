

object scalaImpatientEx3 {
  def main(args:Array[String]) {
    
    for(e <- java.util.TimeZone.getAvailableIDs) {
      
      
      if(e.startsWith("America"))
      print(e.substring(8)+" ")
    }
    
  }
}