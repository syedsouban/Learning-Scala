package ScalaForImpatientEx5

object Q2_ws {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  var bankaccount=new BankAccount(1000)           //> bankaccount  : ScalaForImpatientEx5.BankAccount = ScalaForImpatientEx5.BankA
                                                  //| ccount@880ec60
  bankaccount.deposit(200)
  bankaccount.getBalance                          //> res0: Double = 1200.0
  bankaccount.withdraw(100)
  bankaccount.getBalance                          //> res1: Double = 1100.0
}