package ScalaForImpatientEx8

class Point(val x:Double,val y:Double) extends Serializable {
  def + (that:Point) = {
    
    new Point(x+that.x,y+that.y)
    
  }
  
  def / (den:Int) = {
    new Point(x/den,y/den)
  }
  
  override def toString() = "("+x+","+y+")"
}

object Point {
  
  def apply(x:Int,y:Int) = {
    
    new Point(x,y)
    
  }
  
}

class LabeledPoint(val label:String,x:Double,y:Double) extends Point(x,y) {
  
  override def toString() = {
    
    x+" "+y+" "+label
    
  }
  
}