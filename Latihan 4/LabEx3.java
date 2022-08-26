import java.util.Scanner;

class LabEx3{
	public static void main(String args[]){
			Scanner sc = new Scanner(System.in);

	System.out.println("Masukkan kod 1-perempuan / 2-lelaki :");
	int kod = sc.nextInt();

	int kod1 = 1;

	if(kod==kod1){
		System.out.println("Anda perempuan");
	}else{
		System.out.println("Anda lelaki");
	}
	}
}