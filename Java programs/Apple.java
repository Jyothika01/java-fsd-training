//Write a java program to implement an interface with two methods.

interface Fruits
{
 
   public void color();
   public void taste();
}
class Apple implements Fruits
{
   public void color()
   {
	System.out.println("color is red");
   }
   public void taste()
   {
	System.out.println("taste is sweet");
   }
   public static void main(String arg[])
   {
	   Fruits f = new Apple();
	f.color();
   }
}