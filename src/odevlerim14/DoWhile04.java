package odevlerim14;

import java.util.Scanner;

public class DoWhile04 {

	public static void main(String[] args) {
//Kullan�c�ya iki say� girmesini s�yleyin. Bu say�lar e�it ise ekrana �Kare olu�turdunuz� yazd�r�n
//. E�it de�ilse tekrar iki say� girmesini s�yleyin.
		Scanner scan = new Scanner(System.in);
		System.out.println("Birinci sayiyi giriniz");
		int num1=scan.nextInt();
		System.out.println("�kinci sayiyi giriniz");
		int num2=scan.nextInt();
		
		do{
			if(num1==num2){
				System.out.print("Kare olu�turdunuz");
				num1++;
			}
			else{
				System.out.println("Tekrar iki sayi giriniz");
			}
		}while(num1==num2);
		
		
scan.close();


		
	}

}
