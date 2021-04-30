package odevlerim08;

import java.util.Scanner;

public class Soru6 {

	public static void main(String[] args) {
	//Kullanýcýdan bir yýl girmesini isteyin, yýl artýk yýl ise ekrana “Artýk yýl” degilse 
	//ekrana “Artýk yýl degil” yazdýrýn

		
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen yil  giriniz");
		int yil = scan.nextInt();
		String sonuc = (yil%100==0 && yil%400==0) ? "Artik yil" : 
			(yil%4==0 && yil%100==0) ? "artik yil" : "artik yil degil";
		System.out.println(sonuc);
		scan.close();
	}

}
