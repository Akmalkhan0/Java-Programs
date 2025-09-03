import java.util.ArrayList;

class test{
	ArrayList<Integer> list = new ArrayList<>();
	public static void main(String[] args){
		test t = new test();
		t.list.add(1);
		t.list.add(2);
		t.list.add(3);
		System.out.println(t.list);
		t.list.stream().forEach(i -> System.out.println(i));

	}
}