package odevlerim13;

import java.util.Scanner;

public class While4 {

	public static void main(String[] args) {
		/*
		 * Kullanýcýdan uzunluðu çift sayý olan bir String alýn ve bu String’in ilk
		 * yarýsýný ekrana yazdýrýn. Ornegin; Kullanýcý “Hollanda” girerse ekrana “Holl”
		 * yazdýracaksýnýz.
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println(" harf sayisi cift olan bir kelime  giriniz");
		String str = scan.nextLine();
		   if(str.length()%2==0) {
			   System.out.println(str.substring(0, str.length()/2));
		   }else {
			   System.out.println("lutfen harf sayisi cift olan bir kelime  giriniz");
		   }
	}

}
