import java.util.Scanner;

class Latihan5x1{
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number : ");
		int num1 = sc.nextInt();

		switch(num1){
		case 1 : System.out.println("First place in the race");
			break;
		case 2 : System.out.println("Second place in the race");
			break;
		case 3 : System.out.println("Third place in the race");
			break;
		default : System.out.println("Sorry,wrong input");
		}

	}

	


}

