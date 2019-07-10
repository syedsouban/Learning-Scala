object practice3 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
	var nums = new Array[Int](10)             //> nums  : Array[Int] = Array(0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
	
	for(e <- nums)
		println(e)                        //> 0
                                                  //| 0
                                                  //| 0
                                                  //| 0
                                                  //| 0
                                                  //| 0
                                                  //| 0
                                                  //| 0
                                                  //| 0
                                                  //| 0
	
	def sum(f:(Int)=>Int,a:Int,b:Int):Int = {
		if(a>b) 0
		else
		f(a)+sum(f,a+1,b);
	}                                         //> sum: (f: Int => Int, a: Int, b: Int)Int
	
	def sumCubes(a:Int,b:Int) = sum(x=>x*x*x,a,b)
                                                  //> sumCubes: (a: Int, b: Int)Int
	def sumSquares(a:Int,b:Int) = sum(x=>x*x,a,b)
                                                  //> sumSquares: (a: Int, b: Int)Int
	
	sumCubes(1,3)                             //> res0: Int = 36
	sumSquares(3,5)                           //> res1: Int = 50
	
	def currySum(f:Int=>Int):(Int,Int)=>Int = {
		def sumF(a:Int,b:Int):Int = {
			if(a>b) 0
			else
			f(a)+sumF(a+1,b)
		}
		sumF
	}                                         //> currySum: (f: Int => Int)(Int, Int) => Int
	
	def sqsum=currySum(x=>x*x)                //> sqsum: => (Int, Int) => Int
	sqsum(1,10)                               //> res2: Int = 385
	def cube (x:Int)=x*x*x                    //> cube: (x: Int)Int
	currySum(cube)(1,10)                      //> res3: Int = 3025
	
	def mapReduce(f:Int=>Int,combine:(Int,Int)=>Int,zero:Int)(a:Int,b:Int):Int =
	{
		if(a>b) zero
		else
		combine(f(a),mapReduce(f,combine,zero)(a+1,b))
	}                                         //> mapReduce: (f: Int => Int, combine: (Int, Int) => Int, zero: Int)(a: Int, b:
                                                  //|  Int)Int
	
	def product(a:Int,b:Int) = mapReduce(x=>x,(x,y)=>x*y,1)(a,b)
                                                  //> product: (a: Int, b: Int)Int
	
	product(1,5)                              //> res4: Int = 120
	
	
	
	def increment1(x:Int) = x+1               //> increment1: (x: Int)Int
	
	val increment2 = (x:Int)=>x+1             //> increment2  : Int => Int = practice3$$$Lambda$20/788117692@5d624da6
	
	increment1(23)                            //> res5: Int = 24
	increment2(23)                            //> res6: Int = 24
	
	
	
	
	
	
	
}