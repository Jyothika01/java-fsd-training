class Cars{
  void run(){System.out.println("Cars");}
  }
  class BMW extends Cars{
	  void run(){System.out.println("BMW is a car");}
  }
  class Sports{
	  void run(){System.out.println("Sports");}
	  }
  class Cricket extends Sports{
	  void run(){System.out.println("Cricket is a sports");}
  }
  class Methodover2{
  public static void main(String args[]){
  BMW b = new BMW();
  Cricket c = new Cricket();
  b.run();
  c.run();
  }
}
  
