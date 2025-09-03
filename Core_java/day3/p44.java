class Sample {
	public static void main(String [] args) {	
		int a = 10;
		int b = 20;
		int c = a + b;
		System.out.println(c); // 30 
		int i1 = 10;
		float f1 = 20;
		float f2 = i1 + f1;
		int i2 = i1 + f1;  //invalid
		int i3 = (int) i1 +f1;  //invalid
		int i4 = i1 + (int) f1;
		int i5 = (int) (i1 + f1); 
	}
}