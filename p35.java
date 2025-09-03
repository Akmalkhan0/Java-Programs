import java.util.Scanner;

class Sample{
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the Number: ");
      int n = sc.nextInt();
      for(int i=1 ; i<=n ; i++){
	for(int j=1 ;j<=n-i ; j++)
	   System.out.print(" ");
	for(int j=i ;j>=1 ; j--)
	   System.out.print(j);
	for(int j=2 ;j<=i ; j++)
	   System.out.print(j);
        System.out.println();
      }
      for(int i=1 ; i<=n ; i++){
	for(int j=1 ;j<=i-1 ; j++)
	   System.out.print(" ");
	for(int j=n-i+1 ;j>=1 ; j--)
	   System.out.print(j);
	for(int j=2 ;j<=n-i+1 ; j++)
	   System.out.print(j);
        System.out.println();
      }
   }
}


/*
    1
   212
  32123
 4321234
543212345
543212345
 4321234
  32123
   212
    1

*/