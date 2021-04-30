package odevlerim13;

import java.util.Scanner;

public class While06 {

	public static void main(String[] args) {
		//Kullanýcýdan bir String alýn ve bu String’in icinde “a” harfi varsa “a” harfinin ilk
		//görünümünün  indexini ekrana yazdýrýn. “a” harfi yoksa ekrana “a harfi yok” yazdýrýn
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir kelime veya cumle giriniz");
		String str = scan.nextLine();
		if(str.contains("a") ) {
			System.out.println(str.indexOf("a"));
		}else {
			System.out.println("girdiginiz kelimenin icinde a harfi yoktur");
		}
	}

}
