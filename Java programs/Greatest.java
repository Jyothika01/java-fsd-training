//Write a program to input an array of integers according to the users, and find the greatest value of them.

package training_java;
import java.util.Scanner;

public class Greatest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int size = sc.nextInt();
		int[] arr1 = new int[size];
		System.out.println("Enter the array elements:");
		for(int i=0;i<size;i++) {
		
			arr1[i] = sc.nextInt();	
			}
		for (int i = 0; i < arr1.length; i++) {  
           if(arr1[i] > size) { 
        	   size = arr1[i];  
        }  
	}
        System.out.println("Largest element in the given array: " + size);  
    }
 }
