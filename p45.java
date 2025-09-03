import java.util.*;

class Sample{
  public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the number: ");
     int n = sc.nextInt();
     int c = n/2;
     for(int i = 1 ; i <= n+n ; i++ ){
	if(i<=n){
	   for(int j = 1 ; j <= i ; j++ )
	      System.out.print(c);
	   c++;

	}else{
	   c--;
	   for(int j = i-n ; j <= n  ; j++ )
	      System.out.print(c);
	}
	System.out.println();
     }
        
  }
}

/*

2
33
444
5555
5555
444
33
2


*/