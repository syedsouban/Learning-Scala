package ScalaForImpatientEx8

abstract class Item {
  def price:Double
  def description:String
}

class SimpleItem(val price:Double,val description:String) extends Item {
  require(price!=0,"Price cannot be 0")
  require(description!="","Description cannot be empty String")
}

class Bundle(items:Iterable[Item],var description:String) extends Item {
  
  val price:Double = items.map(x=>x.price).sum
  
  
  def setDescription(desc:String) {
    this.description=desc
  }
  
  def addItem(item:Item) {
    
    items.++(Iterable[Item](item))
    
  }
  
}