object practice6 {
	val dish="Tahari"                         //> dish  : String = Tahari
	val rating = dish match {
		case "Veg Biryani"|"Veg Pulao" => 4
		case "Chicken Biryani"|"Tahari" => 5
		case _ => 1
	}                                         //> rating  : Int = 5
	println(rating)                           //> 5
	
	val someThing:Any=12                      //> someThing  : Any = 12
	
	val typeOfSomething = someThing match {
		case someThing:Int => "Int"
		case someThing:Double => "Double"
	}                                         //> typeOfSomething  : String = Int
	
	println(typeOfSomething)                  //> Int
	
	val userName:Option[String]=Some("Syed Souban")
                                                  //> userName  : Option[String] = Some(Syed Souban)
	
	println(s"${userName.get}")               //> Syed Souban
	
	var getTitle: Option[String]=None         //> getTitle  : Option[String] = None
	
	getTitle=Some("Scala is a beautiful language")
	
	getTitle match  {
  case Some(name) => println(s"Received title name = $name")
  case None       => println(s"No title was found!")
}                                                 //> Received title name = Scala is a beautiful language
	
	def fun:String = {
		"Hello World"
	}                                         //> fun: => String
	
	fun                                       //> res0: String = Hello World
	
	def calculateBill(quantity:Int,couponCode:Option[String]=None):Double = {
	
	couponCode match {
		case Some(coupon) =>
		val discount=0.1
		val totalcost=quantity*0.25*(1-discount)
		totalcost
	
		case None => 2.5*quantity
	
	}
}                                                 //> calculateBill: (quantity: Int, couponCode: Option[String])Double
calculateBill(2,Some("SCALAIT"))                  //> res1: Double = 0.45

calculateBill(2)                                  //> res2: Double = 5.0
	
}