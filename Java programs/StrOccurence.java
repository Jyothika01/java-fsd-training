//Write a program to check for the occurance of a particular character in a string and display howmany times it has occured.
//note: take the String  and the character to be checked as a input from the user.
package training_java;

import java.util.Scanner;

public class StrOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);   
		System.out.print("Enter the string : "); 
		String str1= sc.nextLine();
		System.out.print("Enter the character : "); 
		char c = sc.next().charAt(0);
		int count=0;
		for(int i=0;i<str1.length();i++)
		{
			if(str1.charAt(i)==c)
			{
				count++;
				
			}
		}
		System.out.print(c+" is present" +count+"times"); 

	}

}
