class p{
	int []a ;
	p(int... a){
		this.a = a;
	}
	void m1(int... a){
		a=this.a;
		System.out.println("p-m1");
	}
}
class c extends p{
	void m1(int[] a){
		System.out.println("c-m1");
	}
}
class Sample{
	public static void main(String [] args){
		p r = new p(10,20,30,40,50);
		r.m1(new int[]{10,20,30});
		r = new c();
		r.m1();
	}
}