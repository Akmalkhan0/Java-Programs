import java.util.*;

class Sample{
  public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the number: ");
     int n = sc.nextInt();
     int c = n*n;
     for(int i = 1 ; i <= n ; i++ ){
	for(int j=1; j<=n; j++){
	   System.out.print(c--);
	   if(j!=n)
	   System.out.print("*");
	}
	System.out.println();
     }
        
  }
}

/*

input: 3

9*8*7
6*5*4
3*2*1

*/