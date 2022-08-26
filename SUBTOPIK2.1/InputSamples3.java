import java.util.Scanner;

class InputSamples3{
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Name : ");
		String name = sc.nextLine();
		System.out.println("Enter your Year of Birth : ");
		int yearBorn = sc.nextInt();
		System.out.println("Enter Your Height (cm) : ");
		Double height = sc.nextDouble();

		int age = 2022-yearBorn;

		System.out.println("\nNama : "+name);
		System.out.println("Umur :  "+age);
		System.out.println("Height (cm) : "+height + "(cm)");
	}
}