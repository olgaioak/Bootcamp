import java.util.Scanner;
class Javapptex1 {
	public static void main (String args[]){
		Scanner scanner = new Scanner(System.in);
		System.out.print ("Please enter TIN number:");
		int b = scanner.nextInt();
	    if (retTin(b))
			 System.out.println("Tax Identification Number Valid.");
		else
			 System.out.println("Tax Identification Number not Valid.");

	}//end of main

	public static boolean retTin (int a){
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
			 return true;
		else
			 return false;

	} // end of retTin
}