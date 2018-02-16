package zadaci_15_02_2018;

import java.util.Scanner;

public class NeparnaMjesta {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite neki string: ");
		String s = input.nextLine();
		
		for (int i = 0; i < s.length(); i++) {
			if ((i + 1) % 2 != 0) {
				System.out.print(s.charAt(i));
			}
		}
	input.close();
	}
	
}
