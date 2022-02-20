package assignment_7;

public class Pgm1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
			try
			{
				String abc=null;
				System.out.println(abc.length());
			}
			catch(NullPointerException e)
			{
				System.out.println("Null Pointer Exception");
				
			}
			catch(NumberFormatException e)
			{
				System.out.println("Number Format Exception");
				
			}
			int a = Integer.parseInt("");
		}
		catch(NumberFormatException e)
		{
			System.out.println("Number Format Exception");
			
		}
		catch(NullPointerException e)
		{
			System.out.println("Null Pointer Exception");
			
		}
		 
     }
		

	}


