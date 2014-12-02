package Samples

object MainObj {

	 def tri(row:Int):List[Int] = { row match {
	  case 1 => List(1)
	  case n:Int => List(1) ::: ((tri(n-1) zip tri(n-1).tail) map {case (a,b) => a+b}) ::: List(1)
	  }
	 }

     def prettytri(n:Int) = (1 to n) foreach {
		 i=>print(" "*(n-i)); tri(i) map (c=>print(c+" ")); 
		 println}


  def main(args: Array[String]): Unit = {
    println("Hello Scala !!")
    prettytri(5)
  }

}