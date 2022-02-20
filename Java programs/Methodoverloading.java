class Methodoverloading{
	 static void sum(int a,int b)
	 {
		 System.out.println(a+b);
		 
	 }
	 static void sum(int a,double b)
	 {
		 System.out.println(a+b);
		 
	 }
	 static void sum(double a,double b)
	 {
		 System.out.println(a+b);
		 
	 }
	 static void sum(int a,int b,double c)
	 {
		 System.out.println(a+b+c);
		 
	 }
	 public static void main(String[] args)
	 {
		 sum(4,5);
		 sum(4,5.7);
		 sum(5.8,6.22);
		 sum(4,5,8.45);
	 }
 }
 