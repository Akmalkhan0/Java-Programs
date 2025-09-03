import java.util.stream.*;
import java.util.*;
import java.util.function.*;

class Sample{
  
   public static void main(String[] args){
      ArrayList<Emp> l = new ArrayList<>();
      l.add(new Emp("Akmal",2000));
      l.add(new Emp("BABU",400));
      l.add(new Emp("NEYMAR",900));
      l.add(new Emp("AkMAl",800));
      l.add(new Emp("AMAAN",200));
      l.add(new Emp("MUSAHID",8000));
      l.add(new Emp("aKMAl",5000));
      l.stream().distinct().map(e->new Emp(e.eName.toUpperCase(),e.salary)).forEach(e->System.out.println(e));
   }
}

class Emp{
   String eName;
   int salary;
   
   public Emp(String eName, int salary){
      this.eName =  eName;
      this.salary = salary;
   }

   @Override
   public String toString(){
      return eName+", "+salary;
   }

   @Override
   public boolean equals(Object obj){
      return this.eName.equalsIgnoreCase(((Emp)obj).eName);
   }

   @Override
   public int hashCode(){
      return salary;
   }
}