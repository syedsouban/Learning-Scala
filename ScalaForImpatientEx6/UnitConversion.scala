package ScalaForImpatientEx6

class UnitConversion(val conversionFactor:Double) {
  def convert(value:Double) = {
    value*conversionFactor
  }
  def apply(value:Double) = {
    convert(value)
  }
}

  
  object InchesToCentimetres extends UnitConversion(2.54){}
  
  object gallonsToLitres extends UnitConversion(3.78541){}
  
  
  object MilesToKilometres extends UnitConversion(1.60934){}
  
  
