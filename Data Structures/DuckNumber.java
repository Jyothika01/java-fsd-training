//Program to find out if a particular number is a duck number.
package datastruc_day12;
import java.util.Scanner;
public class DuckNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no:");
		int num = sc.nextInt();
		int c= 0;
		int r;
		while(num!=0)
		{
			r=num%10;
			if(r==0)
				c++;
				num=num/10;	
		}
		if(c>0)
			System.out.println("Duck number");
			else
				System.out.println("Not Duck number");	
	}

}
