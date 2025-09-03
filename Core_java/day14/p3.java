import java.util.function.*;
import java.util.*;


class Sample{

   public static void main(String[] args){
      String str = "akms  fk j fdns nf sd fjsf s jn";
      Function<String,String> f1 = s -> s.replaceAll(" ","");
      Function<String,Integer> f2 = s -> s.length();
      Function<String,Integer> m = f1.andThen(f2);
      Function<String,Integer> f3 =  s -> f2.apply(s) - m.apply(s) ;
      System.out.println(str);
      System.out.println(f3.apply(str));

   }
}