package odevlerim09;

import java.util.Scanner;

public class Switch02 {

	public static void main(String[] args) {
//Kullan�c�dan bir harf al�n e�er harf �a, e, i, o, u� dan biri
//ise ekrana �Sesli harf� yazd�r�n. �b, c, d, f� den biri ise
//ekrana �Sessiz harf� yazd�r�n. Bu harflerin d���nda 
//bir character i�in �Ge�ersiz character� yazd�r�n.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("bir harf giriniz");
		char harf = scan.next().charAt(0);
		
		switch (harf) {
		case 'a' :
			System.out.println("sesli harf");
		    break;

		case 'e' :
			System.out.println("sesli harf");
		    break;
		case 'i' :
			System.out.println("sesli harf");
		    break;
		case 'o' :
			System.out.println("sesli harf");
		    break;
		case 'u' :
			System.out.println("sesli harf");
		    break;
		case 'b' :
			System.out.println("sessiz harf");
		    break;
		case 'c' :
			System.out.println("sessiz harf");
		    break;
		case 'd' :
			System.out.println("sessiz harf");
		    break;
		case 'f' :
			System.out.println("sessiz harf");
		    break;
		    default :
		    	System.out.println("gecersiz character");
	}
	}
}
