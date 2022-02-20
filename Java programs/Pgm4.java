class Pgm4
{
    static void sample()
    {
        try
        {
            throw new NullPointerException("test");
        }
        catch(NullPointerException e)
        {
            System.out.println("hello world");
            throw e; 
        }
    }
 
    public static void main(String args[])
    {
        try
        {
            sample();
        }
        catch(NullPointerException e)
        {
            System.out.println("demo");
        }
    }
}

or

public class ThrowsKeyword{
  static void checkAge(int age) throws ArithmeticException {
    if (age < 18) {
      throw new ArithmeticException("Access denied - You must be at least 18 years old.");
    }
    else {
      System.out.println("Access granted - You are old enough!");
    }
  }

  public static void main(String[] args) {
    checkAge(15); 
  }
}
