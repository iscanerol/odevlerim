package odevlerim08;

import java.util.Scanner;

public class Soru5 {

	public static void main(String[] args) {
	//Kullan�c�dan bir tamsay� girmesini isteyin, o tamsay� 3 basamakl� ise ekrana 
	//�3 Basamakl�� yazd�r�n. 3 basamakl� degilse �ift olup olmadigini kontrol edin.
	//�ift ise �3 basamakl� olmayan �ift say�� yazd�r�n. �ift say� degilse 
	//�3 basamakl� olmayan tek say� yazd�r�n.�
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen bir tam sayi giriniz");
		int num = scan.nextInt();
		String sonuc =( num<=999 && num>=100)? "uc basamakli" :
		( num%2==0 ? "uc basamakli olmayan cift" : "3 basamakli olmayan tek sayi");
		System.out.println(sonuc);

	}

}
