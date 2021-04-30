package odevlerim15;

import java.util.Scanner;

public class MethodCreation0IlkHarfSorusu {

	public static void main(String[] args) {
		/*
		 Kullanýcýdan isim ve soyismini alýn. 
		 Kullanýcýnýn isim ve soyisminin ilk harflerini büyük
        diðer harflerini küçük harf olarak ekrana yazdýran programý yazýnýz.
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Ilk isminizi giriniz");
		String ilkIsim = scan.next().toLowerCase();
		System.out.println("Soy isminizi giriniz");
		String soyIsim = scan.next().toLowerCase();
		scan.close();
		isimYazma(ilkIsim, soyIsim);
	}
	
	public static void isimYazma(String ilkIsim, String soyIsim) {
		ilkIsim = ilkIsim.substring(0,1).toUpperCase() + ilkIsim.substring(1);
		soyIsim = soyIsim.substring(0,1).toUpperCase() + soyIsim.substring(1);
		
		System.out.println(ilkIsim + " " + soyIsim);

	}

}
