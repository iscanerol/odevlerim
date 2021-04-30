package odevlerim15;

import java.util.Scanner;

public class MethodCreation01 {

	public static void main(String[] args) {
//Kullanýcýdan isim ve soyismini alýn. Kullanýcýnýn isim ve soyisminin ilk 
//harflerini büyük diðer harflerini küçük harf olarak ekrana yazdýran programý
//yazýnýz
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen isminizi giriniz");
		String name = scan.nextLine();
		System.out.println("lutfen soyisminizi giriniz");
		String surname = scan.nextLine();
		scan.close();
		fullName(name,surname);
	}
	
	public static void fullName(String name,String surname) {
	System.out.println(name.toUpperCase().charAt(0)+ name.toLowerCase().substring(1));
	System.out.println(surname.toUpperCase().charAt(0) + surname.toLowerCase().substring(1));
	}
	
	

}
