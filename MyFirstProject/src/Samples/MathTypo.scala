package Samples

object MathTypo{
  
  def funcDiv(num1 : Double, num2 : Double) : Double = {
    var result : Double = 0
    
    if((num1 > 0) && (num2 >0))
    {
      if(num1 > num2)
      {
         result = num1 / num2
         
      }
    }
    return result
  }
  
  def main(args: Array[String]): Unit = {
    println("Result: " + funcDiv(15.5, 1.5))
  }

}