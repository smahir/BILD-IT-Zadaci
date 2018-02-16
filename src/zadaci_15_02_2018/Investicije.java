package zadaci_15_02_2018;

import java.util.Scanner;

public class Investicije {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite iznos investicije: ");
		double iznosInvesticije = input.nextDouble();
		System.out.println("Unesite godisnju interesnu stopu: ");
		double godisnjaInteresnaStopa = input.nextDouble();
		System.out.println("Unesite broj godina: ");
		int brojGodina = input.nextInt();
		
		double mjesecnaInteresnaStopa = godisnjaInteresnaStopa / 1200;
		
		double buducaVrijednostInvesticije = iznosInvesticije * Math.pow((1 + mjesecnaInteresnaStopa), (brojGodina*12));
		
		System.out.println("Buduca vrijednost: " + buducaVrijednostInvesticije);
		
		input.close();
	}
}
