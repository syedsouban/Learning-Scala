package ScalaForImpatient10

package ScalaForImpatient10

trait Language {
  def lang(): Unit
}

trait Functional extends Language {
  override def lang() {
    println("Functional")
  }
}

trait ObjectOriented extends Language {
  override def lang() {
    println("ObjectOriented")
  }
}

class Scala1 extends Functional with ObjectOriented



class Scala2 extends ObjectOriented with Functional





object InheretingFromMultipleTraits {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  new Scala1().lang()                             //> ObjectOriented
	new Scala2().lang()                       //> Functional
}