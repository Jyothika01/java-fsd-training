//Write a program to input an array of integers according to the users, and display the duplicate array elements.
package training_java;
import java.util.Scanner;
public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array");
		int size=sc.nextInt();
		int[] arr1 = new int[size];
		System.out.println("enter the array elements");
		for(int i=0;i<size;i++)
		{
			arr1[i] = sc.nextInt();	
		}
		System.out.println("Duplicate elements in the array are: "); 
		for(int i = 0; i < arr1.length; i++) {  
            for(int j = i + 1; j < arr1.length; j++) {  
                if(arr1[i] == arr1[j]) { 
                    System.out.println(arr1[j]);  
                }
            }
		}
                
	}

}

