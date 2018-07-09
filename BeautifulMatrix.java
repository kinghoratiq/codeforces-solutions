import java.util.Scanner;
public class BeautifulMatrix {
	final static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		int[][] matrix = new int[5][5];
		int moves = 0;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				int a = in.nextInt();
				matrix[i][j] = a;
			}
		}
		for (int k = 0; k < 5; k++) {
			for (int l = 0; l < 5; l++) {
				if (matrix[0][l] == 1 || matrix[4][l] == 1)
					moves += 2;
				else if (matrix[1][l] == 1 || matrix[3][l] == 1)
					moves++;
				if (matrix[k][0] == 1 || matrix[k][4] == 1)
					moves += 2;
				else if (matrix[k][1] == 1 || matrix[k][3] == 1)
					moves++;
			}
		}
		System.out.print(moves / 5);
	}
}