package odevlerim08;

import java.util.Scanner;

public class TernarySorulari {

	public static void main(String[] args) {
// Kullanýcýdan bir tamsayý girmesini isteyin, tamsayý çift ise ekrana “Çift” tek ise 
		//ekrana “Tek” yazdirin
		
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen bir tam sayi giriniz");
		int num = scan.nextInt();
		 
		String sonuc = num%2==0 ? "cift" : "tek";
		System.out.println(sonuc);
	}

}
