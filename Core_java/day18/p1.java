class myThread extends Thread{
   Acc curr;

   public myThread(Acc a){
      curr = a;
   }

   public void run(){
      
      Thread t1 = null;
      Thread t2 = null;

      Runnable r1 = ()->curr.dep(500);
      Runnable r2 = ()->curr.del(500);
      try{
         while(true){
            t1 = new Thread(r1);
            t2 = new Thread(r2);

	    t1.start();
      	    t2.start();
         
            t1.join();
            t2.join();

            System.out.println(curr.n+" : "+curr.amt);
            if(curr.amt != 1000) break;
         }
      }catch(Exception e){
         System.out.println("Enxecption");
         throw new NullPointerException();
      }
   }
}

class Sample{
   public static void main(String[] args) throws Exception{
      Acc u1 = new Acc("u1");
      myThread t1  = new myThread(u1);
      t1.start();
      t1.join();
   }
}

class Acc{
   String n;
   int amt = 1000;

   public Acc(String n){
      this.n = n;
   }

   public void dep(int amt){
      this.amt += amt;
   }

   public void del(int amt){
      this.amt -= amt;
   }
}