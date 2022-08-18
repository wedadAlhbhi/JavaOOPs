package main;

public class Main {

	String name;
	
	private void run() {
		System.out.println(sum(1,2));		
	}
	
	private int sum(int x, int y) {
		return x + y;
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}

interface User {
	
	public boolean authorize();;
}

abstract class UserAbs{
	
	abstract int sum(int x, int y);
}

class Student implements User{

	@Override
	public boolean authorize() {
		// TODO Auto-generated method stub
		return false;
	}
		
}