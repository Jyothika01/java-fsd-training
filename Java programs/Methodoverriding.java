class Colors{
  void run(){System.out.println("Colors");}
  }
  class Yellow extends Colors{
	  void run(){System.out.println("Yellow is a color");}
  }
  class Fruit{
	  void run(){System.out.println("Fruits");}
	  }
  class Grapes extends Fruit{
	  void run(){System.out.println("Grape is a fruit");}
  }
  class Methodoverriding{
  public static void main(String args[]){
  Yellow y = new Yellow();
  Grapes g = new Grapes();
  y.run();
  g.run();
  }
}
  
	 