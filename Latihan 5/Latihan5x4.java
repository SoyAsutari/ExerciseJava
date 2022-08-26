import java.util.Scanner;

class Latihan5x4{
	public static void main(String args[]){

		double jkentang;
		double kentang = 3.50;

		double jburger;
		double burger = 2.50;

		double jayam;
		double ayam = 5.50;

	System.out.println("\tPilihan Menu Anda :" );
	System.out.println("\t 1. \t Kentang Goreng(Rm 3.50)" );
	System.out.println("\t 2. \t Burger Ayam(Rm 2.50)" );
	System.out.println("\t 3. \t Ayam Goreng(Rm 5.50" );

	Scanner z = new Scanner(System.in);
	System.out.print("What Menu Are You Ordering : ");
		int act = z.nextInt();

		switch (act) {

		case 1 :
		Scanner a = new Scanner(System.in);
		System.out.print("Quantity of your Fries Order :");
		int kkentang = a.nextInt();

		jkentang = kentang * kkentang;

		System.out.println("Jumlah perlu dibayar adalah : Rm"+jkentang);

		break;

		case 2 :
		Scanner b = new Scanner(System.in);
		System.out.print("Quantity of your Burger you order:");
		int kburger = b.nextInt();

		jburger = burger * kburger;

		System.out.println("Jumlah perlu dibayar adalah : Rm"+jburger);

		break;

		case 3 :
		Scanner c = new Scanner(System.in);
		System.out.print("Quantity of your Chicken Order :");
		int kayam = c.nextInt();

		jayam = ayam * kayam;

		System.out.println("Jumlah perlu dibayar adalah : Rm"+jayam);

		break;

		default : 
			System.out.println("Wrong input!");
 



			
		}

	}
}