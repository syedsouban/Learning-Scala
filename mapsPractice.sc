object mapsPractice {
  println("Welcome to the Scala worksheet")
  
  var ratings = Map(("A",5),("B",4),("C",5),("D",3))
  
  ratings("A")
  
  var ratingsOfZ=ratings.get("Z")
  ratingsOfZ match {
  	case Some(rating) => "The ratings of the person is "+rating
  	case None => "The given person does not have any rating"
  }
  
  
  
  for((k,v) <- ratings) {
  	println("The rating of "+k+" is "+v)
  }
	
 
 	val noGizmoPrice = Map(1->10,2->15,3->17,4->20)
 	
 	val noGizmoPriceDiscounted = new scala.collection.mutable.LinkedHashMap[Int,Double];
 	
 	for((noOfGizmo,price) <- noGizmoPrice) {
 		noGizmoPriceDiscounted(noOfGizmo)=0.9*price
 	}
                                 val in = new java.util.Scanner(new java.io.File(""))
            val in = new java.util.Scanner(new java.io.File(""))
	while (in.hasNext()) {val in = new java.util.Scanner(new java.io.File(""))
	while (in.hasNext()) {
		println(in.next())
	}
	
	
		println(in.next())
	}
	
	
	while (in.hasNext()) {
		println(in.next())
	}
	
	                 
	for((n,p) <- noGizmoPriceDiscounted) {
		println("Discounted price of "+n+" gizmos is "+p)
	}
	
	
  
}