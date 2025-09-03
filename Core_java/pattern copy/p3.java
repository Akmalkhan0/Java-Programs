class Pattern {
    public static void main(String[] args) {
        
        java.util.Scanner sc = new java.util.Scanner(System.in);
        
        System.out.print("Enter the number of rows: ");
        
        int rows = sc.nextInt();

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                if(k==1 || k==i-1)
                System.out.print("*");
                else
                System.out.print(" ");
            }
            for (int k = 1; k <= i-1; k++) {
                if(k==i-1 || k==1)
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.println();
        }
        
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i-1; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= rows-i+1; k++) {
                if(k==1 || k==rows-i)
                System.out.print("*");
                else
                System.out.print(" ");
            }

            for (int k = 1; k <= rows-i; k++) {
                if(k==1 || k==rows-i)
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}


/*


    *
   * *
  ** **
 * * * *
*  * *  *
*  * *  *
 * * * *
  ** **
   * *
    *


 */