package learning;

public class forEachLoop {

	public static void main(String[] args) {
		int a[]= {13,14,15,46};
		int sum=0;
		for (int x: a) {
			sum= sum + x;
		}
System.out.println("Total: " + sum);
	}

}
