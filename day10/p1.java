import java.util.*;

class Sample{
   public static void main(String[] args){
      String[] s = new String[]{"Fabu","Chahca","Akmal","Zaid","Danish","Amin","Aamir","Arif","Aaditya","Wahab"};
      display(s);
      order(s);
      display(s);
   }
   
   public static void display(String[] arr){
      System.out.print("[ ");
      for(String a:arr)
	System.out.print(a+(arr[arr.length - 1] == a?"":", "));
      System.out.println(" ]");
   }

   public static void order(String[] arr){
      TreeSet<String> ts = new TreeSet<String>((s1,s2)->{
         int i = s1.compareTo(s2);
	 if(i!= 0)
	    return i;
	 return -1;
      });
      int i = 0;
      for(String s: arr)
         ts.add(s);
      for(String s: ts)
         arr[i++] = s;
   }
}