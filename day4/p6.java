class Sample {
	public static void main(String [] args) {	
		byte b1 = 10;
		byte b2 = 20;
		byte b3 = b1 +b2;		//invalid
		byte b4 = (byte) b1 + b2;	//invalid
		byte b5 = (byte) b1 + (byte) b2;	//invalid
		byte b6 = (byte) (b1 + b2);
		int i1 = b1 + b2;
	}
} 