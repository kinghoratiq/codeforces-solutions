import java.util.Scanner;
public class PetyaStrings {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String word1 = in.nextLine();
		String word2 = in.nextLine();
		String[] words1, words2;
		if (word1.equalsIgnoreCase(word2))
			System.out.print(0);
		else {
			words1 = word1.toLowerCase().split("");
			words2 = word2.toLowerCase().split("");
			for (int i = 0; i < words1.length; i++) {
				if (words1[i].compareTo(words2[i]) > 0) {
					System.out.print(1);
					break;
				}
				else if (words1[i].compareTo(words2[i]) < 0) {
					System.out.print(-1);
					break;
				}
			}
		}
	}
}