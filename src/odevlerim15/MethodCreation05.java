package odevlerim15;

import java.util.Scanner;

public class MethodCreation05 {

	public static void main(String[] args) {
//Kullan�c�ya bir String girmesini s�yleyin ve bu String�i yukar�dan a�a��ya do�ru yazd�ran 
//Program yaz�n�z. Ornegin; CAN ==> C
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen bir kelime giriniz");
		String str = scan.nextLine();
		scan.close();
		int length = str.length();
		yukaridanAsagi(str, length);
	}

	public static void yukaridanAsagi(String str, int length) {

		int i = 0;
		do {
			System.out.println(str.charAt(i));
			i++;
		} while (i < length);
	}

}
