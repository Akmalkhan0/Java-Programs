class p{
	void m1(int...a){
		System.out.println("p-m1");
	}
}

class c extends p{
	void m1(int...a){
		System.out.println("c-m1");
	}
}

class Sample{
	public static void main(String [] args){
		p r = new p();
		r.m1(10,20,30);
		r = new c();
		r.m1(10,20,30);
	}
}