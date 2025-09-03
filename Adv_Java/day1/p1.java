import java.util.*;
import java.sql.*;

class Sample{

   public static void displayData(ResultSet rs){
     try{
         ResultSetMetaData rsmd = rs.getMetaData();
         int colCount = rsmd.getColumnCount();
         String str = "\n";
         String str2 = "";
         for(int i = 1 ; i <= colCount ; i++){
	    int up = 15 - rsmd.getColumnName(i).length();
	    String spc= "";
            while(up > 0){ up--; spc += " ";}
            str += spc+rsmd.getColumnName(i);
            int ti = (spc+rsmd.getColumnName(i)).length();
            int j = -1;
            while(j<ti){ j++; str2 +="-";}
            str2 += " "; 
         }

         System.out.println(str);
         System.out.println(str2);

         while(rs.next()){
            for(int i = 1 ; i <= colCount ; i++){
	       int lenu = rs.getString(i)!= null?rs.getString(i).length():12;
               if( lenu > 15){
                  System.out.printf("     "+rs.getString(i).substring(0,10));
                  continue;
               }
	       System.out.printf("%15s", rs.getString(i));
	    }
	    System.out.println();
         }
         System.out.println();

      }catch(Exception e){
         System.out.println("\n   "+e.getMessage());
      }
   }

   public static void displayWhat(Statement st)throws Exception{
      int c = st.getUpdateCount();
      if(c != 0){
         System.out.println("\n   "+c+" Row deleted,updated And inserted");
      }else{
         System.out.println("\n   "+c+" Row manuplate Or task is non data manuplating");
      }
   }   

   public static void main(String[] args)throws Exception{

      Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","akmal");
      Statement st = conn.createStatement();
      Scanner sc = new Scanner(System.in);
      while(true){
         System.out.print("\nSQL> ");
         String query = sc.nextLine();
         if("EXIT".equalsIgnoreCase(query)) break;
         try{
            if(st.execute(query)){
               displayData(st.getResultSet());
            }else{
               displayWhat(st);
            }
         }catch(Exception e){
            System.out.println("\n   "+e.getMessage());
         }
      }
      System.out.println("bye, you moron!");
   }
}
