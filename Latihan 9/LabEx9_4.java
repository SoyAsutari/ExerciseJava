class LabEx9_4{
	public static void main(String[] args) {
		
		double celcius, fahrenheit = 98;
		celcius = tukarSuhu(fahrenheit);

		System.out.println("Suhu (F) = "+fahrenheit);
		System.out.println("Suhu (C) = "+celcius);
	}

	static double tukarSuhu(double fahrenheit){
		double toFahrenheit;
		toFahrenheit = (5.0/9.0)*(fahrenheit-32);
		return toFahrenheit;
	}
}

