package odevlerim09;

import java.util.Scanner;

public class Switch01 {

	public static void main(String[] args) {
//Kullan�c�dan bir gun al�n e�er gun �Cuma� ise ekrana
//�M�sl�manlar i�in kutsal g�n� yazd�r�n. �Cumartesi� ise
//ekrana �Yahudiler i�in kutsal g�n� yazd�r�n. �Pazar� ise
//ekrana  �H�ristiyanlar i�in kutsal g�n� yazd�r�n. 
//Diler g�nler icin �Kutsal g�n de�il� yazd�r�n
		
		Scanner scan = new Scanner(System.in);
		System.out.println("bir gun ismi giriniz");
		String gun = scan.nextLine();
		
		switch (gun) {
		case "cuma" :
			System.out.println("muslumanlar icin kutsal gun");
		    break;
		case "cumartesi" :
			System.out.println("yahudiler icin kutsal gun");
			break;
		case "pazar" :
			System.out.println("hristiyanlar icin kutsal gun");
			break;
		default :
			System.out.println("kutsal gun degildir");
		
		
		
		
		
		
		}
		
		
	}

}
