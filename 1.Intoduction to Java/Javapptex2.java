import java.util.Scanner;
class Javapptex2 {
	public static void main (String args[]){
		Scanner scanner = new Scanner(System.in);
		System.out.print ("Please enter a positive number:");
		int b = scanner.nextInt();
		while (b<0){
			System.out.print ("Invalid input. Please enter again a positive number:");
		    b = scanner.nextInt();
		}
		fact(b);

	}//end of main

	public static void fact (int number){
		int factorial = 1;
		if (number!=0){
			int i=1;
			while (i<=number){
				factorial *= i;
				i++;
			}
		}
		System.out.println ("Factorial value:" + factorial);

	}

}