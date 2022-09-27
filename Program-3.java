public class Program-3{
  public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = scan.nextInt();
		
		if(num%2==0) {
			for(int i = 1;i<=num-1;i++) {
				System.out.print(2*i-1+" ");
			}
		}
		else {
			for(int i = 1;i<=num;i++) {
				System.out.print(2*i-1+" ");
			}
		}
	}
}
