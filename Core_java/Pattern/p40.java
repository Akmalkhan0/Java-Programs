import java.util.*;

class Sample{
  public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the number: ");
     int n = sc.nextInt();
     int c = (n*(n+1))/2;
     for(int i = 1 ; i <= n ; i++ ){
	for(int j = 1 ; j <= n-i+1 ; j++ ){
	   System.out.print(c+" ");
	   c--;
	}
	System.out.println();
     }
        
  }
}

/*

15 14 13 12 11
10 9 8 7
6 5 4
3 2
1

*/