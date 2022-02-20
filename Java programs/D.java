package milestone_1;
class C{
   public void disp() {
System.out.println("C");
   }}
class A extends C
{   public void disp()
   {
System.out.println("Apple");
   }}
class B extends C
{
   public void disp()
   {
System.out.println("Ball");
   }}
class D extends A{
   public void disp() {
System.out.println("Dog");}
   public static void main(String args[]){
D obj = new D();
obj.disp();
   }
}