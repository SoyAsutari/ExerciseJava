import java.util.Scanner;
class Latihan5x2{
	public static void main(String[] args) {
		
	
	String kp;
	String nama;
	String address;

	System.out.println("\tMenu pilihan anda :" );
	System.out.println("\t 1. \t Nama dan No K/P" );
	System.out.println("\t 2. \t No. Telefon" );
	System.out.println("\t 3. \t Alamat" );

	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the number : ");
		int num = sc.nextInt();

		switch (num){
		case 1 :
		System.out.println("Enter Nama : ");
		Scanner d = new Scanner(System.in);
		nama = d.nextLine();

		System.out.println("Enter No.KP");
		Scanner a = new Scanner(System.in);
		kp = a.nextLine();

		System.out.println("\tNama : "+nama);
		System.out.println("\tNo. KP : "+kp);
			break;
		case 2 :
		System.out.println("Enter No. Telefon : ");
		Scanner b = new Scanner(System.in);
		int fon = b.nextInt();
		System.out.println("No Telefon : "+fon);
			break;
		case 3 :
		System.out.println("Enter Alamat : ");
		Scanner c = new Scanner(System.in);
		address = c.nextLine();
		System.out.println("Address : "+address);
			break;
		default : System.out.println("Salah Input");
		}

	
	}

}