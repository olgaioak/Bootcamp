import java.util.Scanner;
class Javapptex3 {
	public static void main (String args[]){
		Scanner scanner = new Scanner(System.in);
		System.out.print ("Please enter a positive number:");
		int a = scanner.nextInt();
		while (a<=0){
			System.out.print ("Invalid input. Please enter again a positive number:");
		    a = scanner.nextInt();
		}
		System.out.print ("Please enter a positive number:");
		int b = scanner.nextInt();
		while (b<=0){
			System.out.print ("Invalid input. Please enter again a positive number:");
			b = scanner.nextInt();
		}
		System.out.print ("Please enter a positive number:");
		int c = scanner.nextInt();
		while (c<=0){
			System.out.print ("Invalid input. Please enter again a positive number:");
			c = scanner.nextInt();
		}
		if (trianIneq(a,b,c)){
			isEquilateral(a,b,c);
			System.out.println("Triangle's perimeter is" + (a+b+c));
		}else {
			System.out.println("Please enter again a,b,c");
			a = scanner.nextInt();
			b = scanner.nextInt();
			c = scanner.nextInt();
			if (trianIneq(a,b,c)){
				isEquilateral(a,b,c);
				System.out.println("Triangle's perimeter is " + (a+b+c));
			} else {
				System.out.println("Triangle can't be created");
			}
		}

	}//end of main

	public static boolean trianIneq (int number1,int number2,int number3){
		int max=number1,x=number2,y=number3;
		if (number2>max){
			max = number2;
			x = number1;
			y = number3;
		}else if(number3>max){
			max = number3;
			x = number1;
			y = number2;
		}
		if (max<=(x+y))
			return true;// triangle can be created
		else
		    return false;

	} //end of method
	public static void isEquilateral(int number1,int number2,int number3){
		if (number1==number2 | number2==number3 | number1==number3)
			System.out.println("Triangle is equilateral");
		else
		    System.out.println("Triangle is equilateral");
	}

}