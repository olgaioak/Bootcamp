package exercise6;

import java.util.Arrays;

public class JavaAnagrams {
	
	public static void main(String[] args) {

		//This part of code will test your execution (Don't touch this part of code)
		//Test Case 1
		System.out.println("Input Testing: anargram and margana");
		System.out.println("Expercted output: Anagrams");
		if (isAnagram("anagram", "margana") ) 
			System.out.println("Your output: Anagrams");
		else
			System.out.println("Your output: Not Anagrams");
		
		//Test Case 2
		System.out.println("\nInput Testing: anagramm and marganaa");
		System.out.println("Expercted output: Not Anagrams");
		if (isAnagram("anagramm", "marganaa") ) 
			System.out.println("Your output: Anagrams");
		else
			System.out.println("Your output: Not Anagrams");
		
		//Test Case 3
		System.out.println("\nInput Testing: Hello and hello");
		System.out.println("Expercted output: Anagrams");
		if (isAnagram("Hello", "hello") ) 
			System.out.println("Your output: Anagrams");
		else
			System.out.println("Your output: Not Anagrams");
	}
	
	public static boolean isAnagram(String a, String b) {
		a=a.toLowerCase();
		b=b.toLowerCase();
		char[] phrase1 = a.toCharArray();
		char[] phrase2 = b.toCharArray();
		
		if (a.length()!= b.length()){
			System.out.println("Not the same length");
			return false;
		}else{
			Arrays.sort(phrase1);
			Arrays.sort(phrase2);
			for (int i=0; i<a.length();i++){
				if (phrase1[i]!=phrase2[i]){
					return false;	
				}
			}
			return true;
			
		}
		
		
	
		

	
		
	}

}
