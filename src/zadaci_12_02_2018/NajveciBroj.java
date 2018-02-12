package zadaci_12_02_2018;

import java.util.Scanner;
public class NajveciBroj {

	public static void main(String[] args) {
		
		Scanner unos = new Scanner(System.in);
		//pocetne vrijednosti
		int najveciBroj = 1;
		int brojBrojeva = 1;
		System.out.println("Unosite cijele brojeve (nula prekida program): ");
		int uneseniBroj = 1;
		//petlja
		 for (int i = 1; uneseniBroj != 0; i++){
			 	uneseniBroj = unos.nextInt();
			 //provjera vrijednosti, ako je veci zamjena mjesta
			 if (uneseniBroj > najveciBroj){
				 najveciBroj = uneseniBroj;
				 //resetovanje brojaca prilikom zamjene
				 brojBrojeva = 1;
			 }	
			 	//ukoliko su isti povecanje brojaca
			 else if (uneseniBroj == najveciBroj){
				 brojBrojeva++;
			 }
			 
		 }
		 unos.close();
		 System.out.println("Najveci broj koji ste unijeli je " + najveciBroj + ", a unesen je " + brojBrojeva + " puta!");
	} 
}
