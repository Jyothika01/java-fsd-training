//Write a program to use a Ternary operator and find the smallest of three numbers.

import java.util.Scanner;
public class Smallest 
{
    public static void main(String[] args) 
    {
        int num1, num2, num3, result, temp;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First Number:");
        num1 = scanner.nextInt();
        System.out.println("Enter Second Number:");
        num2 = scanner.nextInt();
        System.out.println("Enter Third Number:");
        num3 = scanner.nextInt();
        scanner.close();
        temp = num1 < num2 ? num1:num2;
        result = num3 < temp ? num3:temp;
        System.out.println("Smallest Number is:"+result);
    }
}