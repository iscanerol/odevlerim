package odevlerim13;

import java.util.Scanner;

public class While02 {

	public static void main(String[] args) {
		// SORU 2:Kullan�c�dan ba�lang�� ve biti� de�erlerini al�n ve ba�lang��
		// de�erinden ba�lay�p biti� de�erinde
//		biten 3 ve 5 ile b�l�nebilen t�m tamsay�lar� hem for loop hem de while loop
//      kullanarak ekrana yazd�r�n�z.	

		Scanner scan = new Scanner(System.in);
		System.out.println("baslangic degerini giriniz");
		int num1 = scan.nextInt();
		System.out.println("bitis degerini giriniz");
		int num2 = scan.nextInt();
		if (num1 < num2) {
			for (int i = num1; i <= num2; i++) {
				if (i % 3 == 0 && i % 5 == 0) {
					System.out.print(i + "");
				}
			}
		} else {
			System.out.println("once kucuk sayiyi giriniz");
		}
		System.out.println("");
		while (num1 <= num2) {
			if (num1 % 3 == 0 && num1 % 5 == 0) {
				System.out.print(num1 + " ");
			}
	num1++;
		}

	}
}