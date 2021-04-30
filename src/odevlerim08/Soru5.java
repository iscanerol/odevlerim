package odevlerim08;

import java.util.Scanner;

public class Soru5 {

	public static void main(String[] args) {
	//Kullanýcýdan bir tamsayý girmesini isteyin, o tamsayý 3 basamaklý ise ekrana 
	//“3 Basamaklý” yazdýrýn. 3 basamaklý degilse çift olup olmadigini kontrol edin.
	//Çift ise “3 basamaklý olmayan çift sayý” yazdýrýn. Çift sayý degilse 
	//“3 basamaklý olmayan tek sayý yazdýrýn.”
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen bir tam sayi giriniz");
		int num = scan.nextInt();
		String sonuc =( num<=999 && num>=100)? "uc basamakli" :
		( num%2==0 ? "uc basamakli olmayan cift" : "3 basamakli olmayan tek sayi");
		System.out.println(sonuc);

	}

}
