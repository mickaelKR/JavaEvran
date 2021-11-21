package day3;

public class TypeCastingDemo1 {

	public static void main(String[] args) {
		byte b1 = 127;
		int i1 = b1;// implicit casting(up) by java compiler // implicit means internally
		System.out.println(b1);
		System.out.println(i1);
		// you cannot convert from smaller to larger directly! you have to convert forcefully
		int i2 = 127;
		byte b2 = (byte)12; // explicit casting(down) by us or java programmer// explicit means internally
		
		short s1 = 45;
		double d1 = s1;
		
		double d2 = 100.56;
		short s2 = (short) d2;

	}

}
