
import java.util.Scanner;
 
public class Multiplication {
 
 public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
   
  System.out.print("Enter a positive number: ");
  int num1 = in.nextInt();
  if(num1<=0)
  {
	  System.out.print("Invalid input");
  }
  else {
   
  for (int i=0; i< 10; i++){
   System.out.println(num1 + " x " + (i+1) + " = " + 
     (num1 * (i+1)));
  }
 }
}
}
