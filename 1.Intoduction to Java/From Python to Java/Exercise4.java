import java.util.Scanner;
class Exercise4 {
	public static void main (String args[]){
		Scanner scanner = new Scanner(System.in);
		System.out.print ("Enter value for a:");
		int a = scanner.nextInt();
		System.out.print ("Enter value for b:");
		int b = scanner.nextInt();
		System.out.print ("Enter value for c:");
		int c = scanner.nextInt();

		if (Math.pow(b,2) - 4*a*c <0) {
			System.out.println ("No real-valued solutions exist.");
		}else {
			double x = (Math.sqrt(Math.pow(b,2) - 4*a*c) - b) / (2*a);
            double y = (-(Math. sqrt (Math.pow(b,2) - 4*a*c)) - b) / (2*a);
            System.out.println ("The solutions of the quadratic equation are: " + x + " and " + y);
		}


	}
}