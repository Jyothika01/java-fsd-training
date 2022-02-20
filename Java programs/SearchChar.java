//Write a program to take input of a String and also take in a number of characters as the
//user wishes and check if they are present in the String.
package training_java;

import java.util.*;

public class SearchChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in); 
		System.out.println("Enter the first string  : "); 
		String str1= sc.next(); 
		System.out.println("Enter the no:of characters: ");
		int len = sc.nextInt();
		char[] array1 = new char[len];
		System.out.println("Enter the characters: ");
		for(int i=0;i<len;i++)
		{
			array1[i] = sc.next().charAt(0);
		}
		
		for(int i=0;i<array1.length;i++)
			
		{
			int result=str1.indexOf(array1[i]);
			if(result!=-1)
			{
				System.out.println(array1[i]+" is present and it is a substring ");	
			}
			else
			{
				System.out.println(array1[i]+" is not a substring ");
			}
			
		}
	}

}
