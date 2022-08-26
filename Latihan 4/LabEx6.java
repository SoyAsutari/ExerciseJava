import java.util.Scanner;

class LabEx6{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		System.out.println("Masukkan nama pelajar pertama :");
		String name1=sc.nextLine();
		System.out.println("Masukkan beart pelajar pertama :");
		double berat1=sc.nextDouble();

		sc.nextLine();
		
		System.out.println("Masukkan nama pelajar kedua :");
		String name2=sc.nextLine();
		System.out.println("Masukkan berat pelajar kedua :");
		double berat2=sc.nextDouble();

		if(berat1<berat2){
			System.out.println(name1+" lebih ringan daripada "+name2+" dengan berat "+berat1+"kg");
		}else{
			System.out.println(name2+" lebih ringan daripada "+name1+" dengan berat "+berat2+"kg");
		}

	}
}