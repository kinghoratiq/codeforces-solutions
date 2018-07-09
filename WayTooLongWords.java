import java.util.Scanner;
public class WayTooLongWords {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		String word;
		String[] words = new String[num];
		for (int i = 0; i < num; i++) {
			word = in.next();
			words[i] = word;
		}
		for (int j = 0; j < num; j++) {
			if (words[j].length() <= 10)
				System.out.println(words[j]);
			else {
				System.out.print(words[j].charAt(0));
				System.out.print(words[j].length() - 2);
				System.out.println(words[j].charAt(words[j].length() - 1));
			}
		}
	}
}