import java.util.Scanner;
class Exercise6 {
	public static void main (String args[]){
		Scanner scanner = new Scanner(System.in);
		System.out.print ("Enter number of triangle numbers:");
		int a = scanner.nextInt();

		int i=0;
		while (i<a){
			i++;
			int j = (i*(i+1))/2;
			System.out.print (j + " ");
		}
	}
}