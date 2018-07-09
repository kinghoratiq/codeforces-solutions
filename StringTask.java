import java.util.Scanner;
public class StringTask {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String word = in.next();
		for (int i = 0; i < word.length(); i++) {
			if (word.isUpperCase(word.charAt(i))) {
				word.charAt(i).toLowerCase();
			}
		}
	}
}