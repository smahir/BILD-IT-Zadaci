package zadaci_12_02_2018;

public class Random {

	public static void main(String[] args) {
		
		int[] niz = new int[100];
		int najveci = 0;
		int brojac = 0;
		
		
		for (int i = 0; i < niz.length; i++) {
			int broj = (int) (Math.random() * 10);
			niz[i] = broj;
		}
		
		for (int e : niz) {
			if (e > najveci) {
				najveci = e;
			}
		}
		
		for (int e : niz) {
			if (e == najveci) {
				brojac++;
			}
		}
		
		for (int e : niz) {
			System.out.print(e + " ");
			System.out.println();
		}
		
		
		System.out.println("Najveci broj u nizu je " + najveci + ", ponavlja se " + brojac + " puta!");
		
		
		
	}
	
	
}
