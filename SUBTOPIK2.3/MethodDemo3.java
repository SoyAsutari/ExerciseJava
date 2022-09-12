class MethodDemo3{
	public static void main(String[] args) {
		double jejari = 10.55, luasbulatan;
		luasbulatan = kiraluas(jejari);

		System.out.println("Jejari ="+jejari);
		System.out.println("Luas Bulatan = "+luasbulatan);

	}

	static double kiraluas(double jejari){
		double luas;
		luas = 3.142 * jejari * jejari;
		return luas;

	}
}