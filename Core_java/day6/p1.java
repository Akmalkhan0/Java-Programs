class test{
	void m1(){
		System.out.println("sop is working");
	}
}
class b extends test{
	void m1(){
		System.out.println("sop is not working");
	}
}

class Sample{
	public static void main(String [] args){
		test r = new test();
		r.m1();
		r= new b();
		r.m1();
	}
}