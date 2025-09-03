class Sample{
   public static void main(String[] args){
      Thread t = new Thread(()->{
         for(int i = 0 ; i < 10 ; i++)
	    System.out.println("run: "+i);
      });
      t.start();
      for(int i = 0 ; i < 10 ; i++)
	 System.out.println("main: "+i/0);

   }
}