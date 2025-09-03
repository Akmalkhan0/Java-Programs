class Sample{
   public static String removeSpace(String s){
      String str = "";
      for(int i = 0 ; i < s.length() ; i++ ){
         if(s.charAt(i)!= ' ')
            str += s.charAt(i);
      }
      return str;
   }

   public static int countSpace(String s){
      int c = 0;
      for(int i = 0 ; i < s.length() ; i++ ){
         if(s.charAt(i)== ' ')
            c++;
      }
      return c;
   }

   public static all(String s){
      String str = "";
      for(int i = 0 ; i < s.length() ; i++ ){
         if(s.charAt(i)!= ' ')
            str += s.charAt(i);
      }
      return str;
   }

   public static void main(String[] args){
      String str = " kama akma   khna ";
      int a = countSpace(str);
      System.out.println(a);
   }
}