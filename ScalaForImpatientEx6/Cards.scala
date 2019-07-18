package ScalaForImpatientEx6

object Cards extends Enumeration {
	type Cards = Value
	val Club = Value("♣")
	val Diamond = Value("♦")
	val Heart = Value("♥")
	val Spade = Value("♠")
	def main(args:Array[String]) {
	  println(Cards.Club)
	}
}