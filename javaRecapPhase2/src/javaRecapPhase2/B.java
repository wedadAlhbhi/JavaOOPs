package javaRecapPhase2;

public class B extends A{
	public static void m1() {
		System.out.println("B.m1()");
		
	}
	
	@Override
	public void m3( ) {
		System.out.println("B.m3");
		}
	public static void main(String[] args) {
		System.out.println("B:main started");
//      A a =new A();
//		a.m1();
//		A.main(args);
//		m1();
		
//		A b = new A();
//		b.m3();
//		b.m2();
		
		AB a = new A();
		a.m3();
		B.m1();
		
		AB b = new B();
		A.m1();
		b.m3();
		
		System.out.println("B:main finished");
		
		
		
	}
}
