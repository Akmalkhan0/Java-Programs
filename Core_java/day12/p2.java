import java.util.*;

class Sample{
   public static void main(String[] args){
     Emp e1 = new Emp("Akmal","CS");     
     Emp e2 = new Emp("Akmal","CS");
     System.out.println(e1.equals(null));
   }
}

class Emp{
  private String name;
  private String dept;
  
  public Emp(String name, String dept){
     this.name = name;
     this.dept = dept;
  }
  
  public String getName(){
     return this.name;
  }

  public String getDept(){
     return this.dept;
  }

  public void setDept(String dept){
     this.dept = dept;
  }

  public void setName(String name){
     this.name = name;
  }
  
  public int hashCode(){
     return (this.name).hashCode();
  }

  public boolean equals(Object obj){
     if(this == obj)
        return true;

     if(obj == null)
        return false;

      
     if(obj instanceof Emp){

        Emp e = (Emp)obj;

        if(e.name == this.name && e.dept == this.dept)
           return true;

        else
           return false;
     }

     return false;
  }

  public String toString(){
     return "Name: "+this.name+"\nDepartment: "+this.dept;
  }
}