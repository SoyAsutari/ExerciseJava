import java.util.Scanner;

class Latihan5x3{
	public static void main(String args []) {
		
	

	double segiempat;
	double panjang;
	double lebar;

	double x = 0.5;
	double segitiga;
	double tapak;
	double tinggi;

	double bulatan;
	double pi = 3.142;
	double jejari;


	System.out.println("\tMengira Luas :" );
	System.out.println("\t 1. \t Segiempat" );
	System.out.println("\t 2. \t Segitiga" );
	System.out.println("\t 3. \t Bulatan" );

	Scanner z = new Scanner(System.in);
	System.out.print("What Are You Trying To Solve? : ");
		int act = z.nextInt();

		switch(act){
		case 1 :
	Scanner a = new Scanner(System.in);
	System.out.print("Masukkan Pajang Segiempat : ");
	panjang = a.nextDouble();

	Scanner b = new Scanner(System.in);
	System.out.print("Masukan Lebar Segiempat : ");
	lebar = b.nextDouble();

	segiempat = panjang * lebar;

	System.out.println("\tLuas Segiempat ialah :"+segiempat+ "cm\u00B2");

	break;

		case 2 :
	Scanner c = new Scanner(System.in);
	System.out.print("Masukkan Tapak Segitiga : ");
	tapak = c.nextDouble();

	Scanner d = new Scanner(System.in);
	System.out.print("Masukkan Tinggi Segitiga : ");
	tinggi = d.nextDouble();

	segitiga = x * tapak * tinggi;

	System.out.println("\tLuas Segitiga ialah :"+segitiga+ "cm\u00B2");

	break;

		case 3 :
	Scanner e = new Scanner(System.in);
	System.out.print("Masukkan Jejari Bulatan: ");
	jejari = e.nextDouble();


	bulatan = pi * jejari * jejari;

	System.out.println("\tLuas Bulatan ialah :"+bulatan+" cm\u00B2");

	break;

	default :
	System.out.println("Wrong Input Broski");








		}
	}


}