import java.util.Scanner;
class BiggerNumber{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the first number : ");
		int num1 = sc.nextInt();

		
		System.out.print("Enter the second number : ");
		int num2 = sc.nextInt();


		if (num1 > num2) {

			System.out.print(num1+ "Is Bigger Than "+num2);
			
		}
		else{

			System.out.print(num2+ "Is Bigger Than "+num1);
		}

	}

}