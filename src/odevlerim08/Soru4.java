package odevlerim08;

import java.util.Scanner;

public class Soru4 {

	public static void main(String[] args) {
	//Kullanýcýdan bir dikdörtgenin en ve boyunu girmesini isteyin. En ve boy eþit ise
	//ekrana “Kare” farklý ise ekrana “Dikdörtgen” yazdýrýn.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen dikdortgenin enini  giriniz");
		int en = scan.nextInt();
		System.out.println("lutfen dikdortgenin boyunu  giriniz");
		int boy = scan.nextInt();
		String sonuc = en == boy ? "kare" : "dikdortgen";
		System.out.println(sonuc);
		
	}

}
