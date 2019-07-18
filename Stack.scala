
//generic polymorphism Scala
class Stack[A] {
  private var elements: List[A] = Nil
  def push(x: A) { elements = x :: elements }
  def peek: A = elements.head
  def pop(): A = {
    val currentTop = peek
    elements = elements.tail
    currentTop
  }
}

object Main {
  
  def main(args: Array[String]) {
    val stack:Stack[Int] = new Stack[Int]
    
    stack.push(1)
    stack.push(2)
    println(stack.pop())
    println(stack.peek)
  }
}
