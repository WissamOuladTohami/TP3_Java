package boucles_tableaux;

import java.util.Scanner;

public class EX3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Combien de valeurs : ");
		int n = sc.nextInt();
		sc.close();

		for (int i = 0; i < n; i++) {
			int impaire = 2 * i + 1;
			int carre = impaire * impaire;
			System.out.println(impaire + " a pour carre " + carre);
		}
	}

}
