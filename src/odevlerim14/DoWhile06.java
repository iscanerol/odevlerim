package odevlerim14;

import java.util.Scanner;

public class DoWhile06 {

	public static void main(String[] args) {
//Kullanýcýdan bir String alýn ve bu String’in icinde “a” harfi varsa ekrana “a harfi var” yazdýrýn.
//“a” harfi yoksa tekrar bir String girmesini isteyin.
		
		        Scanner scan = new Scanner(System.in);
				String str = "";
				do {
					System.out.print("Bir String girin: ");
					str = scan.nextLine();
					
					if(!str.contains("a")) {
						System.out.println("Girdiginiz Stringte a harfi yok. Tekrar deneyin!");
					}
				}while(!str.contains("a"));
				
				System.out.println("'a' harfi var");
				scan.close();
	}
}
