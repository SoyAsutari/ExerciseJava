import java.util.Scanner;
class AreaOfCircle3{
	public static void main(String[] args) {
		double result;
		result = area();
		System.out.println("Area of Circle is : "+result);

	}
	static double area(){

		double rad; double area;
		Scanner input = new Scanner(System.in);
		System.out.println("Please Enter Radius : ");
		rad = input.nextDouble();
		area = Math.PI*rad*rad;
		return area;
	}
}