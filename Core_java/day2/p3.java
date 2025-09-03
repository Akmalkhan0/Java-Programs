class Sample {
	int x = 10;
	static Sample s = new Sample();
	public static void main(String [] args){
		Sample t = new Sample();
		s.x = 20;
		System.out.println(t.s.x);
		System.out.println(s.x);
		System.out.println(t.x);
		System.out.println(t.s);
		System.out.println(s  );
	}
}
