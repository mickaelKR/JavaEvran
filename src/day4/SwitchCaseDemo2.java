package day4;

public class SwitchCaseDemo2 {

	public static void main(String[] args) {
		int choice ='/';
		int a = 4;
		int b = 2;
		switch( choice) {
		
		case '+':
			int sum = a + b;
			System.out.println("sum is: " + sum);
			break;
		case '-':
			int sub = a - b;
			System.out.println("sum is: " + sub);
			break;
		case '*':
			int mul= a * b;
			System.out.println("sum is: " + mul);
			break;
		case '/':
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


