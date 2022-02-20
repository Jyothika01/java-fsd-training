//Write a program to take input of a String and convert it into a character array and reverse the array,
//and to again make that reversed character array as a String and display it.
package training_java;
import java.lang.*;
import java.io.*;
import java.util.*;
 
class RevString {
    public static void main(String[] args)
    {
    	Scanner sc= new Scanner(System.in);   
        
        System.out.print("Enter the string  : ");
        String str1= sc.next(); 
        char[] c = str1.toCharArray();
        System.out.print("Character arrays are: ");
        for (int i = 0; i <c.length; i++)
        {
        System.out.print(c[i]+" ,");
    }
        System.out.println();
        System.out.print("Reversed array ");
        for (int i = c.length-1;i>0; i--)
        {
        	System.out.print(c[i]+" ,");
        }
        char ch;
        String rev = "";
        for (int i = 0; i <str1.length(); i++)
        {
        	ch=str1.charAt(i);
        	rev=ch+rev;
        	
        }
        
        System.out.println();	
        System.out.println("Reversed character array to string : " +rev);	
              
}
}