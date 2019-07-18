package ScalaForImpatientEx8

abstract class Shape {
  
  def centerPoint()
  
}


class Quadrileteral(p1:Point,p2:Point,p3:Point,p4:Point) extends Shape {
  
  override def centerPoint() = {
    
    (p1+p2+p3+p4)/4
    
  }
  
  override def toString() = "{" +p1+","+p2+","+p3+","+","+p4 + "}"
 
}
