import java.util.*;

class Sample{
  public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the number: ");
     int n = sc.nextInt();
     int c = 1;
     for(int i = 1 ; i <= n ; i++ ){
	for(int j = 1 ; j <= i ; j++ ){
	   System.out.print(c);
	   c++;
	}
	System.out.println();
     }
        
  }
}

/*

1
23
456
78910

*/