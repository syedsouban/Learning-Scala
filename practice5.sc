import scala.collection.mutable.ArrayBuffer;
import scala.util.Sorting._;


object practice5 {
	
	
	println("hello")
	
	
	val b = ArrayBuffer[Int]()
	for(i <- 3 to (10,3))
		println(i)
	for(i <- 1 to 100 if i%10==0) println(i)
  
                                                  
  
	var res = for(i <- 1 to 5) yield i*3
	for (element <- res)
		println(element)

	Array(1,2,3,4,5).sum


	Array(12,43,435).max
	
	
	var arr = Array(54,23,123,908)
	
	quickSort(arr)
	
	arr.mkString(",")
	
	val name="Souban"
	
	case class Donut(name: String, tasteLevel: Int)
	
	val myDonut:Donut = new Donut("Glazed Donut",12)
	
	println(s"Hello, I am $name and my favourite donut is ${myDonut.name}")
	
	val n1=123
	val n2=321
	
	println(s"The sum of $n1 and $n2 is ${n1+n2}")
	val Oneto10 = (1 to 10 by 2)
	println(s"${Oneto10.mkString(" ")}")
                                                  
  Oneto10.foreach(println(_))
	
	
	
}