package milestone_1;
public class Overriding {
	public static void main(String[] args) {
	       grape g=new grape();
			g.color();
			g.shape();
			g.taste();	}
}
	class Fruits {
		static public void shape()
		{
			System.out.println("Fruits shape");
		}
		static void taste()
		{
			System.out.println("Fruits taste");
		}
	}
	class grape extends Fruits{
		static public void shape() {  
			System.out.println("Grapes shape ");
		}
		static public void color()
			{
				System.out.println("Grapes color");
			}
			}