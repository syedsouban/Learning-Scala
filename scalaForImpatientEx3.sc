import scala.sys.SystemProperties

object scalaForImpatientEx3 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  val n:Int=100                                   //> n  : Int = 100
  val a = new Array[Int](n)                       //> a  : Array[Int] = Array(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0
                                                  //| , 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                                                  //|  0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 
                                                  //| 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0
                                                  //| , 0, 0, 0, 0, 0, 0)
  
  for(i <- 0 until a.length) {
  	a(i)=scala.util.Random.nextInt(n)
  }
  
  a.mkString(",")                                 //> res0: String = 56,31,82,41,63,95,34,99,0,79,21,54,46,92,83,35,37,23,35,5,53,
                                                  //| 88,54,40,89,14,77,23,23,75,13,35,91,65,43,48,29,59,44,6,79,18,83,16,72,11,67
                                                  //| ,41,89,62,35,19,6,41,15,33,17,95,17,30,98,40,66,12,21,53,40,36,58,94,5,27,60
                                                  //| ,21,38,65,86,30,45,42,30,65,1,94,84,19,9,55,91,96,96,50,59,43,20,23,63,88,20
                                                  //| ,89

	val arr=Array(1,2,3,4,5)                  //> arr  : Array[Int] = Array(1, 2, 3, 4, 5)
	
	for(i <- 0 until arr.length-1) {
		var t:Int=0
		t=a(i)
		a(i)=a(i+1)
		a(i+1)=t
	}
	arr.mkString(",")                         //> res1: String = 1,2,3,4,5
	
	val inputArr=Array(-5,3,-1,0,2,-4,-6,8,0,-3)
                                                  //> inputArr  : Array[Int] = Array(-5, 3, -1, 0, 2, -4, -6, 8, 0, -3)
	
	val posnegarr=inputArr.partition(x=>x>=0) //> posnegarr  : (Array[Int], Array[Int]) = (Array(3, 0, 2, 8, 0),Array(-5, -1, 
                                                  //| -4, -6, -3))
	
	posnegarr._1                              //> res2: Array[Int] = Array(3, 0, 2, 8, 0)
  var outputArr= new Array[Int](inputArr.length)  //> outputArr  : Array[Int] = Array(0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
  
  val poszero=posnegarr._1.partition(x=>x!=0)     //> poszero  : (Array[Int], Array[Int]) = (Array(3, 2, 8),Array(0, 0))
  
  outputArr=poszero._1 ++ poszero._2 ++ posnegarr._2
  
	outputArr.mkString(",")                   //> res3: String = 3,2,8,0,0,-5,-1,-4,-6,-3
	
	def computeAverage(dar:Array[Double]) = {
		dar.sum/dar.length
	}                                         //> computeAverage: (dar: Array[Double])Double
	
	println(computeAverage(Array[Double](1,2,3.8)))
                                                  //> 2.2666666666666666
  outputArr.distinct                              //> res4: Array[Int] = Array(3, 2, 8, 0, -5, -1, -4, -6, -3)
  
  
	for((k,v) <- new SystemProperties()) {
		println(k+" "+v)                  //> java.runtime.name OpenJDK Runtime Environment
                                                  //| sun.boot.library.path /usr/lib/jvm/java-8-openjdk-amd64/jre/lib/amd64
                                                  //| java.vm.version 25.212-b03
                                                  //| java.vm.vendor Oracle Corporation
                                                  //| java.vendor.url http://java.oracle.com/
                                                  //| path.separator :
                                                  //| java.vm.name OpenJDK 64-Bit Server VM
                                                  //| file.encoding.pkg sun.io
                                                  //| user.country IN
                                                  //| sun.java.launcher SUN_STANDARD
                                                  //| sun.os.patch.level unknown
                                                  //| java.vm.specification.name Java Virtual Machine Specification
                                                  //| user.dir /home/souban
                                                  //| java.runtime.version 1.8.0_212-8u212-b03-0ubuntu1.18.04.1-b03
                                                  //| java.awt.graphicsenv sun.awt.X11GraphicsEnvironment
                                                  //| java.endorsed.dirs /usr/lib/jvm/java-8-openjdk-amd64/jre/lib/endorsed
                                                  //| os.arch amd64
                                                  //| java.io.tmpdir /tmp
                                                  //| line.separator 
                                                  //| 
                                                  //| java.vm.specification.vendor Oracle Corporation
                                                  //| os.name Linux
                                                  //| sun.jnu.encoding UTF-8
                                                  //| java.library.path /usr/java/packages/lib/amd64:/usr/lib/x86_64-linux-gnu/jni
                                                  //| :/lib/x86_64-linux-gnu:/usr/lib/x86_64-linux-gnu
                                                  //| Output exceeds cutoff limit.
	}
	
}