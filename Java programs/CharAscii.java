//Write a program to input a character array and print the ASCII value of those characters.

package training_java;

import java.util.Scanner;
public class CharAscii {
          public static void main(String args[]) {
	      Scanner s = new Scanner(System.in);
	      System.out.println("Enter string");
	      char[] a = s.next().toCharArray();
	      System.out.println("Elements = ");
	      for (int i = 0; i < a.length; i++) 
	      {
	         System.out.println(a[i]);
	      }
	      for (int i = 0; i < a.length; i++) 
	      {
	        int asciivalue = a[i] ;
	        System.out.println("The ASCII value of " + a[i] + " is: " + asciivalue);         
	   }
	}
}