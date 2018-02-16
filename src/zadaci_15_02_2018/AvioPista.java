package zadaci_15_02_2018;

import java.util.Scanner;
public class AvioPista {

	public static void main(String[] args) {
		
		//unos brzine i ubrzanja
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite brzinu i ubrzanje: ");
		double v = unos.nextDouble();
		double a = unos.nextDouble();
		
		//racunanje duzine pise
		
		double duzina = (v * v) / (2*a);		
		
		System.out.print("Maksimalna duzina piste za ovaj avion iznosi: " + duzina);
		
		unos.close();
	}

}
