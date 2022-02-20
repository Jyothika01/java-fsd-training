class Adder{  
static int add(int a,int b)
{
	return a+b;
}  
static int add(int a,int b,int c)
{
	return a+b+c;
	
}  
static double add(double a,double b)
{
	return a+b;
	}  
static double add(double a,double b,double c)
{
	return a+b+c;
	} 
}  
class Methodoverloading1{  
public static void main(String[] args){  
System.out.println(Adder.add(8,9));  
System.out.println(Adder.add(8,9,10));  
System.out.println(Adder.add(9.33,10.25));
System.out.println(Adder.add(12.56,14.257,15.22));
}
}  