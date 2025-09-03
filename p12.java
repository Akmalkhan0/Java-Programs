import java.util.*;

class Sample{
  public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the number: ");
     int n = sc.nextInt();
     for(int i = 1 ; i <= n ; i++ ){
        for(int j = 1 ; j <= n-i; j++ )
           System.out.print(" ");
        for(int j = 1 ; j <= i; j++ ){
           if(j == 1 || j == n || i ==1 || i ==n){
              System.out.print("*");
           }else{
             System.out.print(" ");
           }
        }
        for(int j = 1 ; j <= i-1; j++ ){
           if(j==i-1 && i!=n)
              System.out.print("*");
           if(i == n){
              System.out.print("*");
           }else{
             System.out.print(" ");
           }
        }
        System.out.println();
     }
        
  }
}

/*

    *
   * *
  *   *
 *     *
*********

*/


