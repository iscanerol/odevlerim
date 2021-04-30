package odevlerim08;

import java.util.Scanner;

public class Soru2 {

	public static void main(String[] args) {
		//Kullanýcýdan iki tamsayý girmesini isteyin, ekrana her zaman büyük olanýný yazdýrýn
		
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen iki tam sayi giriniz");
		int num = scan.nextInt();
	    int num1 = scan.nextInt();
	    int sonuc = num>num1 ? num : num1 ;
	    System.out.println(sonuc);
	}

}
