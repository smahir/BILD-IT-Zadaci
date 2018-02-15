package zadaci_14_02_2018;

public class SpilKarata {

	public static void main(String[] args) {
		//lista karata
		String[] Karte = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
		//lista znakova
		String[] Znak = {"Srca", "Pika", "Djeteline", "Kocke"};
		
		int brojKarte = (int) (Math.random()*13) + 0;
		int brojZnaka = (int) (Math.random()*4) + 0;
		
		System.out.println("Karta koju ste izvukli je " + Karte[brojKarte] + " u znaku " + Znak[brojZnaka]);
		//random odabir
		
		
	}
	
	
}
