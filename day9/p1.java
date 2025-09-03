import java.util.*;

class Sample{
	public static void main(String [] args){
		StringBuilder s1 = new StringBuilder("AAA");
		StringBuilder s2 = new StringBuilder("BBB");
		List l = new ArrayList();
		l.add(s1);
		l.add(s2);
		StringBuilder s = new StringBuilder("AAA");
		System.out.println(l.contains(s1));
		System.out.println(l.contains(s));
		System.out.println(l.contains("AAA"));
	}
}