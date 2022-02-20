import java.util.*;
class SimpleTesting{
    static int num1=2;
    static int num2=3;

    public static void main(String[] args) { 
     System.out.println("num1= "+num1);
     System.out.println("num2= "+num2);
        if(num1>num2)
           {
              System.out.println("The num1 Is Greater Than The num2.");              
           }

        else if(num2>num1)
          {
             System.out.println("The num2 Is Greater Than The num1.");
          }

        else
         {
            System.out.println("Both are Equal.");
         }
    
    }

}