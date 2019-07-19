package ScalaForImpatient10

class OrderedPoint(x:Int,y:Int) extends java.awt.Point(x,y) with scala.math.Ordered[java.awt.Point] {
  
  def compare(that: java.awt.Point):Int = {
    if(this.x!=that.x) {
      this.x-that.x
    }
    else {
      this.y-that.y
    }
  }
}