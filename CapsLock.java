import java.util.Scanner;
public class CapsLock {
	final static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		String word = in.next(), newWord = "";
		int upperCase = 0;
		char first = word.charAt(0);
		for (int i = 0; i < word.length(); i++) {
			char letter = word.charAt(i);
			if (Character.isUpperCase(letter))
				upperCase++;
		}
		if (upperCase == word.length()) {
			for (int j = 0; j < word.length(); j++)
				newWord += Character.toString(word.charAt(j)).toLowerCase();
			System.out.print(newWord);
		}
		else if (upperCase == word.length() - 1 && Character.isUpperCase(first) == false) {
			newWord += Character.toString(word.charAt(0)).toUpperCase();
			for (int k = 1; k < word.length(); k++)
				newWord += Character.toString(word.charAt(k)).toLowerCase();
			System.out.print(newWord);
		}
		else
			System.out.print(word);
	}
}