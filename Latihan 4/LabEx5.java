import java.util.Scanner;

class LabEx5{
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);

		System.out.println("Masukkan nombor yang boleh dibahagikan dengan 4 :");
		int num = sc.nextInt();

		if(num%4==0){
			System.out.println(num+" boleh dibahagikan dengan 4");
		}else{
			System.out.println(num+" tak boleh dibahagikan dengan 4");
		}
	}
}