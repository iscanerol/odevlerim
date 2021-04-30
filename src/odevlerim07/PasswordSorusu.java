package odevlerim07;

import java.util.Scanner;

public class PasswordSorusu {

	public static void main(String[] args) {
   //Kullanýcýdan password girmesini isteyin.  Girdiði password 5’e bölünüyorsa son rakamýný
	//kontrol edin. Son rakamý 0 ise ekrana “5’e bölünen çift sayý” yazdýrýn.
  //Son rakamý 0 deðil ise “5’e bölünen tek sayý” yazdýrýn. Girdiði password 5’e bölünmüyorsa
    //ekrana “Tekrar deneyin” yazdýrýn
		

		Scanner scan = new Scanner(System.in);
		System.out.println("password giriniz");
		int password = scan.nextInt();
		if (password%5==0) {
			if(password%10==0) {
				System.out.println("5 e bolunen cift sayidir");
			}else {
				System.out.println("5 e bolunen tek sayidir");
			}
		}else {
			System.out.println("tekrar deneyin");
		}
		scan.close();
	}

}
