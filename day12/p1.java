import java.util.*;

class Sample{
   public static void main(String[] args){
      ArrayList<String> l = new ArrayList<>();
      l.add("Alice");
      l.add("Bob");
      l.add("Alice");
      l.add("David");
      l.add("Bob");
      Set<String> s = new LinkedHashSet<>(l);
      l = new ArrayList<String>(s);
      System.out.println(l);
   }
}