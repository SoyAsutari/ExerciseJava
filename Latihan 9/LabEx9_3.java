class LabEx9_3{
public static void main(String args[]){
		
	double tapak = 6.5, tinggi = 5.5, hasilluas;
		
	hasilluas = luassegitiga(tapak,tinggi);

	line();
	System.out.println("Tapak : "+tapak);
	System.out.println("Tinggi : "+tinggi);
	System.out.println("Luas Segitiga : "+hasilluas);
	line();

	
	}

	static double luassegitiga(double tapak, double tinggi){
		double luas;
		luas = 0.5*tapak*tinggi;
		return luas;
	}
	static void line(){
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
	}
}
