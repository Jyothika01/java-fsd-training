package milestone_1;

abstract class Animals
{
	abstract void run();
	void eat()
	{
		System.out.println("Animals eat");
	}
}
class Domestic extends Animals
{
	void run()
	{
		System.out.println("Domestic Animals can run");
	}
}
class Pgm29
{
	public static void main(String[] args)
	{
		Domestic obj=new Domestic();
		obj.run();
		obj.eat();
	}
}
