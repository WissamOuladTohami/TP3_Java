package boucles_tableaux;

import java.util.Scanner;

public class EX5 {

	public static void rotate90ClockwiseInPlace(int[][] A) {
		int N = A.length;
		// Transposition
		for (int i = 0; i < N; i++) {
			for (int j = i + 1; j < N; j++) {
				int tmp = A[i][j];
				A[i][j] = A[j][i];
				A[j][i] = tmp;
			}
		}
		// Renversement de chaque ligne
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N / 2; j++) {
				int tmp = A[i][j];
				A[i][j] = A[i][N - 1 - j];
				A[i][N - 1 - j] = tmp;
			}
		}
	}

	public static void afficherMatrice(int[][] A) {
		int N = A.length;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print(A[i][j]);
				if (j < N - 1)
					System.out.print(" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] A = new int[N][N];
		for (int i = 0; i < N; i++)
			for (int j = 0; j < N; j++)
				A[i][j] = sc.nextInt();
		sc.close();

		rotate90ClockwiseInPlace(A);
		afficherMatrice(A);
	}

}
