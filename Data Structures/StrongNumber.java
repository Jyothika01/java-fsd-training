//Program to find if a particular number is a Strong number.
package datastruc_day12;
import java.util.*;

public class StrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i;
		int fact_n,lastdig;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no:");
		n=sc.nextInt();
		int total =0;
		int temp_n = n;
		while(n != 0)
		{
			i=1;
			fact_n=1;
			lastdig = n%10;
			while(i <= lastdig)
			{
				fact_n = fact_n *i;
				i++;	
			}
			total = total + fact_n;
			n = n/10;
			
		}
		if(total == temp_n)
	       System.out.println(temp_n + "is a strong no");
		else
			System.out.println(temp_n + "is not a strong no");
			System.out.println();
	}

}
