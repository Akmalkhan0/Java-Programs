import java.util.function.*;
import java.util.*;

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
   public static Std giveRan(ArrayList<Std> l){
      Supplier<Integer> s = ()->(int)(Math.random()*l.size());
      return l.get(s.get());
   }

   public static void main(String[] agrs){
      ArrayList<Std> l = new ArrayList<>();
      l.add(new Std(101,"Akmal"));
      l.add(new Std(102,"Babu"));
      l.add(new Std(103,"Charu")); 
      l.add(new Std(104,"Doma"));
      l.add(new Std(105,"Elepha"));ju
      l.add(new Std(106,"Frost"));
      l.add(new Std(107,"Grandi"));
      l.add(new Std(108,"Hela"));
      l.add(new Std(109,"Iliana"));
      l.add(new Std(110,"Joker"));
      System.out.println(giveRan(l));

   }
 
}