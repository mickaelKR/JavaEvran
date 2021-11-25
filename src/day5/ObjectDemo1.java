package day5;

public class ObjectDemo1 {

	public static void main(String[] args) {

      // this is an object
		ObjectDemo1 obj = new ObjectDemo1();
		System.out.println(obj);
		
		
		ObjectDemo1 ob=null;
		System.out.println(ob);
		ob = new ObjectDemo1();
		System.out.println(ob);
		
	}
   // class: is  specification/model/template/prototype/blueprint
   // object: is an instance of a class which has properties and behavior.
}
