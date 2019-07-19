package ScalaOperators


class UsersList {
  
  private var list = Map(1->"Syed",2->"Souban")
  
  def update(id:Int,name:String) {
    
    list=list+(id->name)
    
  }
  
  def apply(id:Int) = {
    list(id)
  }
  
}


object ApplyAndUpdate extends App{
  
  val users=new UsersList()
  
  println(users(1))
  
  users(3)="Shaan"
  
  println(users(3))
  
  
  
}