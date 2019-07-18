package ScalaForImpatientEx8
import java.io._
object SerializationInScala extends App {
  
  val point = new Point(1,2)
  
  val out = new ObjectOutputStream(new FileOutputStream("test.obj"))
  out.writeObject(point)
  out.close()
  val in = new ObjectInputStream(new FileInputStream("test.obj"))
  val savedPoint = in.readObject().asInstanceOf[Point]
  println(savedPoint)
  
}