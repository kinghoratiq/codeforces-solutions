import java.util.Scanner;
public class NextRound {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int a;
		int advance = 0;
		int[] scores = new int[n];
		for (int i = 0; i < n; i++) {
			a = in.nextInt();
			scores[i] = a;
		}
		for (int j = 0; j < n; j++) {
			if (scores[j] >= scores[k - 1] && scores[j] > 0)
				advance++;
		}
		System.out.print(advance);
	}
}