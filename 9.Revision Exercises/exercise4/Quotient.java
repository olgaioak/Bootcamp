package exercise4;
import java.util.*;
public class Quotient {

	public static int calcQuotient(int numerator, int denominator) throws ArithmeticException{
		return numerator/denominator;
	}

	public static void main(String[] args) {
		boolean ok = false;
		Scanner scanner = new Scanner(System.in);
		while(! ok){
			try{
				System.out.print ("Enter first number:");
				int num = scanner.nextInt();
				System.out.print ("Enter second number:");
				int denom = scanner.nextInt();
				int ret =calcQuotient(num,denom);
				ok=true;
				System.out.println(ret);
			} catch (InputMismatchException e){
				System.out.println("Invalid Input");
				scanner.nextLine(); // Consume new line left-over
			} catch (ArithmeticException e){
				System.out.println("denom=0");
				scanner.nextLine(); // Consume new line left-over
			}

		}


	}

}
