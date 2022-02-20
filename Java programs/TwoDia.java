/*Write a program to input a double dimentional array of String in the following manner:

i)the names of students
ii)the their total marks 

and to check if the Student has passed if he has more than 400 marks, 
else print the student has failed.
ex:
|Adithya, Jhon, Abdul|
|600, 350, 500| */

package training_java;
import java.util.Scanner;

public class TwoDia {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of row: ");
         int row = sc.nextInt(); 
         System.out.println("Enter the size of col: ");
         int col = sc.nextInt();  
            String[][] str = new String[row][col]; 
            System.out.println("Enter "+col+" Students details ");
            System.out.println();
            for (int i = 0; i < row; i++)
            {
            	for(int j = 0; j < col; j++)
            	{
            		str[i][j]=sc.next();
            	}
            }
            for (int i = 0; i < row; i++)
            {
            	for(int j = 0; j < col; j++)
            	{
            		System.out.println(" "+str[i][j]+" ");
            	}
            	System.out.println();
            }
            for (int i = 0; i < row; i++)
            {
            	for(int j = 0; j < col; j++)
            	{
            		int count = i=1;
            		int temp=Integer.parseInt(str[i][j]);
            		if(temp>400)
            		{
            			System.out.println(str[i][j]+" is passed exam");
            		}
            		else
            		{
            			System.out.println(str[count][j]+" is not passed exam");
            		}
            	}
            	
            }
            
        }
  }


