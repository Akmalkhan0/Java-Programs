import java.util.*;
import java.sql.*;

class Sample{
   public static void main(String[] args)throws Exception{
      String url = "jdbc:oracle:thin:@localhost:1521:orcl";
      String user = "scott";
      String pass = "akmal";
      String name = "oracle.jdbc.driver.OracleDriver";
      Class.forName(name);
      Connection conn = DriverManager.getConnection(url,user,pass);
      if(conn == null){
         System.out.println("no");
      }else{
         System.out.println("Connected! ");
      }
      Statement st = conn.createStatement();
      ResultSet rs = st.executeQuery("Select * from dept");
      rs.next();
      System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
   }
}
