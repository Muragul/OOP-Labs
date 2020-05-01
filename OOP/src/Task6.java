import java.util.Scanner;
public class Task6 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		String word = input.nextLine();
		if (isPalindrome(word)) {
			System.out.print("Word is Palindrome");
		} else {
			System.out.print("Word is not a Palindrome");
		}
	}
	public static boolean isPalindrome(String word) {
		String new_word = "";
		int l = word.length();
		for (int i=l-1;i>=0;i--) {
			new_word = new_word + word.charAt(i); 
		}
		return word.equals(new_word);
			
	}

}
