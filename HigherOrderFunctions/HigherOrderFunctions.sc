package HigherOrderFunctions

import scala.math._


object HigherOrderFunctions {
  println("Welcome to the Scala worksheet")
  
  val fun1 = ceil _
  val fun2: Double => Double = ceil

	val fun3: Double => Double = floor
	
	val Charr: (String,Int) => Char = _.charAt(_)
	
	val Charr1 = (_:String).charAt(_:Char)
	
	Charr("syed",2)
	
	Charr("syed",2)
	
  fun1(3.14)
  fun3(3.14)
  
  fun2(3.14)
  
  
  Array(1.23,2.45,3.56,4.2).map(fun1)
  
  Array(1.23,2.45,3.56,4.2).map((x:Double)=>x*3)
 
 //def => methods
  def tripleIt1(x:Double)=3*x
  //val => functions
  val tripleIt2=(x:Double)=>3*x
 	tripleIt1(2)
  tripleIt2(2)
  
  (1 to 9).map("*" * _).foreach(println _)
  //currying function
  val curryTripleProduct1 = (x:Int) => (y:Int) => (z:Int) => {
  	x*y*z
  }
  //currying methods
  def curryTripleProduct2(x:Int)(y:Int)(z:Int) = x*y*z
  
  curryTripleProduct1(1)(2)(3)
  curryTripleProduct2(1)(2)(3)
  
  def values(fun:Int=>Int,low:Int,high:Int) = {
  	
  	(low to high).map(x=>(x,fun(x))).toList
  	
  }
  
  values(x=>x*x*x,1,5)
  
  
  Array(1,2,3).foldLeft(true,_<_)
  
         
}
 
 
 
 
 
 
 
 
 