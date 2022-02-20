import java.util.*;
public class SortArrBubbleAsc {
	
	
	void bubbleSort(int arr3[])
	{
		int n=arr3.length;
		for(int i=0;i<n;i++)
			for(int j=0;j<n-1;j++)
			{
				if(arr3[j+1]<arr3[j])
				{
					//swap arr3[j+1] and arr3[j]
					int temp=arr3[j];
					arr3[j]=arr3[j+1];
					arr3[j+1]=temp;
				}
				
			}
		
		
	}
	
   //print array
	void printArray(int arr3[])
	{
		int n=arr3.length;
		for(int i=1;i<n;++i)
			System.out.print(arr3[i] + " ");
		System.out.println();
	}

	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of integer array");
		int size=sc.nextInt();
		
		int[] arr1=new int[size];
		int[] arr2=new int[size];
		int[] arr3=new int[size];
		
		
		
		System.out.println("enter elements of 1st array");
		for(int i=0;i<size;i++)
		{
			arr1[i]=sc.nextInt();
		}
		
		
		
		System.out.println("enter elements of 2nd array");
		for(int i=0;i<size;i++)
		{
			arr2[i]=sc.nextInt();
		}
		
		System.out.println("common elements array ");
		
		for (int i = 0; i < arr1.length; i++)
        {
            for (int j = 0; j < arr2.length; j++)
            {
                if(arr1[i] == arr2[j])
                {
                	arr3[i]=arr1[i];
                	System.out.print(arr3[i]+" ");
                }
               
            }
        }
		
		SortArrBubbleAsc ob=new SortArrBubbleAsc();
		ob.bubbleSort(arr3);		
		System.out.println();
		
		System.out.println("sorted array ");
		ob.printArray(arr3);
	
		

	}

}

or

package java_training4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayTwoSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size");
		int size = sc.nextInt();
		int[] arr1 = new int[size];
		int[] arr2 = new int[size];
		ArrayList<Integer> arr3 = new ArrayList<Integer>();
		
		System.out.println("Enter the elements for array 1: ");
		for(int i=0;i<size;i++)
		{
			arr1[i] = sc.nextInt();
		}
		System.out.println("Enter the elements for array 2: ");
		for(int i=0;i<size;i++)
		{
			arr2[i] = sc.nextInt();
		}
		
		
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size;j++)
			{
				if(arr1[i]==arr2[j])
				{
					arr3.add(arr1[i]);
					break;
				}
			}
		}
int len = arr3.size();
		Integer[] res = new Integer[len];
		res = arr3.toArray(res);
		
		System.out.println();
		System.out.println("The resultant array before sorting  : ");
		System.out.println(Arrays.toString(res));
		for(int i=0;i<len-1;i++)
		{
			for(int j=0;j<len-i-1;j++)
			{
				if(res[j] > res[j+1])
				{
					int temp = res[j];
					res[j] = res[j+1];
					res[j+1] = temp;
				}
			}
		}
		System.out.println();
		System.out.println("After sorting: ");
		System.out.println(Arrays.toString(res));
		sc.close();	
		
	}

}

or

import java.util.Scanner;
class Assignment
{
	public static void bubbleSort(int arr[], int len)
	{ 
		 int temp;
		for (int i = 0; i < len-1; i++) 
			for (int j = 0; j < len-i-1; j++)
			{
				if (arr[j] > arr[j+1])
				{
					
				    temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
				
			}
	}

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array size");
		int size=sc.nextInt();
		int arr1[]=new int[size];
		int arr2[]=new int[size];
		int arr3[]=new int[size];
		int count=0;
		System.out.println("enter the first array elements");
		for(int i=0;i<size;i++)
		{
			arr1[i]=sc.nextInt();
		}
		System.out.println("enter the Second array elements");
		for(int i=0;i<size;i++)
		{
			arr2[i]=sc.nextInt();
		}
		
		for(int x=0;x<size;x++)
		{
			for(int y=0;y<size;y++)
			{
				if(arr1[x]==arr2[y])
				{
					arr3[count]=arr2[y];
					count++;
				}
			}
		}
		bubbleSort(arr3,count);
		System.out.println("3rd array elements are");
