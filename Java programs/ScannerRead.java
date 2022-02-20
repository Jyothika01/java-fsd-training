import java.io.File;
import java.util.*;
public class ScannerRead {	
              public static void main(String[] args) throws Exception {
              File file = new File("D:\\questions.txt");
              Scanner sc = new Scanner(file);
              StringBuffer sb = new StringBuffer();
              while(sc.hasNext()){
              sb.append(" "=sc.nextLine());
}
System.out.println(sb);


              
}
}