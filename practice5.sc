import scala.collection.mutable.ArrayBuffer;
import scala.util.Sorting._;


object practice5 {
	
	
	println("hello")                          //> hello
	
	
	val b = ArrayBuffer[Int]()                //> b  : scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer()
	for(i <- 3 to (10,3))
		println(i)                        //> 3
                                                  //| 6
                                                  //| 9
	for(i <- 1 to 100 if i%10==0) println(i)  //> 10
                                                  //| 20
                                                  //| 30
                                                  //| 40
                                                  //| 50
                                                  //| 60
                                                  //| 70
                                                  //| 80
                                                  //| 90
                                                  //| 100
  
                                                  
  
	var res = for(i <- 1 to 5) yield i*3      //> res  : scala.collection.immutable.IndexedSeq[Int] = Vector(3, 6, 9, 12, 15)
	for (element <- res)
		println(element)                  //> 3
                                                  //| 6
                                                  //| 9
                                                  //| 12
                                                  //| 15

	Array(1,2,3,4,5).sum                      //> res0: Int = 15


	Array(12,43,435).max                      //> res1: Int = 435
	
	
	var arr = Array(54,23,123,908)            //> arr  : Array[Int] = Array(54, 23, 123, 908)
	
	quickSort(arr)
	
	arr.mkString(",")                         //> res2: String = 23,54,123,908
	
	val name="Souban"                         //> name  : String = Souban
	
	case class Donut(name: String, tasteLevel: Int)
	
	val myDonut:Donut = new Donut("Glazed Donut",12)
                                                  //> myDonut  : practice5.Donut = Donut(Glazed Donut,12)
	
	println(s"Hello, I am $name and my favourite donut is ${myDonut.name}")
                                                  //> Hello, I am Souban and my favourite donut is Glazed Donut
	
	val n1=123                                //> n1  : Int = 123
	val n2=321                                //> n2  : Int = 321
	
	println(s"The sum of $n1 and $n2 is ${n1+n2}")
                                                  //> The sum of 123 and 321 is 444
	val Oneto10 = (1 to 10 by 2)              //> Oneto10  : scala.collection.immutable.Range = inexact Range 1 to 10 by 2
	println(s"${Oneto10.mkString(" ")}")      //> 1 3 5 7 9
                                                  
  Oneto10.foreach(println(_))                     //> 1
                                                  //| 3
                                                  //| 5
                                                  //| 7
                                                  //| 9
	
	
	
}