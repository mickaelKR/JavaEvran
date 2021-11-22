package day4;

public class WhileLoopDemo {

	public static void main(String[] args) {

       int n = 1;
       
       int sum = 0;
       while (n <= 5) {
    	   System.out.println("n is: " + n + " sum=>" + sum);
    	   sum = sum + n;
    	   n++;
    		   
       }
		System.out.println("sum of nth number is:" + sum);
		

	}

}
