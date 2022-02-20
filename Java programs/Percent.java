import java.util.Scanner;
public class Percent{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter number of classes held:");
		float a = s.nextFloat();
		System.out.println();
		System.out.print("Enter number of classes attended:");
		float b = s.nextFloat();
		float percent = (b/a)*100;
		System.out.println("Percentage of classes attended is:"+percent+"%");
		if(percent<75)
		{
			System.out.println("Candidate is not allow to sit in the exam");
		}
		else {
			System.out.println("Candidate is allow to sit in the exam");
		}
		
	}
}