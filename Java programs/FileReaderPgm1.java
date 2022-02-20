import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;
public class FileReaderPgm1 {	
 public static void main(String[] args) throws Exception {
FileReader fr = new FileReader("D:\\questions.txt");
int i;
BufferedReader br = new BufferedReader(fr);
while((i=br.read())!=-1)
{
System.out.println((char)i);
}
br.close();
Scanner sc =new Scanner(fr);
StringBuffer sb = new StringBuffer();
while(sc.hasNext())
{
sb.append(" "+sc.nextLine());
}
System.out.println(sb);
fr.close();
}
}