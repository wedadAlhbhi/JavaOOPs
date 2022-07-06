package learning;

public class defualtNull {

	public static void main(String[] args) {
		//by default: Instance variable value is 0
		//by default: String value is string
		// by default: References value is null
		//Access to a null reference generates a NullPointerExeption (to make it logical to the program)
		//Not allowed to pass null as a parameter (عامل فى معادلة) to call any method
		String str=null;
		System.out.print("value of string is: " +str);

	}

}
