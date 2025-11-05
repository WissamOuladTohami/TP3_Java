package boucles_tableaux;

import java.util.Scanner;

public class EX2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Entrez la hauteur du triangle : ");
		int n = sc.nextInt();
		sc.close();

		for (int i = 1; i <= n; i++) {
			int etoiles = 2 * i - 1;
			for (int j = 0; j < etoiles; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
