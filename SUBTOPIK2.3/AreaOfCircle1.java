import java.util.*;
class AreaOfCircle1{
	public static void main(String[] args) {

		area();
		
	}
	static void area(){
		double rad; double area;
		Scanner input = new Scanner(System.in);
		System.out.println("Please Enter Radius : ");
		rad = input.nextDouble();
		area=3.14*rad*rad;
		System.out.println("Area of Circle is : "+area);
	}
}