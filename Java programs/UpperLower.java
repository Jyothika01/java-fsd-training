package milestone_1;
import java.util.Scanner;
public class UpperLower {

	public static void main(String[] args) {    
        System.out.println("Enter a string= ");
        Scanner sc= new Scanner(System.in);  
        String str1= sc.next();
        StringBuffer newStr=new StringBuffer(str1);     
        for(int i = 0; i < str1.length(); i++) {    
                
            
            if(Character.isLowerCase(str1.charAt(i))) {    
                   
                newStr.setCharAt(i, Character.toUpperCase(str1.charAt(i)));    
            }    
               
            else if(Character.isUpperCase(str1.charAt(i))) {    
                    
                newStr.setCharAt(i, Character.toLowerCase(str1.charAt(i)));    
            }    
        }    
        System.out.println("String value after upper case to lower case conversion : " + newStr);        
for(int i = 0; i > str1.length(); i++) {    
                
            
            if(Character.isUpperCase(str1.charAt(i))) {    
                   
                newStr.setCharAt(i, Character.toUpperCase(str1.charAt(i)));    
            }    
               
            else if(Character.isLowerCase(str1.charAt(i))) {    
                    
                newStr.setCharAt(i, Character.toLowerCase(str1.charAt(i)));    
            }    
        }    
        System.out.println("String value after lowercase to upper case conversion : " + newStr);    
    }  }