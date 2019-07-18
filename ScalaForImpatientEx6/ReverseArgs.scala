package ScalaForImpatientEx6

object ReverseArgs extends App {
  args.reverse.foreach(arg=>{
    println(arg)
  })
}