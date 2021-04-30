package odevlerim13;

import java.util.Scanner;

public class While05 {

	public static void main(String[] args) {
		/*
		 Kullanıcıdan bir String alın ve bu String’in ilk harfi ile son harfinin 
		 yerlerini değiştirerek ekrana yazdırın.
        Ornegin; Kullanıcı “Java” girerse ekrana “aavJ” yazdıracaksınız.
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir kelime veya cumle giriniz");
		String str = scan.nextLine();
		char ilk = str.charAt(0);
		char son = str.charAt(str.length()-1);
		System.out.println(son + str.substring(1,str.length()-1) + ilk);
		scan.close();
	}
}
