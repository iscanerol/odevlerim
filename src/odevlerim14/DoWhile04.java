package odevlerim14;

import java.util.Scanner;

public class DoWhile04 {

	public static void main(String[] args) {
//Kullanýcýya iki sayý girmesini söyleyin. Bu sayýlar eþit ise ekrana “Kare oluþturdunuz” yazdýrýn
//. Eþit deðilse tekrar iki sayý girmesini söyleyin.
		Scanner scan = new Scanner(System.in);
		System.out.println("Birinci sayiyi giriniz");
		int num1=scan.nextInt();
		System.out.println("Ýkinci sayiyi giriniz");
		int num2=scan.nextInt();
		
		do{
			if(num1==num2){
				System.out.print("Kare oluþturdunuz");
				num1++;
			}
			else{
				System.out.println("Tekrar iki sayi giriniz");
			}
		}while(num1==num2);
		
		
scan.close();


		
	}

}
