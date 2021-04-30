package odevlerim07;

import java.util.Scanner;

public class YasCinsiyetSorusu {

	public static void main(String[] args) {
		//Kullanýcýdan cinsiyetini girmesini isteyin.  Erkek ise yaþýný kontrol edin.
		//Yaþý 18 den küçük ise ekrana “Erkek çocuk” yazdýrýn. Yaþý 18 den büyük eþit ise
		//ekrana “Adam” yazdýrýn. Kadin ise yasini kontrol edin. Yaþý 18 den küçük ise
		//ekrana “Kýz çocuk” yazdýrýn. Yaþý 18 den büyük eþit ise ekrana “Kadýn” yazdýrýn.

		Scanner scan = new Scanner(System.in);
		System.out.println("cinsiyetinizi giriniz");
		String cins = scan.nextLine();
		System.out.println("yasinizi giriniz");
		int yas = scan.nextInt();
		if(cins.equalsIgnoreCase("erkek")) {
			if(yas<18) {
				System.out.println("erkek cocuk");
			}else if(yas>18) {
				System.out.println("adam");
			}
			
		}if(cins.equalsIgnoreCase("kadin")) {
			if(yas<18) {
				System.out.println("kiz cocuk");
			}else if(yas>18) {
				System.out.println("kadin");
			}
		}
		scan.close();
	}

}
