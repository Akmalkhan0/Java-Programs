class Sample {
	public static void main(String [] args) {	
		char c1 = 'a';
		char c2 = 'b';
		char c3 = c1 + c2;		//invalid
		char c4 = (char) c1 + (char) c2;		//invalid
		char c5 = (char) (c1 + c2);
		int i1 = c1 + c2;
	}
} 