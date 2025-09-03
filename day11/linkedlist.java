class ListNode {
   int val;
   ListNode next;
   ListNode() {}
   
   ListNode(int val) { 
      this.val = val; 
   }

   ListNode(int val, ListNode next) {
      this.val = val; 
      this.next = next; 
   }

   public String toString(){
      return val+" -> "+((next != null)?next.toString():"")+((next == null)?"NULL":"");
   }
}

class Sample{
   public static void main(String[] args){
      ListNode start = new ListNode(10,new ListNode(20,new ListNode(30,new ListNode(40,new ListNode(50,new ListNode(60,new ListNode(70,new ListNode(80,new ListNode(90,new ListNode(100))))))))));
      System.out.println(start);  
   }
}