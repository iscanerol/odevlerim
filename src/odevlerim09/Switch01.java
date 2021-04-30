package odevlerim09;

import java.util.Scanner;

public class Switch01 {

	public static void main(String[] args) {
//Kullanýcýdan bir gun alýn eðer gun “Cuma” ise ekrana
//“Müslümanlar için kutsal gün” yazdýrýn. “Cumartesi” ise
//ekrana “Yahudiler için kutsal gün” yazdýrýn. “Pazar” ise
//ekrana  “Hýristiyanlar için kutsal gün” yazdýrýn. 
//Diler günler icin “Kutsal gün deðil” yazdýrýn
		
		Scanner scan = new Scanner(System.in);
		System.out.println("bir gun ismi giriniz");
		String gun = scan.nextLine();
		
		switch (gun) {
		case "cuma" :
			System.out.println("muslumanlar icin kutsal gun");
		    break;
		case "cumartesi" :
			System.out.println("yahudiler icin kutsal gun");
			break;
		case "pazar" :
			System.out.println("hristiyanlar icin kutsal gun");
			break;
		default :
			System.out.println("kutsal gun degildir");
		
		
		
		
		
		
		}
		
		
	}

}
