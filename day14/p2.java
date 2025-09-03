import java.util.function.*;
import java.util.*;


class Sample{
   public static String removeSpace(String str){
      String str2 = "";
      if(str == null)
        return null;
      for(int i = 0 ; i < str.length() ; i++){
         if(!(str.charAt(i) == ' ')){
            str2 += str.charAt(i);
         }
      }
      return str2;
   }

   public static int countSpace(String str){
      int c = 0;
      if(str == null)
        return 0;
      for(int i = 0 ; i < str.length() ; i++){
         if(str.charAt(i) == ' ')
            c++;
      }
      return c;  
   }

   public static int totalLength(String str){
      if(str == null) return 0;
      return str.length();
   }

   public static void main(String[] args){
      String str = "  akmaa  km  aksdm kmf kdsm sdkf m";
      System.out.println(str);
      System.out.println(removeSpace(str));
      System.out.println(countSpace(str));
      System.out.println(totalLength(str));
   }
}