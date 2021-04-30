package odevlerim15;

import java.util.Scanner;

public class MethodCreation03 {

	public static void main(String[] args) {
//Kullan�c�ya say� girmesini s�yleyin. Kullan�c�n�n girdi�i say�n�n rakamlar� toplam�n� ekrana 
//yazd�ran bir program yaz�n
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir sayi giriniz: ");
		int num = scan.nextInt();
		
		rakamlariToplami(num);
		
		scan.close();
	}
	
	public static void rakamlariToplami (int num) {
		
		int sum = 0;
		while (num >= 1) {
			sum = sum + (num % 10); 
			num = num / 10;
		}
		
		System.out.println(sum);

	}

}
