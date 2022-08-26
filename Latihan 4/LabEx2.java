import java.util.Scanner;

class LabEx2{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		System.out.println("Masukkan umur anda :");
		int num=sc.nextInt();

		int num1 = 58;

		if(num>=num1){
			System.out.println("Anda boleh pencen sekarang");
		}else{
			System.out.println("Anda boleh terus bekerja");
		}
	}
}