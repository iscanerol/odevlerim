package odevlerim15;

import java.util.Scanner;

public class MethodCreation04 {

	public static void main(String[] args) {
//Kullanýcýya paralelkenar, dikdörtgen ve deltoid kelimelerinden birini ve iki sayý seçmesini söyleyin.
//Hangi þekli seçerse, o þeklin alanýný ve çevresini ekrana yazdýran programý yazýnýz.

		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen paralel kenar veya dikdorgenden biriniz seciniz");
		String sekil = scan.nextLine();
		System.out.println("lutfen iki kenar uzunlugu giriniz");
		int akenar = scan.nextInt();
		int bkenar = scan.nextInt();
		scan.close();
		kenarUzunluk(sekil,akenar,bkenar);

	}
	public static void kenarUzunluk(String sekil,int akenar, int bkenar) {
		switch(sekil) {
		case "paralelkenar":
			System.out.println("cevre=" + (2*(akenar+bkenar)+ "alan=" + (2*(akenar*bkenar))));
			break;
		case "dikdortgen":
			System.out.println("cevre=" + (2*(akenar+bkenar)+ "alan=" + (akenar*bkenar)));
			break;
			default:
				System.out.println("iki sekilden birini seciniz");
				break;
		}
	}

}
