package zadaci_13_02_2018;

import java.util.Scanner;

public class ProstiBrojevi {

	public static void prostiBrojevi (int pBroj, int kBroj) {
		
		for (int i = pBroj; i < kBroj; i++) {
			if (isPrime(i)) {
				System.out.println(i + " ");
			}
		}
		
		
	}
	

	public static boolean isPrime (int n) {
		for (int i = 2; i < n; i++){
			if (n % i == 0) {
				return false;
			}
		}
			return true;
	}

	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite pocetni broj: ");
		int pBroj = input.nextInt();
		System.out.println("Unesite krajnji broj: ");
		int kBroj = input.nextInt();
		
		prostiBrojevi(pBroj, kBroj);
		
		input.close();
	}
	
	
}
