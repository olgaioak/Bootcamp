import java.util.Scanner;
class Exercise7 {
	public static void main (String args[]){
		Scanner scanner = new Scanner(System.in);
		System.out.print ("Enter number of pronic numbers to output:");
		int a = scanner.nextInt();
		int i=0;
		while (i<a){
			i++ ;
			System.out.print (i*(i+1) + " ");
		}

	}
}