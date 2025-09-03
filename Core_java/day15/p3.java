import java.util.function.*;
import java.util.*;
import java.util.stream.*;

class Std{
   private int stdId;
   private String stdName;
   
   public Std(int stdId, String stdName){
      this.stdId = stdId;
      this.stdName = stdName;  
   } 
   
   public String getstdName(){
      return stdName;
   }

   public int getstdId(){
      return stdId;
   }

   public String toString(){
      return "Id : "+stdId+", Name: "+stdName; 
   }

}

class Sample{
   public static ArrayList<Std> go(ArrayList<Std> l){
      return l.stream().filter(x -> (x.getstdId())%2==0).collect(Collectors.toCollection(Sample::new));
   }

   public static void main(String[] agrs){
      ArrayList<Std> l = new ArrayList<>();
      l.add(new Std(101,"Akmal"));
      l.add(new Std(102,"Babu"));
      l.add(new Std(103,"Charu")); 
      l.add(new Std(104,"Doma"));
      l.add(new Std(105,"Elepha"));
      l.add(new Std(106,"Frost"));
      l.add(new Std(107,"Grandi"));
      l.add(new Std(108,"Hela"));
      l.add(new Std(109,"Iliana"));
      l.add(new Std(110,"Joker"));
      l =go(l);
      for(Std a: l)
         System.out.println(a);
   }
 
}