package zadaci_13_02_2018;
import java.util.Scanner;
public class StriktnoIdenticni {

	public static boolean striktnoIdenticniNizovi(int[] niz1, int[] niz2){
		
		
		for(int i = 0; i < niz1.length; i++){
			if (niz1[i] != niz2[i]){
				return false;
			}
		}
		return true;
	}
	
	
	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite duzinu nizova: ");
		int duzina = unos.nextInt();
		
		System.out.println("Unesite prvi niz: ");
		int[] niz1 = new int[duzina];
		for (int i = 0; i < duzina; i++){
			niz1[i] = unos.nextInt();
		}
		
		System.out.println("Unesite drugi niz: ");
		int[] niz2 = new int[duzina];
		for (int i = 0; i < duzina; i++){
			niz2[i] = unos.nextInt();
		}
		
		if(striktnoIdenticniNizovi(niz1, niz2)){
			System.out.println("Nizovi su striktno identicni!");
		} else {
			System.out.println("Nizovni nisu striktno identicni!");
		}
		unos.close();
		
	}
}
