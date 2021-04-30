package odevlerim15;

import java.util.Scanner;

public class MethodCreation0IlkHarfSorusu {

	public static void main(String[] args) {
		/*
		 Kullan�c�dan isim ve soyismini al�n. 
		 Kullan�c�n�n isim ve soyisminin ilk harflerini b�y�k
        di�er harflerini k���k harf olarak ekrana yazd�ran program� yaz�n�z.
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
