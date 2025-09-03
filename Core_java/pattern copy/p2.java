import java.util.*;

class Sample {
	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		System.out.print("Enter the Number: ");
      		int n = Input.nextInt();
      		System.out.println();

	      	for( int i = 0 ; i < n ; i++ ) {
	 		for( int j = n ; j >= i+1; j--) {
	    			System.out.print("  *");
         		}
         		System.out.println();
      		}

   	}	
}