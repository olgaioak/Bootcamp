import java.util.Scanner;
class Ex1 {

	public static  int bootCamp (int number1, int number2){
		int sum;
		if (number1<number2)
			return (int) Math.sqrt(Math.abs(number1-number2));
		else{
		    sum = number1 + number2;
		    return sum;
		}
	}

	public static void main (String args[]){
		int c;
		Scanner scanner = new Scanner(System.in);
		System.out.print ("Enter the first integer:");
		int a = scanner.nextInt();
		System.out.print ("Enter the second integer:");
		int b = scanner.nextInt();
		c = bootCamp (a,b);
		System.out.println ("The result is " + c);


	}
}