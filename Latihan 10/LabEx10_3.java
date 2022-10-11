import java.util.Scanner;
class LabEx10_3{
	public static void main(String[] args) {
		
	

		Scanner input = new Scanner(System.in);

		int income[] = new int[4];
		//Accepting the incomes
		for(int i = 0;i<4;i++){
			System.out.print("Enter Family " + (i+1) + ":");
				income[i] = input.nextInt();
		}
		//Displaying the array
		for(int i = 0;i<4;i++){
			System.out.println("Family " +(i+1) + " :"+income[i]);
		}
	}
}