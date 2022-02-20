package milestone_1;
interface Cat
{
	void cry();
	void run();
}
class BabyCat implements Cat
{
	public void cry() 
	{
		System.out.println("BabyCat is crying");
	}
	public void run() 
	{
		System.out.println("BabyCat is running");
	}
}
public class Pgm11 {
public static void main(String[] args) {
	
	Cat obj = new BabyCat();
	obj.cry();
	obj.run();

}
}
