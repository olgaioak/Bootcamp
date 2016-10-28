import java.util.Scanner;
class Exercise2str {
	public static void main (String args[]){
		Scanner scanner = new Scanner(System.in);
		System.out.print ("Please enter binary number:");
		int a = scanner.nextInt();
	/**	if (length){
			System.out.print ("Invalide number. Please enter again TIN number.");
		    a = scanner.nextInt();
		} */
		int [] ipoloipa = new int[8];
		for (int i=0; i<8; i++){
			int piliko = a / 10;
			ipoloipa[i] = a % 10;

			a= piliko;
			}

		int sum=0 ;
		for (int i=7; i>0; i--){
			sum = sum + ipoloipa[i];
		}
        if (sum % 2 == 1)
		     System.out.println("Parity check OK");
		else
		     System.out.println("Parity check not OK");


	}
}