import java.util.*;

class Sample{
  public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the number: ");
     int n = sc.nextInt();
     for(int i = 1 ; i <= n+n-1 ; i++ ){
        if(i<=n){
	   for(int j = 1 ; j <= n-i ; j++)
              System.out.print(" ");
	   for(int j = 1 ; j <= i ; j++)
              System.out.print("*");
	   for(int j = 1 ; j <= i-1 ; j++)
              System.out.print("*");
        }else{
           for(int j = 1 ; j <= i-n ; j++)
              System.out.print(" ");
	   for(int j = i-n+1 ; j <= n ; j++)
              System.out.print("*");
	   for(int j = i-n+1; j <= n-1 ;j++)
              System.out.print("*");
        }
        System.out.println();
     }    
  }
}

/*

    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *

*/
