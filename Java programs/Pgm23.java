package milestone_1;
public class Pgm23 {

	public static void main(String[] args) {
		int i=1;
		a:
		while(i<=10)
		{
			if(i>=11)
			{
				break a;// labeled break
			}
			System.out.println("i= "+i);
			i++;
		}
		System.out.println("Out of while loop");
	}

}