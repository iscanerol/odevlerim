package odevlerim15;

import java.util.Scanner;

public class MethodCreation01 {

	public static void main(String[] args) {
//Kullan�c�dan isim ve soyismini al�n. Kullan�c�n�n isim ve soyisminin ilk 
//harflerini b�y�k di�er harflerini k���k harf olarak ekrana yazd�ran program�
//yaz�n�z
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen isminizi giriniz");
		String name = scan.nextLine();
		System.out.println("lutfen soyisminizi giriniz");
		String surname = scan.nextLine();
		scan.close();
		fullName(name,surname);
	}
	
	public static void fullName(String name,String surname) {
	System.out.println(name.toUpperCase().charAt(0)+ name.toLowerCase().substring(1));
	System.out.println(surname.toUpperCase().charAt(0) + surname.toLowerCase().substring(1));
	}
	
	

}
