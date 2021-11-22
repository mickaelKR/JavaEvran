package day4;

public class SwitchCaseDemo3 {

	public static void main(String[] args) {
		String choice ="mul";
		int a = 7;
		int b = 2;
		switch( choice) {
		
		case "add":
			int sum = a + b;
			System.out.println("sum is: " + sum);
			break;
		case "sub":
			int sub = a - b;
			System.out.println("sum is: " + sub);
			break;
		case "mul":
			int mul= a * b;
			System.out.println("sum is: " + mul);
			break;
		case "div":
			int div = a / b;
			System.out.println("sum is: " + div);
			break;
			default:
				System.out.println("Wrong");
		break;
		}
	
		System.out.println("////////////////////////////////////");

	}

}
