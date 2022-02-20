package milestone_1;
class Vehicle {
    public void type() { 
     System.out.println("Vehicle engine"); 
     }
}
 class Car extends Vehicle{
    public void run() {
     System.out.println("Car runs with diesel engine "); 
     }
}
 class Bike extends Vehicle {
    public void Bikerun() { 
     System.out.println("Bike runs with petrol engine"); 
     }
}
 public class Pgm27 {
 public static void main(String[] args) {
  Car obj1 = new Car();    
  Bike obj2 = new Bike();
  		obj1.type();
  		obj1.run();
  		obj2.type();
        obj2.Bikerun();  
        }    
 }