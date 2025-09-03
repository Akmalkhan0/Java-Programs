import java.util.*;

class Sample{
  public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the number: ");
     int n = sc.nextInt();
     int c = n;
     for(int i = 1 ; i <= n+1 ; i++ ){
	for(int j = 1 ; j <= i ; j++ ){
	   System.out.print(c+" ");
	   c++;
	}

	System.out.println();
     }
        
  }
}

/*

3
4 5
6 7 8
9 10 11 12

*/