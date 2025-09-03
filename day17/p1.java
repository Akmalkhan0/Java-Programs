import java.util.stream.*;
import java.util.*;
import java.util.function.*;

class Sample{
  
   public static void main(String[] args){
      ArrayList<Order> l = new ArrayList<Order>();
      l.add(new Order(1,"AKMAL","Hd",5,2000));
      l.add(new Order(2,"BABU","hD",2,400));
      l.add(new Order(3,"NEYMAR","FB",8,900));
      l.add(new Order(4,"LINDA","KB",6,800));
      l.add(new Order(5,"AMAAN","PeN",3,200));
      l.add(new Order(6,"MUSAHID","hd",2,8000));
      l.add(new Order(7,"SHAFEEN","PEN",7,5));
      l.stream().collect(Collectors.groupingBy(s->s.title.toUpperCase())).forElach((x,y)->System.out.println(x +".totalQty : "+y.stream().map(m->m.qty).reduce(0,(o,p)->o+p)));
   }
}

class Order{
   int ordId;
   String cName;
   String title;
   int qty;
   int price;
   
   public Order(int ordId, String cName, String title, int qty, int price){
      this.ordId = ordId;
      this.cName =  cName;
      this.title = title;
      this.qty = qty;
      this.price = price;
   }
   
   public String toString(){
      return "\n   {\n      ordId: "+ordId+",\n      cName: "+cName+",\n      title:"+title+",\n      qty: "+qty+",\n      price: "+price+"\n   }\n";
   }

}