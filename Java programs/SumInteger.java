//Write a program to input an array of string containing numbers, and to
//convert the string array to an integer array and perform the sum of all the numbers.
package training_java;
import java.util.Scanner;
import java.util.Arrays;

public class SumInteger {

	public static void main(String[] args) {
		int sum = 0;  
		Scanner sc= new Scanner(System.in);   
		System.out.print("Enter the string  : ");  
		String str= sc.nextLine();  
		String[] string = str.replaceAll("\\[", "")
                .replaceAll("]", "")
                .split(",");
		int[] arr = new int[string.length];
		 
        for (int i = 0; i < string.length; i++) {
            arr[i] = Integer.valueOf(string[i]);
        }
 
        System.out.println("String : " + str);
 
        System.out.println("Integer array : "
                         + Arrays.toString(arr));
        
        for (int i = 0; i < arr.length; i++) {  
            sum = sum + arr[i];  
         }  
         System.out.println("Sum of all the elements of an array: " + sum);  	
	}
}


