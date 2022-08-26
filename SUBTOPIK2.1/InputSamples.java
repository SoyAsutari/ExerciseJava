import java.io.*;

class InputSamples{
	public static void main(String args[])throws IOException{

		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));

		String inData;
		System.out.println("Enter The Data : ");
		inData = stdin.readLine();

		System.out.println("You have entered : "+inData);
	}
}