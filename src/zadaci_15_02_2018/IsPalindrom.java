package zadaci_15_02_2018;

import java.util.Scanner;

public class IsPalindrom {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite broj: ");
		int broj = input.nextInt();
		System.out.println(isPalindrome(broj));
		input.close();
	}
	
	
	
	public static boolean isPalindrome(int number) {
		if (number == reverse(number)) {
			return true;
		}
		return false;
	}
	
	public static int reverse(int number) {
		int naopakBroj = 0;
		while (number != 0){
			//broj % 10 = uzima zadnju cifru broja, naopakBroj * 10 => prebacuje vrijednost lijevo i dodaje broj od originalnog
			naopakBroj = naopakBroj * 10 + number % 10;
			//uklanja zadnju cifru unesenog broja
			number /= 10;
		}
		return naopakBroj;
	}
	
}
