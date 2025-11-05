package boucles_tableaux;

import java.util.Scanner;

public class EX6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] T = new int[n];
		for (int i = 0; i < n; i++)
			T[i] = sc.nextInt();
		sc.close();

		int MAXV = 100000;
		int[] freq = new int[MAXV + 1];
		int distinct = 0;

		
		for (int i = 0; i < k; i++) {
			if (freq[T[i]] == 0)
				distinct++;
			freq[T[i]]++;
		}

		StringBuilder sb = new StringBuilder();
		sb.append(distinct);

		
		for (int i = k; i < n; i++) {
			int out = T[i - k];
			freq[out]--;
			if (freq[out] == 0)
				distinct--;

			int in = T[i];
			if (freq[in] == 0)
				distinct++;
			freq[in]++;

			sb.append(" ").append(distinct);
		}

		System.out.println(sb.toString());
	}

}
