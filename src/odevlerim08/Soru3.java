package odevlerim08;

import java.util.Scanner;

public class Soru3 {

	public static void main(String[] args) {
		//Kullan�c�dan bir tamsay� girmesini isteyin, ekrana o tamsay�n�n mutlak degerini yazd�r�n
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen bir tam sayi giriniz");
		int num = scan.nextInt();
   int sonuc = num>=0 ? num : num*(-1);
   System.out.println(sonuc);
	}

}
