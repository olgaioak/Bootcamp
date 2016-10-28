import java.util.Scanner;
class Exercise9strB {
	public static void main (String args[]){
		Scanner scanner = new Scanner(System.in);
		System.out.print ("Please enter number of position shift:");
		int shift = scanner.nextInt();
		System.out.println ("Please enter an encrypted phrase:");
		scanner.nextLine(); // Consume new line left-over
		String s= scanner.nextLine();

		for (int i=0; i<s.length();i++){
			char character  = s.charAt(i);
			int ascii = (int)character;
			int x = ascii - shift;
			if (x<65)
				System.out.print((char)(x+26));
			else
				System.out.print((char)x);

		}
	}

}
