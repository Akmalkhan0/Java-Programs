import java.util.*;

class Student{
   private int id;
   private String name;
   private String branch;
   private String email;
      
   public Student(int id, String name, String branch, String email){
      this.id = id;
      this.name = name;
      this.branch = branch;
      this.email = email;
   }


   public String getName(){
      return this.name;
   }

   public void displayDetails(){
      String str = "  "+this.id+"{\n";
      str = str+"      Id : "+this.id;
      str = str+"\n      Name : "+this.name;
      str = str+"\n      Branch : "+this.branch;
      str = str+"\n      Email : "+this.email;
      str = str+"\n   }\n";
      System.out.println(str);
   }

   public String toString(){
      String str = "  "+this.id+"{\n";
      str = str+"      Id : "+this.id;
      str = str+"\n      Name : "+this.name;
      str = str+"\n      Branch : "+this.branch;
      str = str+"\n      Email : "+this.email;
      str = str+"\n   }\n";
      return str;
   }
}

class Sample{
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.print("\n   How many Students you want to Register: ");
      int n = sc.nextInt();
      System.out.println("");
      sc.nextLine();
      Student[] s = new Student[n];
	
      System.out.println("");
      for(int i = 0; i < n ; i++){
         System.out.print("Enter FullName of Student no "+(i+1)+" : ");
         String name = sc.nextLine();
         System.out.print("Enter Email of Student no "+(i+1)+" : ");
         String email = sc.nextLine();
         System.out.print("Enter Branch of Student no "+(i+1)+" : ");         
         String branch = sc.nextLine();
         s[i] = new Student(i,name,branch,email);
	 System.out.println("");
      }

      System.out.println("[ ");
      for(Student m : s){
	m.displayDetails();
      }
      System.out.println(" ]");	
	
      System.out.print("\n Enter name to search: ");
        String searchName = sc.nextLine();
        boolean found = false;

        for (Student ba : s) {
            if (ba.getName().equalsIgnoreCase(searchName.trim())) {
                System.out.println("\n Student Found:");
                ba.displayDetails();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("\n Student with name '" + searchName + "' not found.");
        }

    
   }
}