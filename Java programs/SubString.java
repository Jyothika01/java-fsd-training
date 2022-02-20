//Write a program to take take two strings as an input from the user and check
//if the second one is a substring of the first.
package training_java;
import java.util.*;  
class SubString  
{  
public static void main(String[] args)  
{  
Scanner sc= new Scanner(System.in);   
System.out.print("Enter the first string  : ");  
String str1= sc.nextLine();    
System.out.print("Enter the second string : ");  
String str2= sc.nextLine(); 
  int result = str1.indexOf(str2);
  if(result!=-1) {
  System.out.println(str2 + " is present in the string.");
}
else {
  System.out.println(str2 + " is not present in the string.");
}

} 
}  