import java.util.*;

class Sample{
  public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the number: ");
     int n = sc.nextInt();
     int c1 = 1;
     int c2 = ((n*n)/2)+1;
     int flag =0;
     for(int i = 1 ; i <= n; i++ ){
        if(flag == 0){
	   for(int j=1; j<=n; j++){
	      System.out.print(c1++);
	      if(j!=n)
	         System.out.print("*");
	   }
           flag = 1;
	   System.out.println();
	}else{
	   for(int j=1; j<=n; j++){
	      System.out.print(c2++);
	      if(j!=n)
	         System.out.print("*");
	   }
           flag=0;
	   System.out.println();
        }
     }
        
  }
}

/*

input: 5

1*2*3*4*5
13*14*15*16*17
6*7*8*9*10
18*19*20*21*22
11*12*13*14*15

*/