class DynamicArray {
    int[] a = new int[0];
    int length = 0;
    int capacity = 0;
    public DynamicArray(int capacity) {
        if(capacity > 0){
            a = new int[capacity];
            length = 0;
            this.capacity = capacity;
        }
    }

    public int get(int i) {
        return a[i];
    }

    public void set(int i, int n) {
        a[i] = n;
    }

    public void pushback(int n) {
        if(length < capacity){
            a[length++] = n;
        }else if(length == capacity){
            resize();
            a[length++] = n;
        }
    }

    public int popback() {
        return a[length--];
    }

    private void resize() {
        int[] b = new int[capacity*2];
	for(int i = 0 ; i < length ; i++){
  	   b[i] = a[i];
        }
        a = b;
        capacity = capacity*2;
    }

    public int getSize() {
       return length; 
    }

    public int getCapacity() {
        return capacity;
    }
}
class Sample{
   public static void display(DynamicArray a){
      for(int i=0; i < a.getSize() ; i++){
         System.out.println(a.get(i));
      }
   }

   public static void main(String[] args){
      DynamicArray a = new DynamicArray(2);
      System.out.println("capacity: "+a.getCapacity());
      System.out.println("Size: "+a.getSize());
      System.out.println("capacity: "+a.getCapacity());
      a.pushback(10);
      a.pushback(20);
      System.out.println("capacity: "+a.getCapacity());
      System.out.println("Size: "+a.getSize());
      System.out.println("capacity: "+a.getCapacity());
      a.pushback(30);
      a.pushback(40);
      System.out.println("capacity: "+a.getCapacity());
      System.out.println("Size: "+a.getSize());
      System.out.println("capacity: "+a.getCapacity());
      a.pushback(50);
      System.out.println("capacity: "+a.getCapacity());
      System.out.println("Size: "+a.getSize());
      System.out.println("capacity: "+a.getCapacity());
      display(a);
   }   
}