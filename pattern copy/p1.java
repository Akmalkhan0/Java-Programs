import java.util.*;

class Sample{
   public static void main(String[] args){
      Scanner Input = new Scanner(System.in);
      System.out.print("Enter the Number: ");
      int n = Input.nextInt();
      System.out.println();
      for( int i = 0 ; i < n ; i++ ){
	 for( int j = 0 ; j <= i && j <= n ; j++){
	    System.out.print("  *");
         }
         System.out.println();
      }

   }	
}

/*

  
               *
            *
         *
      *
   *


*/