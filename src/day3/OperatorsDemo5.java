package day3;

public class OperatorsDemo5 {

	public static void main(String[] args) {
		// 5.logical Operator &&(AND) ||(OR) !(NOT)
		
		int a = 15, b = 14, c = 7;
		System.out.println(true && true); // true
		System.out.println(true && false);// false
		System.out.println(false && true);// false
		System.out.println(false && false);// false
		
		System.out.println("==================");
		
		System.out.println((a > b) && (a > c));
		System.out.println((a > b) && (c > a));
		System.out.println((a < b) && (a > c));
		System.out.println((a < b) && (a < c));
		
		System.out.println("*******************");
		System.out.println(true || true); // true
		System.out.println(true || false);// true
		System.out.println(false || true);// true
		System.out.println(false || false);// false
		
		System.out.println("==================");
		
		System.out.println((a > b) || (a > c));
		System.out.println((a > b) || (c > a));
		System.out.println((a < b) || (a > c));
		System.out.println((a < b) || (a < c));
		
		System.out.println("#############");
		System.out.println(!true);// false
		System.out.println(!false);// true
		System.out.println(!(a > b)); //false
		System.out.println(!(a < b)); // true

	}

}
