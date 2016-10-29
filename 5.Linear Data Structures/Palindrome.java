import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a word");
		String word = scanner.nextLine();
		char[] str_array = word.toCharArray();
		if (isPalindrome1(str_array))
			System.out.println("Palindrome");
		else 
			System.out.println("Not Palindrome");	
	}
	
	private static boolean isPalindrome1(char [] a){ // a tropos
		boolean isPal =false;
		if((a.length)%2==0){
			for (int i=0;i<(a.length/2)-1;i++){
				if (a[i]==a[a.length-i-1])
					isPal=true;
				else
					isPal=false;
			}
		}else{
			for (int i=0;i<(a.length-1)/2-1;i++){
				if (a[i]==a[a.length-i-1])
					isPal=true;
				else
					isPal=false;
			}	
		}
		return isPal;
	}	
	
	public static boolean isPalindrome2(String a) { //b tropos - input string
	    return a.equals(new StringBuilder(a).reverse().toString());
	}

}

