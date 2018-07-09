import java.util.*;
public class LuckyDivision {
	final static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		int n = in.nextInt();
		int[] luckyNums = {4,7,44,47,74,77,444,447,474,477,744,747,774,777};
		boolean isDone = false;
		for (int j = 0; j < luckyNums.length; j++) {
			if (n % luckyNums[j] == 0) {
				System.out.print("YES");
				isDone = true;
				break;
			}
		}
		if (!isDone) {
			String number = String.valueOf(n);
			int lucky = 0;
			String[] digits = number.split("(?<=.)");
			for (int i = 0; i < digits.length; i++) {
				if (digits[i].equals("4") || digits[i].equals("7"))
					lucky++;
			}
			if (lucky == digits.length)
				System.out.print("YES");
			else
				System.out.print("NO");
		}
	}
}