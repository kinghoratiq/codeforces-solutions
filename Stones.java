import java.util.Scanner;
public class Stones {
	final static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		int n = in.nextInt(), taken = 0;
		String s = in.next();
		for (int i = 1; i < s.length(); i++) {
			String s1 = Character.toString(s.charAt(i - 1));
			String s2 = Character.toString(s.charAt(i));
			if (s1.equalsIgnoreCase(s2))
				taken++;
		}
		System.out.print(taken);
	}
}