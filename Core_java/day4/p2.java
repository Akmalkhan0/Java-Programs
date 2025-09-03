class Sample {
	public static void main(String [] args) {	
		byte b1 = 10 + 20; 
		byte b2 = 127 +1; //invalid
		char ch1 = 'a' + 'b';
		byte b3 = 1; 
		byte b4 = 1 + b2; //invalid 
		char b5 = 1 + 2L; //invalid
		float f1 = 10 + 20;
		float f2 = 10 + 20.0;  //invalid
		float f3 = 10 + 20.0f;
		boolean b = true;
		int y = x + b;  //invalid
	}
} 