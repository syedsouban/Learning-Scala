import scala.collection.SortedMap

object ScalaPlayGroundObject {
  def main(args:Array[String]) {
    
    println("working")
    val symbols=Array("<","-",">")
	  val count=Array(3,12,3)
	  for((s,c) <- symbols.zip(count)) {
		  print(s*c)
	  }
    
    val currentDirectory = new java.io.File(".").getCanonicalPath
    
    println(currentDirectory)
    
    var in = new java.util.Scanner(new java.io.File(currentDirectory+"/martinwiki.txt"))
                                                  
	  var mutableWordMap=new scala.collection.mutable.TreeMap[String,Int];
    var immutableWordMap=new scala.collection.immutable.TreeMap[String,Int];
    
    
    while (in.hasNext()) {
		    val next=in.next().toLowerCase()
		    
		    val count=immutableWordMap.getOrElse(next,0)+1
		    immutableWordMap = immutableWordMap + (next->count)
		    mutableWordMap(next)=count
	  }
    
    for((word,count) <- mutableWordMap) {
      println("\""+word+"\""+" is repeated "+count+" number of times")
    }

    
    for((word,count) <- immutableWordMap) {
      println("\""+word+"\""+" is repeated "+count+" number of times!2")
    }
    
    
    
    
    
    
	
	
    
  }
}