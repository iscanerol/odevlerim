package odevlerim14;

import java.util.Scanner;

public class DoWhile02 {
	public static void main (String[]args) {
//Kullanýcýdan baþlangýç ve bitiþ  deðerlerini alýn ve baþlangýç deðerinden baþlayýp bitiþ deðerinde
//biten 4 ve 6 ile bölünebilen tüm tamsayýlarý ekrana yazdýrýnýz
		
		Scanner scan = new Scanner(System.in);
		System.out.println("baslangic degerini    giriniz");
		int num1 = scan.nextInt();
		System.out.println("bitis degerini giriniz");
		int num2 = scan.nextInt();
		 int i =num1;
		 do {
			 if(i%4==0 && i%6==0) {
				 System.out.print(i + "-");
			 }i++;
		 }while(i<=num2);
		 scan.close();
	}

}
