package zadaci_15_02_2018;

import java.util.Scanner;

public class PrestupneGodine {
	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		//deklarisanje pocetnih vrijednosti
		int pocetnaGodina = 0;
		int krajnjaGodina = 0;
		int brojPrestupnih = 0;
				
		System.out.print("Unesite pocetnu godinu: ");
		pocetnaGodina = unos.nextInt();
		System.out.print("Unesite krajnju godinu: ");
		krajnjaGodina = unos.nextInt();
		
		unos.close();
		
			//petlja, od pocetne do krajnje, provjera za svaki broj izmedju
		for (int i = pocetnaGodina; i <= krajnjaGodina; i++){
			//provjera da li je godina prestupna 
			if (i % 4 == 0 && (i % 100 != 0 || i % 400 == 0)){
				brojPrestupnih++;
				//printanje godine sa razmakom izmedju
				System.out.print(i + " ");
			}  //printanje po 10 u redu
			if (brojPrestupnih % 10 == 0){
				System.out.println(" ");
			}
		}
	} 
}
