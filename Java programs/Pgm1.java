class Pgm1
{
   public static void main(String args[]) {
      try{  
	 int a=100/0;  
	 System.out.println(a);  
      }  
      catch(ArithmeticException e){
         System.out.println("Number should not be divided by zero");
      }  
      finally{
	 System.out.println("This is finally block");
      }  
   }   
}

or

class pgmm1 {    
  public static void main(String args[])
  {    
  try
  {
  int a=100/0;
  System.out.println(a);    
  }
  catch(NullPointerException e)
  {
  System.out.println(e);
  }
  finally 
  {
  System.out.println("iam in finally block");
  }
     
  }    
}
