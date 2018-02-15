package zadaci_13_02_2018;

import java.util.*;

public class LokacijaNajveceg {

	public static void locateLargest(double[][] a) {
		double max = a[0][0];
		int red = 0;
		int kolona = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if(a[i][j]>max){
					max = a [i][j];
					red = i;
					kolona = j;
				}
			}
			
		}
		System.out.println("Najveci element je " + max + "[" + red + "," + kolona + "]");

	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite velicinu matrice: ");
		int n = input.nextInt();
		int m = input.nextInt();

		double[][] a = new double[n][m];
		
		System.out.println("Unesite " + a.length + " redova i " + a[0].length + " kolona: ");

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = input.nextInt();
			}
		}
		
		locateLargest(a);
		
		input.close();
	}
	
	
}
