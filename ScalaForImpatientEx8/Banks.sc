package ScalaForImpatientEx8



object Banks {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  val generalBA=new BankAccount(100)              //> generalBA  : ScalaForImpatientEx8.BankAccount = ScalaForImpatientEx8.BankAcc
                                                  //| ount@880ec60
  generalBA.deposit(100)                          //> res0: Double = 200.0
  
	//generalBA.withdraw(300)
	val checkingBA=new CheckingAccount(3000)  //> checkingBA  : ScalaForImpatientEx8.CheckingAccount = ScalaForImpatientEx8.Ch
                                                  //| eckingAccount@3f3afe78
	
	checkingBA.withdraw(2900)                 //> res1: Double = 0.0
	
	checkingBA.deposit(300)                   //> res2: Double = 200.0
	
	val savingsA = new SavingsAccount(1000)   //> savingsA  : ScalaForImpatientEx8.SavingsAccount = ScalaForImpatientEx8.Savin
                                                  //| gsAccount@7f63425a
	
	savingsA.deposit(100)                     //> res3: Double = 1100.0
	
	savingsA.withdraw(200)                    //> res4: Double = 900.0
	
	savingsA.deposit(300)                     //> res5: Double = 1200.0
	
	savingsA.deposit(100)                     //> res6: Double = 1290.0
	
	
	
	savingsA.earnMonthlyInterest()            //> res7: Double = 1328.7
	
	savingsA.deposit(200)                     //> res8: Double = 1528.7
	
	savingsA.earnMonthlyInterest()            //> res9: Double = 1574.5610000000001

	savingsA.withdraw(1590)                   //> java.lang.Exception: Not sufficient balance to withdraw amount
                                                  //| 	at ScalaForImpatientEx8.BankAccount.withdraw(BankAccount.scala:17)
                                                  //| 	at ScalaForImpatientEx8.SavingsAccount.withdraw(BankAccount.scala:89)
                                                  //| 	at ScalaForImpatientEx8.Banks$.$anonfun$main$1(ScalaForImpatientEx8.Bank
                                                  //| s.scala:36)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.$anonfun$$ex
                                                  //| ecute$1(WorksheetSupport.scala:76)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.redirected(W
                                                  //| orksheetSupport.scala:65)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.$execute(Wor
                                                  //| ksheetSupport.scala:76)
                                                  //| 	at ScalaForImpatientEx8.Banks$.main(ScalaForImpatientEx8.Banks.scala:5)
                                                  //| 	at ScalaForImpatientEx8.Banks.main(ScalaForImpatientEx8.Banks.scala)
}