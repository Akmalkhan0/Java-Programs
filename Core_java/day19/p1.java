import java.util.*;
import java.io.*;
import java.sql.*;

class Sample{
   public static void main(String[] args)throws Exception{
      java.util.Date du  = new java.util.Date();
      java.sql.Date ds  = new java.sql.Date(152);
      ds.setHours((int)du.getHours());
      System.out.println(ds);      
     
   }
}