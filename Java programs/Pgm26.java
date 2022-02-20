package milestone_1;
public class Pgm26 {
	public static void main(String[] args) {	
	//concat
		String s="hello";  
		   s=s.concat(" world");  
		   System.out.println(s);  
	//equals
		   String s1="Akhil";  
		   String s2="Akhil";  
		   String s3=new String("Arun");  
		   String s4="amal";  
		   System.out.println(s1.equals(s2));  
		   System.out.println(s1.equals(s3)); 
		   System.out.println(s1.equals(s4)); 
	//contains
		   String str = "hello world";
	        String str1 = "hello";
	        String str2 = "java";
	        System.out.println("hello is contains in the hello world so it is " + str.contains(str1));
	        System.out.println("java is not in the hello world so it is " + str.contains(str2));
	//replace
	        String str5 = "Shot";
	        String replace = str5.replace('o', 'u');
	        System.out.println(str5);
	        System.out.println("Replaced by "+ replace);   
	//Length
	        String s11="Welcome";  
	        String s22="Java";  
	        System.out.println("string length is: "+s11.length()); 
	        System.out.println("string length is: "+s22.length());
	}  
		}