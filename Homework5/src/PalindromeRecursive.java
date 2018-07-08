import java.util.*;
import java.lang.*;
public class PalindromeRecursive {

	public boolean isPalindrome(String arg) {
		if(arg.length() == 0 || arg.length() == 1) {
			return true;
		}
		else if(arg.charAt(0) ==  arg.charAt(arg.length()-1)){
			return isPalindrome(arg.substring(1, arg.length()-1));
		}
		else {
			return false;
		}		
	}
	
	public static void main(String[] args) {
		String inputtext;
		PalindromeRecursive stringtest;
		// define a new scanner object 
		Scanner input = new Scanner(System.in);
		boolean tryAnother = true;
		
		while(tryAnother) {
			// print out a statement
			System.out.println("Enter a potentiol palindrome");
			inputtext = input.nextLine();
			stringtest = new PalindromeRecursive();
			if(stringtest.isPalindrome(inputtext)) {
				System.out.println("That string Is a palindrome");
			}else {
				System.out.println("That string NOT a palindrome");
			}
			System.out.print("Test another Palindrome (y/n)?");
			String choice = input.next();
			input.nextLine();
			if(choice.toLowerCase().equals("n")) {
				tryAnother = false;
				input.close();
				System.out.println("Program Terminating");
			}
			else if(!choice.toLowerCase().equals("n") && !choice.toLowerCase().equals("y") ) {
				System.out.println("Invalid Answer. Assumption is made that you aim to continue");
			}		
		}
		
		
	}
}
