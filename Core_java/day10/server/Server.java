import java.net.*;
import java.io.*;
import java.util.*;
import java.sql.*;

public class Server {
   public static void main(String[] args)throws SQLException{

    /*
      ServerSocket ss = new ServerSocket(3105);
      System.out.println("Conversation is Started!"); */


      Connection c = DBConnection.getConnection();
      Statement s = c.createStatement();
      ResultSet rs = s.executeQuery("Select empno,ename,job,mgr,hiredate,sal,comm,deptno from Emp");


      int iter = 0;
      EmpObj[] emps = new EmpObj[15]; 
      
      while(rs.next()){
        emps[iter] = new EmpObj(rs.getInt("empno"),rs.getString("ename"),rs.getString("job"),rs.getInt("mgr"),rs.getString("hiredate"),rs.getFloat("sal"),rs.getFloat("comm"),rs.getInt("deptno"));
        iter++;
      }

      for(EmpObj a: emps)
         System.out.println(a);

/*
      while(true){
         Socket s = ss.accept();
         OutputStream out = s.getOutputStream();
	 PrintStream pout = new PrintStream(out);
	 System.out.println(new Scanner(s.getInputStream()).nextLine());
	 FileInputStream fis = new FileInputStream("D:\\Akmal Khan\\Desktop\\report pdf.pdf");
	 long a = new File("D:\\Akmal khan\\Desktop\\report pdf.pdf").length();
	 byte[] b = new byte[(int)a];
	 BufferedInputStream bis = new BufferedInputStream(fis);
	 bis.read(b);
	 String hml = new String(b);
	 System.out.println(a);
	 pout.println("HTTP/1.1 200 ok\nContent-Type: text/html; charset=UTF-8\nContent-Length:"+a+"\n\n<html><head><title>database tabel retrival</title></head><body><table><tr><td>Empno</td><td>Ename</td><td>Job</td><td>Mgr</td><td>Hiredate</td><td>Sal</td><td>Comm</td><td>Deptno</td></tr><tr><td>1</td><td>2</td><td>3</td><td>4</td><td>5</td><td>6</td><td>7</td><td>8</td></tr><tr><td>1</td><td>2</td><td>3</td><td>4</td><td>5</td><td>6</td><td>7</td><td>8</td></tr><tr><td>1</td><td>2</td><td>3</td><td>4</td><td>5</td><td>6</td><td>7</td><td>8</td></tr></tabel></body></html>");

	 System.out.println("HTML response Has been Sent!");
	 Thread.sleep(10000);
         System.exit(-1);
      }
	*/
   }
}

class EmpObj{
   private int empNo;
   private String eName;
   private String job;
   private int mgr;
   private String hireDate;
   private float sal;
   private float comm;
   private int deptNo;   

   public EmpObj(int empNo,String eName,String job,int mgr, String hireDate,float sal,float comm,int deptNo){
      this.empNo = empNo;
      this.eName = eName;
      this.job = job;
      this.mgr = mgr;
      this.hireDate = hireDate;
      this.sal = sal;
      this.comm = comm;
      this.deptNo = deptNo;
   }
   
   public String toString(Object o){
      return  "[\nEmployeeNo : "+empNo+
	      "\nEmployeeName : "+eName+
              "\nJobDesignation : "+job+
              "\nManagerId : "+mgr+
              "\nHireDate : "+hireDate+
              "\nSalary : "+sal+
              "\nCommision : "+comm+
              "\nDepartmentNo : "+deptNo+
              "\n]";
   }
}


