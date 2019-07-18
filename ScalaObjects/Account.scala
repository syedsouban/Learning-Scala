package ScalaObjects

class Account private(id:Int,initialBalance:Double) {
 
  private var balance = initialBalance
 
  def deposit(amount: Double) {
    this.balance = amount
  }
  
  def getBalance = balance


}

object Account {
 
  private var lastNumber = 0
  
  def apply(initialBalance:Double):Account = {
    new Account(newUniqueNumber(),initialBalance)
  }  
 
  def newUniqueNumber() = {
    lastNumber += 1
    lastNumber
  }
 
}