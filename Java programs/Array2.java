package training_java;
import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the size of string array:");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		String[] arr1 = new String[size];
		System.out.println("Enter the string values of the array:");
		for(int i=0;i<size;i++) {
			arr1[i] = sc.next();	
			}
		System.out.println("The values entered is :");
		for(int i=0;i<size;i++) {
			System.out.println(arr1[i]);	
			}
		System.out.println("Array in reverse order: ");  
        //Loop through the array in reverse order  
        for (int i = arr1.length-1; i >= 0; i--) {  
            System.out.println(arr1[i] + " ");  
        }  
	}
}
