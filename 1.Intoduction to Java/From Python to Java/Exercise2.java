import java.util.Scanner;
class Exercise2 {
	public static void main (String args[]){
		Scanner scanner = new Scanner(System.in);
		System.out.print ("Enter number of 50 euro banknotes:");
		int a = scanner.nextInt();
		System.out.print ("Enter number of 20 euro banknotes:");
		int b = scanner.nextInt();
		System.out.print ("Enter number of 10 euro banknotes:");
		int c = scanner.nextInt();
		System.out.print ("Enter number of 5 euro banknotes:");
		int d = scanner.nextInt();
		System.out.print ("Enter number of 2 euro coins:");
		int e = scanner.nextInt();
		System.out.print ("Enter number of 1 euro coins:");
		int f = scanner.nextInt();
		int sum;
		sum = 50*a + 20*b + 10*c + 5*d + 2*e +1*f ;
		System.out.println ("You have " + sum + " euros.");

	}
}