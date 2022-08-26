import java.util.Scanner;
class Divide5{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the first number : ");
		int num1 = sc.nextInt();

		if (num1 % 5 == 0) {

			System.out.print(num1+" Can Be Divided By 5");
			
		}
		else{
			System.out.print(num1+" Cant Be Divided by 5");
		}
	}
}