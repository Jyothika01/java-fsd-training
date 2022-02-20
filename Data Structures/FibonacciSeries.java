//Program to take a number from the user and print the Fibanocci series until that number.

package datastruc_day12;
import java.util.Scanner;
public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the term to be printed");
		Scanner ob = new Scanner(System.in);
		int a = 1;
		int b= 0;
		int ch = ob.nextInt();
		for(int i=0;i<ch;i++)
		{
			System.out.print(b);
			b = a + b;
			a = b - a;
			if(i <= ch -2)
			{
				System.out.print(" , ");
			}
			if(i == ch -1)
			{
				System.out.println(".\nThese are the first" + ch + " Fibonacci Numbers");
			}
		}

	}

}
