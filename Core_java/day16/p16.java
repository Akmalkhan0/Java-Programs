import java.util.stream.*;
import java.util.*;
import java.util.function.*;

class Sample{
  
   public static void main(String[] args){
      int[] a = {15,41,5,54,4,4,4,56,64,5};
      Arrays.stream(a).distinct().forEach(System.out::println);
   }
}