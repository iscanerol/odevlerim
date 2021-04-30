package odevlerim11;

import java.util.Scanner;

public class ForLoopSoruu01 {

	public static void main(String[] args) {
//kullanicidan baslangic ve bitis degerlerini alin ve baslangic degerinden baslayip bitis 
		// degerinde biten tum sayilari ekrana yazdirin

		Scanner scan = new Scanner(System.in);
		System.out.println("baslangic degerini giriniz");

		int num1 = scan.nextInt();
		System.out.println("bitis degerimizi giriniz");
		int num2 = scan.nextInt();
		if (num1 < num2) {
			for (int i = num1; i <= num2; i++) {
				System.out.print(i + " ");
			}

		} else {
			for (int i = num1; i >= num2; i--) {
				System.out.print(i + " ");
			}
		}
scan.close();
	}

}
