import java.util.Scanner;
 
class UserDefined extends Exception
{
    String str;
    UserDefined(String str)
    {
        this.str=str;
    }
    public String toString()
    {
        return str;
    }
}
public class Pgm3
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Number:");
        int a=s.nextInt();
        try
        {
            if(a<0)
            {
                throw new UserDefined("Invalid Number");
            }
            System.out.println("Number Accepted");
        }
        catch(UserDefined e)
        {
            System.out.println(e);
        }
    }
}

or

package java_training4;



public class userDefinedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		i=8;
		j=9;
		try {
			int k = i/j; //0
			if(k==0)
			{
				throw new JaviException("this is not i wanted");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

}
public class JaviException extends Exception {
	public JaviException(String msg)
	{
		super(msg);
	}
}
