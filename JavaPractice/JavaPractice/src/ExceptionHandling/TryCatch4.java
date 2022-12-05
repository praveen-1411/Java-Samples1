package ExceptionHandling;

public class TryCatch4 {
	static void validateAge(int age) {
		if(age <18) {
			throw new  ArithmeticException("user not Eligible to vote !!!");			
		}else {
			System.out.println("user is Eligible to vote !!!");
		}
	}
	public static void main(String[] args) {
		System.out.println("start");
		validateAge(17);
		System.out.println("done");
	}

}
