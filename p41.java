import java.util.*;

class Sample{
  public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the number: ");
     int n = sc.nextInt();
     int c = 2*n;
     for(int i = 1 ; i <= n+1 ; i++ ){
	for(int j = 1 ; j <= n-i+2 ; j++ ){
	   System.out.print(c+" ");
	}
	c--;
	System.out.println();
     }
        
  }
}

/*

8 8 8 8 8
7 7 7 7
6 6 6
5 5
4

*/