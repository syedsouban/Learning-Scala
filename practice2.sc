object practice2 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
	for (i <- 1 to 3; from = 4 - i; j <- from to 3) println((10 * i + j) + " ")
                                                  //> 13 
                                                  //| 22 
                                                  //| 23 
                                                  //| 31 
                                                  //| 32 
                                                  //| 33 
	for(i <- 100 to 110) yield i%10           //> res0: scala.collection.immutable.IndexedSeq[Int] = Vector(0, 1, 2, 3, 4, 5, 
                                                  //| 6, 7, 8, 9, 0)
                                                  
	def sum1(args: Int*) = {
		var total=0
		for(arg <- args){
			total+=arg
		}
		total
	}                                         //> sum1: (args: Int*)Int
	//println(sum1(1,1,2,3))
	var c=12;                                 //> c  : Int = 12
	var d=12;                                 //> d  : Int = 12
	
	//declaring a expression as def vs var
	//when we declare a expression as def it is called by name
	//i.e the expression gets computed everytime it is accessed
	//whereas when we declare an expression as var it is computed once
	//the below example shows how
	def a={c=c+1;c*2};                        //> a: => Int
	var b={d=d+1;d*2};                        //> b  : Int = 26
	println(a)                                //> 26
	println(a)                                //> 28
	println(b)                                //> 26
	println(b)                                //> 26
}


//lazy val words = scala.io.Source.fromFile("/usr/share/dict/words").mkString