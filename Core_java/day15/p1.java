import java.util.function.*;

class Sample{

   public static int generateSmAlpha(){
      Supplier<Integer> s = ()-> (int)(Math.random()*26);
      return s.get()+97;
   }

   public static int generateLgAlpha(){
      Supplier<Integer> s = ()-> (int)(Math.random()*26);
      return s.get()+65;
   }

   public static char generateSymbol(){
      Supplier<Integer> s = ()-> (int)(Math.random()*5);
      switch(s.get()){
         case 0: return '@';
         case 1: return '$';
         case 2: return '&';
         case 3: return '*';
         case 4: return '#';
      }
      return '^';
   }

   public static int generateNum(){
      Supplier<Integer> s = ()-> (int)(Math.random()*10000);
      return s.get();
   }

   public static String generatePass(){
      String pass = ""+(char)((int)generateLgAlpha());

      for(int i = 0; i < 6 ; i++)
        pass += (char)((int)generateSmAlpha());

      pass += (char)((int)generateSymbol());

      pass += generateNum();

      return pass;
   }

   public static void main(String[] agrs){
      System.out.println(generatePass());
   }
 
}