package day4;

public class SwitchCaseDemo1 {

	public static void main(String[] args) {
		int choice =1;
		int a = 4;
		int b = 2;
		switch( choice) {
		
		case 1:
			int sum = a + b;
			System.out.println("sum is: " + sum);
			break;
		case 2:
			int sub = a - b;
			System.out.println("sum is: " + sub);
			break;
		case 3:
			int mul= a * b;
			System.out.println("sum is: " + mul);
			break;
		case 4:
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
