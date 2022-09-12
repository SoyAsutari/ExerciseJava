import java.util.Scanner;
class AreaOfCircle4{
	public static void main(String[] args) {
	

	Scanner input = new Scanner(System.in);
	System.out.println("Please Enter Radius : ");
	double rad = input.nextDouble();

	double result = area(rad);
	System.out.println("Area of Circle : "+result);

	}
	static double area(double rad){

		double area;
		area = Math.PI*rad*rad;
		return area;

	}
}