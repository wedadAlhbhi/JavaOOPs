package javaRecapPhase2;

public class A implements AB{

	public static void m1() {
		System.out.println("A.m1");
	}
	public void m2() {
		System.out.println("A.m2()");
	}
	
	public static void main (String [] args) {
	System.out.println("A:main started");
	A a= new A();
	a.m1();
	System.out.println("A:main finished");
	}
	
	@Override
	public void m3() {
		System.out.println("A.m3");
	}

}
