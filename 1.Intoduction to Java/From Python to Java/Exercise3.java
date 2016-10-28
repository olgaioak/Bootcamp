import java.util.Scanner;
//import java.lang.*;
class Exercise3 {
	public static void main (String args[]){
		Scanner scanner = new Scanner(System.in);
		System.out.print ("Enter the first side of the triangle:");
		int a = scanner.nextInt();
		System.out.print ("Enter the second side of the triangle:");
		int b = scanner.nextInt();
		System.out.print ("Enter the third side of the triangle:");
		int c = scanner.nextInt();
		double d = (1/4) * Math.sqrt((a+b+c)*(b-a+c)*(a-b+c)*(a+b-c));
		System.out.println (d);

	}
}