package zadaci_12_02_2018;

import java.util.Scanner;

public class ZajednickiDjelilac {

	public static void main(String[] args) {
		
		Scanner unos = new Scanner(System.in);
		System.out.print("Unesite prvi cijeli broj: ");
		int prviBroj = unos.nextInt();
		System.out.print("Unesite drugi cijeli broj: ");
		int drugiBroj = unos.nextInt();
		
		int najveciDjelilac = 0;
		int najmanjiDjelilac = 0;
		
		//petlja za najveci djelilac, moguci brojevi u rasponu od 1 do jednog od unesenih brojeva
		for (int i = 1; i <= prviBroj || i <= drugiBroj; i++){
			if (prviBroj % i == 0 && drugiBroj % i == 0){
				najveciDjelilac = i;
			}
		}
		System.out.println("Najveci zajednicki djelilac za " + prviBroj + " i " + drugiBroj + " je: " + najveciDjelilac);
		
		//petlja za najmanji, kontra od prve, nije bitno da li krece od prvog ili drugog broja, zavrsava na 2 jer su svi djeljivi sa 1
		for (int i = prviBroj; i >= 2; i--){
			if (prviBroj % i == 0 && drugiBroj % i ==0){
				najmanjiDjelilac = i;
			}
		}
		System.out.println("Najmanji zajednicki djelilac za " + prviBroj + " i " + drugiBroj + " je: " + najmanjiDjelilac);
		unos.close();
	}
	

}
