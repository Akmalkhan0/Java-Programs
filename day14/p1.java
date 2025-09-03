import java.util.function.*;
import java.util.*;


class Sample{

   public static ArrayList remove(ArrayList<String> l, Predicate p){
      Function<ArrayList<String>, ArrayList<String>> f;

      f = l1 ->{
         ArrayList<String> l2 = new ArrayList<>();
         for(String e : l1){
            if(p.test(e)){
               l2.add(e);
            }
         } 
         return l2;
      }; 

      return f.apply(l);
   }

   public static void main(String[] args){

     Predicate<String> p = str -> {
        if(!(str == null || str.equals("")))
           return str.charAt(str.length()-1) == 'n';
        else
           return false;
     };

     ArrayList<String> l = new ArrayList<>();

     l.add("");
     l.add(null);
     l.add("Akmal");
     l.add("Khan");
     l.add("");
     l.add(null);
     l.add("babu");
     l.add("devgan");

     System.out.println(l);
     System.out.println(remove(l,p));
   }
}