package zadaci_14_02_2018;

import java.util.Scanner;
public class ZajednickiPrefix {

	public static void prefix (String s1, String s2) {
		String prefix = "";
		int duzi = Math.max(s1.length(), s2.length());
		for (int i = 0; i <= duzi; i++) {
			char c1 = s1.charAt(i);
			char c2 = s2.charAt(i);
			if (c1 == c2) {
				prefix += c1;
			} else {
				break;		
			}
		}
		if (prefix.isEmpty()) {
			System.out.println("Stringovi nemaju zajednicki prefix!");
		} else {
			System.out.println("Zajednicki prefix je \"" + prefix + "\"");
		}
	}
	
	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		System.out.print("Unesite prvi string: ");
		String s1 = unos.nextLine();
		System.out.print("Unesite drugi string: ");
		String s2 = unos.nextLine();
		prefix(s1, s2);
		unos.close();
	}
	
	
}
