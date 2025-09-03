import java.util.*;

class Sample{
  public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the number: ");
     int n = sc.nextInt();
     int c = n;
     for(int i = 1 ; i <= n+n ; i++ ){
	if(i<=n){
	   StringBuilder s = new StringBuilder("");
	   for(int j = 1 ; j <= i ; j++ ){
	      s.append(" "+c);
	      c++;
 	   }
	   s.reverse();
	   System.out.print(s);

	}else{
	   StringBuilder s = new StringBuilder("");
	   for(int j = i-n ; j <= n  ; j++ ){
	      c--;
	      s.append(c+" ");
	   }

	   System.out.print(s);
	}
	System.out.println();
     }
        
  }
}

/*

4
6 5
9 8 7
31 21 11 01
13 12 11 10
9 8 7
6 5
4

*/