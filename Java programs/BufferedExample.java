import java.io.*;
public class BufferedExample {	
              public static void main(String[] args) throws IOException {
              FileWriter writer = new FileWriter("D:\\questions.txt");
              BufferedWriter buffer = new BufferedWriter(writer);
              buffer.write("hello goodmorning");
              buffer.close();
              System.out.println("hello");
}
}

