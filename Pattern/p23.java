import java.util.*;

class Sample{
  public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the number: ");
     int n = sc.nextInt();
     for(int i = 1 ; i <= n ; i++ ){
	for(int j = 1 ; j <= n-i+1 ; j++){
	   if(i==1)
	      System.out.print("*");
	   else if(j==1 || j== n-i+1)
	      System.out.print("*");
	   else
	      System.out.print(" ");
	}
	for(int j = 1 ; j <= i-1 ; j++)
	   System.out.print(" ");
	for(int j = 1 ; j <= i-2 ; j++)
	   System.out.print(" ");
	for(int j = 1 ; j <= n-i+1 ; j++){
	   if(j!=n){
	      if(i==1)
	         System.out.print("*");
	      else if(j==1 || j== n-i+1)
	         System.out.print("*");
	      else
	         System.out.print(" ");
	   }
        }
        System.out.println();
     }
        
  }
}


/*

*********
*  * *  *
* *   * *
**     **
*       *

*/

