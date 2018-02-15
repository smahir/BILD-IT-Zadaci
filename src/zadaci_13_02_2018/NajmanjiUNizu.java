package zadaci_13_02_2018;

import java.util.*;

public class NajmanjiUNizu {

	public static double min(double[] array) {
		double min = array[0];
		for (double br : array) {
			if (br < min) {
				min = br;
			}
		}
		return min;
	}
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite 10 brojeva: ");
		double[] niz = new double[10];
		for (int i = 0; i < niz.length; i++) {
			double broj = input.nextDouble();
			niz[i] = broj;
		}
		input.close();
		System.out.println("Najmanji broj u nizu je: " + min(niz));
	}
	
	
	
}
