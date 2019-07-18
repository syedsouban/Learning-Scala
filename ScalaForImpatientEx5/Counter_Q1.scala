package ScalaForImpatientEx5

class Counter_Q1(private var value:Int) {
  
  def increment() {
    
    if(value+1<0)
      value=0
    else
      value=value+1
      
  }
  def current()=value
}