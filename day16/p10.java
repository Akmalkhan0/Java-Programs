import java.util.stream.*;
import java.util.*;
import java.util.function.*;

class Sample{
  
   public static void main(String[] args){
      ArrayList<Emp> l = new ArrayList<>();
      l.add(new Emp(1,"AKMAL",2000));
      l.add(new Emp(2,"BABU",400));
      l.add(new Emp(3,"NEYMAR",900));
      l.add(new Emp(4,"LINDA",800));
      l.add(new Emp(5,"AMAAN",200));
      l.add(new Emp(6,"MUSAHID",8000));
      l.add(new Emp(7,"SHAFEEN",5000));
      System.out.println(l.stream().max((x,y)-> x.salary-y.salary).get().eName);
   }
}

class Emp{
   int empId;
   String eName;
   int salary;
   
   public Emp(int empId, String eName, int salary){
      this.empId = empId;
      this.eName =  eName;
      this.salary = salary;
   }
   
   public String toString(){
      return empId+", "+eName+", "+salary;
   }

}