package zadaci_13_02_2018;
import java.util.*;

public class Sortiranje2D {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite velicinu matrice: ");
		int n = input.nextInt();
		int m = input.nextInt();

		double[][] matrica = new double[n][m];

		System.out.println("Unesite " + matrica.length + " redova i " + matrica[0].length + " kolona: ");

		for (int i = 0; i < matrica.length; i++) {
			for (int j = 0; j < matrica[i].length; j++) {
				matrica[i][j] = input.nextInt();
			}
		}

		sortRows(matrica);

		int brojac = 0;
		for (int i = 0; i < matrica.length; i++) {
			for (int j = 0; j < matrica[i].length; j++) {
				System.out.print(matrica[i][j] + " ");
				brojac++;
				if (brojac % m == 0) {
					System.out.println();
				}
			}

		}
		input.close();
	}
	
	
	
	public static double[][] sortRows(double[][] matrica) {

		for (int i = 0; i < matrica.length; i++) {
			Arrays.sort(matrica[i]);
		}
		return matrica;

	}
	
}
