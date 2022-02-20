package milestone_1;
import java.util.Scanner;
class PrimeNumber
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number: ");
int num=sc.nextInt();
int count;
int ln=0;
int[] arr=new int[num];
for(int i=2;i<=num;i++)
{
count=0;
for(int j=2;j<=i/2;j++)
{
if(i%j==0)
{
count++;
break;
}
}
if(count==0)
{
arr[ln]=i;
ln++;
}
}
System.out.println("Elements are: ");
for(int a=0;a<ln;a++)
{
System.out.print(arr[a]+" ");
}
sc.close();
}
}