class test {
	int x;
	static int y;
}
class Sample {
	public static void main(String [] args) {
		test t1 = new test();
		test t2 = new test();
		t1.x = 1;
		t1.y = 2;
		t2.x = 3;
		t2.y = 4;
		System.out.printf("%d %d %d %d", t1.x , t1.y ,t2.x , t2.y);
	}
}