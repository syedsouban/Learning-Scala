package ScalaForImpatientEx5

import scala.beans.BeanProperty

class BankAccount(private var balance:Double) {
  def withdraw(amount:Double) {
    balance=balance-amount
  }
  def deposit(amount:Double) {
    balance=balance+amount
  }
  def getBalance=balance
  
  
  
}