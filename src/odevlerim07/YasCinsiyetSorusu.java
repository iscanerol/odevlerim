package odevlerim07;

import java.util.Scanner;

public class YasCinsiyetSorusu {

	public static void main(String[] args) {
		//Kullan�c�dan cinsiyetini girmesini isteyin.  Erkek ise ya��n� kontrol edin.
		//Ya�� 18 den k���k ise ekrana �Erkek �ocuk� yazd�r�n. Ya�� 18 den b�y�k e�it ise
		//ekrana �Adam� yazd�r�n. Kadin ise yasini kontrol edin. Ya�� 18 den k���k ise
		//ekrana �K�z �ocuk� yazd�r�n. Ya�� 18 den b�y�k e�it ise ekrana �Kad�n� yazd�r�n.

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
