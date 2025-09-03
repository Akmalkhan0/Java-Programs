import java.util.*;

class Sample{
	public static void main(String[] args){
		List l1 = new ArrayList();
		List l2 = new ArrayList();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(40);
		l1.add(50);
		l1.add(60);
		l1.add(70);
		l1.add(80);
		System.out.println(l1);
		l2.add(30);
		l2.add(50);
		l2.add(80);	
		System.out.println(l2);
		System.out.println(l1.containsAll(l2));
		l2.add(90);
		System.out.println(l1.containsAll(l2));
		System.out.println(l1);
		System.out.println(l2);
	}
}