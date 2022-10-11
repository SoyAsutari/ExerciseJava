import java.util.Scanner;
class LabEx10_4{
	public static void main(String args[]){

		Scanner input2 = new Scanner(System.in);
		Scanner input = new Scanner(System.in);
		String name[] = new String[3];
		double height[] = new double[3];

		//Accepting the names
		for(int i = 0;i<3;i++){
			System.out.print("Enter Name " + (i+1) + ":");
				name[i] = input.nextLine();
			System.out.print("Enter Height" + (i+1) + ":");
				height[i] = input2.nextDouble();
		}
		//Displaying the array
		for(int i = 0;i<3;i++){
			System.out.println("\tName :"+name[i]+ "\tHeight :" +height[i]+ "\t(CM)");
		}
	}
}

	
