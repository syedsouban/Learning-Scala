import scala.math._
import scala.util.Random;



object scalaForImpatientEx1 {
  def sum(args: Int*) = {  var result = 0 ; for (arg <- args) result += arg ; result}
                                                  //> sum: (args: Int*)Int
  
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  3-(sqrt(3)*sqrt(3))                             //> res0: Double = 4.440892098500626E-16
	"crazy "*3                                //> res1: String = "crazy crazy crazy "
	10 max 2                                  //> res2: Int = 10
	BigInt("2").pow(1024)                     //> res3: scala.math.BigInt = 17976931348623159077293051907890247336179769789423
                                                  //| 0657273430081157732675805500963132708477322407536021120113879871393357658789
                                                  //| 7688144166224928474306394741243777678934248654852763022196012460941194530829
                                                  //| 5208500576883815068234246288147391311054082723716335051068458629823994724593
                                                  //| 8479716304835356329624224137216
                                                  
	//just another example on difference between call by value and call by name
	
	def filename=BigInt(90,new Random()).toString(36)
                                                  //> filename: => String
	val filename1=BigInt(90,new Random()).toString(36)
                                                  //> filename1  : String = 1jk7eroi31nluim354
	
	
	println(filename)                         //> 1lkvcpt6wdblybestg
	println(filename)                         //> 1n5j9xcg81qrdpngj
	
	println(filename1)                        //> 1jk7eroi31nluim354
	println(filename1)                        //> 1jk7eroi31nluim354
	
	filename1.charAt(0)                       //> res4: Char = 1
	filename1.charAt(filename1.length-1)      //> res5: Char = 4
	
	filename1.drop(5)                         //> res6: String = roi31nluim354
	
	filename1.take(5)                         //> res7: String = 1jk7e
	filename1.takeRight(5)                    //> res8: String = im354
	
	
	filename1.drop(5)                         //> res9: String = roi31nluim354
	filename1.dropRight(5)                    //> res10: String = 1jk7eroi31nlu
	
	
	sum(1 to 5: _*)                           //> res11: Int = 15
	
}