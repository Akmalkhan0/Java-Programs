import java.util.Scanner;
import java.util.InputMismatchException;
import java .io.*;

class Sample{
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		Stack s = new Stack();
		PrintStream out = System.out;
		while(true){
			new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
			out.println("1. For Push");
			out.println("2. For Pop");
			out.println("3. For Peek");
			out.println("4. For Search");
			out.println("5. For Display");
			out.println("6. For Capacity");
			out.println("7. For Size");
			out.println("8. For Check Empty");
			out.println("9. For Exit");
			out.print("Enter the choice :- ");
			int ch;
			try{
				ch = sc.nextInt();
			}catch(java.util.InputMismatchException e){
				sc.nextLine();
				ch = 1000;
			}
			switch(ch){
				case 1: 
					int item = 0;
					boolean a = true;
					while(a){
						try{
							out.print("Enter the number :");
							item = sc.nextInt();
							a = false;
						}catch(java.util.InputMismatchException e){
							sc.nextLine();
							System.out.println("\n     Invalid Item type!\n");
						}
					}
					try{
						out.println("\n     \""+s.push(item)+" has been Successfully pushed\"\n");
					}catch(Exception e){
						out.println("Stack is overflow");
					}
					break;
				case 2:
					try{
						out.println("\n     \""+s.pop()+" has been poped Successfully\"\n");
					}catch(java.util.EmptyStackException e){
						out.println("\n     \"Stack Is Already Empty\"\n");
					}
					break;
				case 3:
					try{
						out.println("\n     \""+s.peek()+" is peeked at the Top\"\n");
					}catch(java.util.EmptyStackException e){
						out.println("\n     \"Stack Is Already Empty\"\n");
					}
					break;
				case 4:
					int sea = 0;
					boolean b = true;
					while(b){
						try{
							out.print("Enter number for Search: ");
							sea = sc.nextInt();
							b = false;
						}catch(java.util.InputMismatchException e){
							sc.nextLine();
							System.out.println("\n     Invalid Item type!\n");
						}
					}

					int in = s.search(sea);
					if(in>-1){
						out.println("\n     \"the " + sea + " is found at number "  +in+( in == 3 ? "rd" : in == 2 ? "nd":in==1? "st" : "th") + " number from the Top\"\n");
					}else{
						out.println("\n     \""+sea+" Not found at Stack\"\n");
					}
					break;
				case 5:
					out.println("\n"+s+"\n");
					break;
				case 6:
					out.println("\n     \"The capacity of Array is :- "+s.capacity()+"\"\n");
					break;
				case 7:
					out.println("\n     \"The size of the Stack is :- "+s.size()+"\"\n ");
					break;
				case 8:
					out.println(s.isEmpty()? "\n    \"The Stack is Empty\"":"    \"The Stack is not Empty\"\n");
					break;
				case 9:
					break;
				default:
					out.println("\n      This is invalid choice!\n");
					break;
			}	
			if(ch == 9){
				System.out.println("\n    Are you Sure you Want to Exit?");
				System.out.println("\n      1. YES \t 2. NO \n");
				int ch2 = 0;
				boolean a = true;
				while(a){
					try{
						out.print("Enter the choice : ");
						ch2 = sc.nextInt();
						out.println("");
						a = false;
					}catch(java.util.InputMismatchException e){
						sc.nextLine();
						System.out.println("\n     Invalid choice type!\n");
					}
				}
				if(ch2 == 1){
					out.println("\n   Thankyou For Using!\n");
					break;
				}
			}
			System.out.print("Press Enter to continue...  ");
			sc.nextLine();
			sc.nextLine();
		}		
	}
}