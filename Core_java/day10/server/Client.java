import java.util.*;
import java.net.*;
import java.io.*;

public class Client{

   public static void main(String[] args) throws Exception{
      Socket s = new Socket("127.0.0.1",3105);
      Scanner sc = new Scanner(System.in);
      while(true){
         PrintStream ps = new PrintStream(s.getOutputStream());
         System.out.print("Client: ");
	 ps.println(sc.nextLine());


         String str = new Scanner(s.getInputStream()).nextLine();
         System.out.println("Server: "+str);

	 if("Bye".equalsIgnoreCase(str))
            break;
      }
   }
}