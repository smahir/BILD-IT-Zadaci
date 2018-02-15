package zadaci_14_02_2018;

import java.util.Scanner;


public class ObrnutiRedoslijed {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite 10 cijelih brojeva: ");
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = input.nextInt();;
		}
		
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
		
		
		input.close();
		
		
	}
	
	
}
