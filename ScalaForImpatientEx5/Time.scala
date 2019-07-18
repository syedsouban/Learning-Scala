package ScalaForImpatientEx5

class Time(val hrs:Int,val mins:Int) {
  
  private val totalMinutes=hrs*60+mins
  
  require(hrs>=0&&hrs<=23,"Hours should be between 0 and 23")
  require(mins>=0&&mins<=59,"Minutes should be between 0 and 59")
  
  
  def before(other:Time):Boolean = {
    return totalMinutes<other.totalMinutes
  }
}