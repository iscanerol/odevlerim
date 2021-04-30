package odevlerim07;

import java.util.Scanner;

public class OdevHarfSorusu {

	public static void main(String[] args) {
	//Kullanýcýdan bir harf girmesini isteyin.  Girdiði küçük harf ise harfin
	//“a” olup olmadýðýný kontrol edin. Harf “a” ise ekrana “Ilk küçük harf” yazdýrýn.
	//“a” deðil ise ekrana “Ilk küçük harf deðil” yazdýrýn. Girdiði büyük harf ise
	//harfin “Z” olup olmadýðýný kontrol edin. Harf “Z” ise ekrana “Son büyük harf” yazdýrýn.
		//“Z” deðil ise ekrana “Son büyük harf deðil” yazdýrýn

		Scanner scan= new Scanner(System.in);
		System.out.println("lutfen bir harf giriniz");
		char harf = scan.next().charAt(0);
		if (harf >= 97 && harf <=122 ) {
			if (harf == 'a') {
				System.out.println("Ýlk Küçük Harf = " + harf + " dýr.");
			}
			else {
				System.out.println(harf + " Ýlk Küçük Harf Deðil");
			}
		}
		else if (harf >= 65 && harf <= 90) {
			if (harf == 'Z') {
				System.out.println("Son Büyük Harf = " + harf + " dir.");
			}
			else {
				System.out.println(harf + " Son Büyük Harf Deðildir.");
			}
		}
		else {
			System.out.println("Lütfen Büyük Veya Küçük Harf Girin");
		}
		
		scan.close();
	}
		}
