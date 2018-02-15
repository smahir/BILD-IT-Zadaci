package zadaci_14_02_2018;

import java.util.Scanner;

public class BrojacSlova {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Unesite string: ");
		String s = input.nextLine();
		
		System.out.println("Broj slova u stringu je: " + countLetters(s));
		input.close();
	}
	
	public static int countLetters(String s) {
		int brSlova = 0;
		for(int i = 0; i < s.length(); i++) {
			if(Character.isLetter(s.charAt(i))) {
				brSlova++;
			}
		}
		return brSlova;
	}
	
	
}
