package odevlerim13;

import java.util.Scanner;

public class While06 {

	public static void main(String[] args) {
		//Kullan�c�dan bir String al�n ve bu String�in icinde �a� harfi varsa �a� harfinin ilk
		//g�r�n�m�n�n  indexini ekrana yazd�r�n. �a� harfi yoksa ekrana �a harfi yok� yazd�r�n
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
