import java.util.Scanner;

class OddOrEven{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the first number : ");
		int num1 = sc.nextInt();

		if (num1 % 2 == 0) {

			System.out.print(num1+" is an even number");
			
		}
		else{
			System.out.print(num1+	" is an odd number");
		}
	}
}