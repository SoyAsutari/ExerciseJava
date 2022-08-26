import java.util.Scanner;

class LabEx4{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		System.out.println("Masukkan nama pelajar pertama :");
		String name1=sc.nextLine();
		System.out.println("Masukkan tinggi pelajar pertama :");
		double tinggi1=sc.nextDouble();

		sc.nextLine();
		
		System.out.println("Masukkan nama pelajar kedua :");
		String name2=sc.nextLine();
		System.out.println("Masukkan tinggi pelajar kedua :");
		double tinggi2=sc.nextDouble();

		if(tinggi1>tinggi2){
			System.out.println(name1+" lebih tinggi daripada "+name2+" dengan ketinggian "+tinggi1+"cm");
		}else{
			System.out.println(name2+" lebih tinggi daripada "+name1+" dengan ketinggian "+tinggi2+"cm");
		}

	}
}