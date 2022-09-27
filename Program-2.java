public class Program-2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = scan.nextInt();
		
		for(int i = 1;i<=num;i++) {
			System.out.print(2*i-1+" ");
		}
	}
}
