//Write a program to input an array of integers according to the user , and also take a input of a 
//particular integer and find out the occurence of the intger in the array.

package training_java;

import java.util.Scanner;
public class Occurence
{
    public static void main(String[] args) 
    {
        int size, x, count = 0, i = 0;
        Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of array:");
		size = s.nextInt();
		int[] arr1 = new int[size];
		System.out.println("Enter the array elements:");
		for(i=0;i<size;i++) {
		
			arr1[i] = s.nextInt();	
			}
        System.out.print("Enter the element of which you want to count number of occurrences:");
        x = s.nextInt();
        for(i = 0; i < size; i++)
        {
            if(arr1[i] == x)
            {
                count++;
            }
        }
        System.out.println("Number of Occurrence of the Element:"+count);
    }
}