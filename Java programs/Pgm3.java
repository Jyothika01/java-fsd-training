//Write a java program to implement an abstract class with two abstract methods and one non-abstract method.
 
abstract class Demo {
 
	Demo()
    {  
        System.out.println("Demo");
    }
  
    abstract void fun();
}
 
class Test extends Demo  {
 
	Test()
    {
        System.out.println("Test");
    }
 
    void fun()
    {
        System.out.println("Test class");
    }
}
class Pgm3 {
 
    public static void main(String args[])
    {
    	Test d = new Test();
        d.fun();
    }
}
