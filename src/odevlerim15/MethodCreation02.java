package odevlerim15;

import java.util.Scanner;

public class MethodCreation02 {

	public static void main(String[] args) {
//Kullanıcıdan iki sayı alın bu sayılar eşit ise ekrana “Eşit”, birinci sayı büyük ise ekrana 
//“Birinci sayı büyük”, ikinci sayı büyük ise ekrana “Ikinci sayı büyük” yazdırınız
		
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen iki sayi giriniz");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		scan.close();
		number(num1,num2);
	}
	public static void number(int num1 ,int num2) {
		if(num1==num2) {
			System.out.println("esit");
			
		}else if(num1>num2) {
			System.out.println("birinci sayi buyuk");
			
		}else {
			System.out.println("ikinci sayi buyuk");
		}
	}

}
