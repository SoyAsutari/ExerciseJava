import java.util.Scanner;
class AreaOfCircle2{
	public static void main(String[] args) {
		double rad;
		double area;

		Scanner input = new Scanner(System.in);
		System.out.println("Please Enter Radius : ");
		rad = input.nextDouble();
		area(rad);
	}
	static void area(double rad){

		double area;
		area=Math.PI*rad*rad;
		System.out.println("Area of Circle is : "+area);
	}
}