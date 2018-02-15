package zadaci_14_02_2018;
import java.util.Scanner;
public class Stednja {

	public static void main(String[] args) {
		//unos podataka
		Scanner unos = new Scanner(System.in);
		System.out.print("Unesite mjesecni iznost stednje: ");
		double visinaStednje = unos.nextDouble();
		System.out.println("Stanje racuna nakon koliko mjeseci?: ");
		int brojMjeseci = unos.nextInt();
		double saldo = 0;
		double kamata = 0.00417;
		//petlja
		for (int i = 1; i <= brojMjeseci; i++){
			saldo = (saldo + visinaStednje) * (1 + kamata);
			
		}
		System.out.println("Novac nakon " + brojMjeseci + " usljed povecanja 5% godisnje ce da iznosi: " + saldo);
		unos.close();
	}

}
