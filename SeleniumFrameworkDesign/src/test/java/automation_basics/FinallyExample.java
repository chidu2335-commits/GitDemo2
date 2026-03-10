package automation_basics;

public class FinallyExample {
	public static void main(String[] args) {

		try {
			int num = 50 / 0;
		}

		catch (ArithmeticException e) {
			System.out.println("Exception handled");
		}

		finally {
			System.out.println("Finally block always executes");
		}
	}
}