class Sample{
	public static void main( String[] args ) {
		byte b1 = 10;
		int i1  = b1;
		byte b2 = i1;		//invalid
		byte b3 = (byte) i1;	
		int i2 = true;		//invalid
		int i3 = (int) true;		//invalid
		int i4 = 254;	
		byte b4 = i4;		//invalid
		byte b5 = (byte) i4;
		char c1 = 'a'; 
		int i5 = 97;
		char c2 = i5;		//invalid
		char c3 = (char) i5;
		long l1 = 10;
		float f1 = l1;
		long l2 = f1;		//invalid
		long l3 = (long) f1;
	}

}