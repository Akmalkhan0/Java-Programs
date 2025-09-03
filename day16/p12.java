import java.util.stream.*;
import java.util.*;
import java.util.function.*;

class Sample{
  
   public static void main(String[] args){
      ArrayList<Emp> l = new ArrayList<>();
      l.add(new Emp("AKMAL",2000));
      l.add(new Emp("BABU",400));
      l.add(new Emp("NEYMAR",900));
      l.add(new Emp("LINDA",800));
      l.add(new Emp("AMAAN",200));
      l.add(new Emp("MUSAHID",8000));
      l.add(new Emp("SHAFEEN",5000));
      System.out.println(l.stream().min((x,y)-> x.salary-y.salary).get().eName);
   }
}

class Emp{
   String eName;
   int salary;
   
   public Emp(String eName, int salary){
      this.eName =  eName;
      this.salary = salary;
   }
   
   public String toString(){
      return eName+", "+salary;
   }

}