object practice {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  1+1                                             //> res0: Int(2) = 2
  2+2                                             //> res1: Int(4) = 4
  def sayHello() {
  	println("Hello world")
  }                                               //> sayHello: ()Unit
  sayHello()                                      //> Hello world
  def sum(a:Int,b:Int=1){
  	println("The sum of a and b is "+(a+b))
  }                                               //> sum: (a: Int, b: Int)Unit
  sum(1)                                          //> The sum of a and b is 2
  
  def sum1(a:Int,b:Int):Int = {
  	a+b
  }                                               //> sum1: (a: Int, b: Int)Int
  println(sum1(1,7))                              //> 8
  1+1                                             //> res2: Int(2) = 2
 
  for(ch <- "hello world") println(ch)            //> h
                                                  //| e
                                                  //| l
                                                  //| l
                                                  //| o
                                                  //|  
                                                  //| w
                                                  //| o
                                                  //| r
                                                  //| l
                                                  //| d
                                                  
	for(i <- 1 until 10) {
		println(i)                        //> 1
                                                  //| 2
                                                  //| 3
                                                  //| 4
                                                  //| 5
                                                  //| 6
                                                  //| 7
                                                  //| 8
                                                  //| 9
	}
	
	
  
}