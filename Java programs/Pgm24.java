package milestone_1;
import java.io.*;
class Pgm24
	{
		public static void main(String[] args)
			{   int count=0;
				int sum = 0;
				outer:
				for(int i=1;i<50;i++)
				{
					if(i%2!=0)
					{
						continue;
					}
					else if(i%2==0)
					{
						sum+=i;
						count++;
						if(count==10)
							{
								break outer;
							}
					} }
				System.out.println("Sum of 10 even numbers"+"="+sum);
			}
	}