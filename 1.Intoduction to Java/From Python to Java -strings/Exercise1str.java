import java.util.Scanner;
class Exercise1str {
	public static void main (String args[]){
		Scanner scanner = new Scanner(System.in);
		System.out.print ("Please enter TIN number:");
		int a = scanner.nextInt();
	/*	if (a.length!= 9){
			System.out.print ("Invalide number. Please enter again TIN number.");
		    a = scanner.nextInt();
		}*/
		int [] ipoloipa = new int[9];
		for (int i=0; i<9; i++){
			int piliko = a / 10;
			ipoloipa[i] = a % 10;

			a= piliko;
			}

		int check_digit = ipoloipa[0];
		int sum=0 ;
		for (int i=1; i<9; i++){
			double d = Math.pow(2,i);
			int dd = (int) d;
			sum = sum + ipoloipa[i] * dd;
		}
		sum = sum % 11;
        sum = sum % 10;
        if (sum == check_digit)
		     System.out.println("Tax Identification Number Valid.");
		else
		     System.out.println("Tax Identification Number not Valid.");








	}
}