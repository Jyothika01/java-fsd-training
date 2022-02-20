package milestone_1;
class Shape {
	   public void display() {
	      System.out.println("display method");
	   }
	}
	class Rectangle extends Shape {
	   public void area() {
	      System.out.println("display area of rectangle");
	   }
	}
	class Cube extends Rectangle {
	   public void volume() {
	      System.out.println("Display volume of cube");
	   }
	}
	public class Multilevel {
	   public static void main(String[] arguments) {
	      Cube cube = new Cube();
	      cube.display();
	      cube.area();
	      cube.volume();
	   }
	}