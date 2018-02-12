package zadaci_12_02_2018;

import java.util.Scanner;

public class Samoglasnici {

	public static void samoglasnici(String rijec) {
		int brSamoglasnika = 0;
		int brSuglasnika = 0;
		rijec.toUpperCase();
		
		for (int i = 0; i < rijec.length(); i++) {
			if (rijec.charAt(i) == 'a' || rijec.charAt(i) == 'e' || rijec.charAt(i) == 'i' || rijec.charAt(i) == 'o'
					|| rijec.charAt(i) == 'u') {
					brSamoglasnika++;
			} else {
				brSuglasnika++;
			}
		}
		System.out.println("Broj samoglasnika: " + brSamoglasnika + 
							"\nBroj suglasnika: " + brSuglasnika);
	}
	
	
	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		System.out.print("Unesi rijec: ");
		String rijec = unos.nextLine();
		samoglasnici(rijec);
		unos.close();
	}
	
}