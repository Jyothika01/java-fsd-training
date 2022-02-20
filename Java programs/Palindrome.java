//Write a program to take an input of a string with multiple words and convert it into a string array,
//and check if every element of that array is a Palindrome.
//Note: Palindrome is a word which when reveresed also is the same.
//example:-
//MOM
package training_java;

import java.util.Scanner;

public class Palindrome {
	static boolean Palin(String str)
	{
		int x=0,y=str.length()-1;
		while(x<y)
		{
			if(str.charAt(x)!=str.charAt(y))
			{
				return false;
			}
			x++;
			y--;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the number of words : "); 
		int len = sc.nextInt();
		System.out.print("Enter the words : "); 
		String[] s2 = new String[len];
		for(int i=0;i<len;i++)
		{
			s2[i] = sc.next();
			
		}
		for(int i=0;i<len;i++)
		{
			if(Palin(s2[i]))
			{
				System.out.println(s2[i]+" is palindrome"); 
			}
			else
			{
				System.out.println(s2[i]+" is not a palindrome"); 
			}
			
		}
		

	}

}
