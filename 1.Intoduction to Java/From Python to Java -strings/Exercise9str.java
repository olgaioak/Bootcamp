import java.util.Scanner;
class Exercise9str {
	public static void main (String args[]){
		Scanner scanner = new Scanner(System.in);
		System.out.print ("Please enter number of position shift:");
		int shift = scanner.nextInt();
		System.out.println ("Please enter a phrase:");
		scanner.nextLine(); // Consume new line left-over
		String s= scanner.nextLine();
		//System.out.print ("a" +  + "s" + s );

		for (int i=0; i<s.length();i++){
			char character  = s.charAt(i);
			int ascii = (int)character;
			int x = ascii + shift;
			if (x>90)
				System.out.print((char)(x-26));
			else
				System.out.print((char)x);

		}
	}

}
