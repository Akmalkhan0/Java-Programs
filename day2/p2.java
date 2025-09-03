class test {
	static int x;
}
class Sample {
	public static void main(String [] args) {
		test t1 = new test();
		test t2 = null;
		t1.x = 2;
		t2.x = 3;
		System.out.println(t1);
		System.out.println(test.x);
		System.out.println(t1.x);
		System.out.println(t2.x);
	}
}