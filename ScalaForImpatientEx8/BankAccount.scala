package ScalaForImpatientEx8

class BankAccount(initialBalance:Double) {
  
  val comission=0
  
  protected var balance = initialBalance
  def deposit(amount:Double) = {
    
    balance=balance+amount
    balance
    
  }
  
  def withdraw(amount:Double) = {
    if(balance-amount<0)
      throw new Exception("Not sufficient balance to withdraw amount")
    balance=balance-amount
    balance
    
  }
}
class CheckingAccount(initialBalance: Double) extends BankAccount(initialBalance) {
  
  override val comission = 100
  
  
  
  override def deposit(amount:Double) = {
    
    if(balance-comission+amount<0)
      throw new Exception("Insufficient balance")
    
    balance=balance-comission
    super.deposit(amount)
    
  }
  
  override def withdraw(amount:Double) = {
    
    
    if(balance-comission<0)
      throw new Exception("Insufficient balance")
    balance=balance-comission
    
    super.withdraw(amount)
    
  }
}  

class SavingsAccount(initialBalance:Double) extends BankAccount(initialBalance) {
  
  var freeTransactions=1
  
  override val comission=10
  
  val rateOfInterest=0.03
  
  def earnMonthlyInterest() = {
    
    freeTransactions=0
    super.deposit(balance*rateOfInterest)
    
  }
  
  override def deposit(amount:Double) = {
    
    if(freeTransactions>3) {
      if(balance-comission+amount<0)
        throw new Exception("Insufficient balance")
      balance=balance-comission
    }
      
    freeTransactions+=1
    super.deposit(amount)
    
    
  }
  
  override def withdraw(amount:Double) = {
    
    if(freeTransactions>3) {
      if(balance-comission<0)
        throw new Exception("Insufficient balance")
      balance=balance-comission
    }
      
    freeTransactions+=1  
    super.withdraw(amount)  
    
  }
  
}
