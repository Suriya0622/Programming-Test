import java.util.Scanner;

public class Program-1 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("Enter value for a");
			float a = scan.nextInt();
			System.out.println("Enter the value for b");
			float b = scan.nextInt();
			
			System.out.println("Enter the operation");
			System.out.println("---> 'add' for addition");
			System.out.println("---> 'sub' for subtration");
			System.out.println("---> 'mul' for multiplication");
			System.out.println("---> 'div' for division");
			System.out.println("press anything & enter for exit");
			
			String operation = scan.next();
		    Calculate.calc(a,b,operation);
		}
	}
}

class Calculate{
	public static void calc(float a,float b, String op) {
		if(op.equalsIgnoreCase("add")) {
			System.out.println(a+b);
		}
		if(op.equalsIgnoreCase("sub")) {
			System.out.println(a-b);
		}
		if(op.equalsIgnoreCase("mul")) {
			System.out.println(a*b);
		}
		if(op.equalsIgnoreCase("div")) {
			System.out.println(a/b);
		}
		else{
			System.exit(0);
		}
	}
}
