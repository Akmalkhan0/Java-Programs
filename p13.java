import java.util.*;

class Sample{
  public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the number: ");
     int n = sc.nextInt();
     for(int i = 1 ; i <= n+n-1 ; i++ ){
        if(i<=n){
           for(int j = 1 ; j<=i ; j++){
              if(j==1 || j==i)
                 System.out.print("*");
              else
                 System.out.print(" ");
           }
        }else{
           for(int j = i-n+1 ; j<= n ; j++)
              if(j==i-n+1 || j==n)
                 System.out.print("*");
              else
                 System.out.print(" ");
        }
        System.out.println();
     }
        
  }
}


/*

*
**
* *
*  *
*   *
*  *
* *
**
*

*/

