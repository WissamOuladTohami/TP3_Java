package boucles_tableaux;

import java.util.Arrays;

class TableauxUtils {

    public static void affiche(double[][] t) {
        for (double[] ligne : t) {
            for (double v : ligne) System.out.print(v + " ");
            System.out.println();
        }
    }

    public static boolean regulier(double[][] t) {
        if (t.length == 0) return true;
        int taille = t[0].length;
        for (double[] ligne : t)
            if (ligne.length != taille) return false;
        return true;
    }

    public static double[] sommeLignes(double[][] t) {
        double[] sommes = new double[t.length];
        for (int i = 0; i < t.length; i++) {
            double s = 0;
            for (double v : t[i]) s += v;
            sommes[i] = s;
        }
        return sommes;
    }

    public static double[][] somme(double[][] t1, double[][] t2) {
        if (!regulier(t1) || !regulier(t2)) return null;
        if (t1.length != t2.length || t1[0].length != t2[0].length) return null;

        double[][] res = new double[t1.length][t1[0].length];
        for (int i = 0; i < t1.length; i++)
            for (int j = 0; j < t1[0].length; j++)
                res[i][j] = t1[i][j] + t2[i][j];

        return res;
    }
}

public class EX4 {
    public static void main(String[] args) {
        double[][] t1 = {
            {1, 2, 3},
            {4, 5, 6}
        };
        double[][] t2 = {
            {10, 20, 30},
            {40, 50, 60}
        };

        System.out.println("Tableau t1 :");
        TableauxUtils.affiche(t1);

        System.out.println("t1 est régulier ? " + TableauxUtils.regulier(t1));

        System.out.println("Sommes des lignes de t1 : " + Arrays.toString(TableauxUtils.sommeLignes(t1)));

        double[][] tSomme = TableauxUtils.somme(t1, t2);
        if (tSomme != null) {
            System.out.println("Somme de t1 et t2 :");
            TableauxUtils.affiche(tSomme);
        } else {
            System.out.println("Les tableaux ne peuvent pas être additionnés.");
        }
    }
}
