package odevlerim14;

import java.util.Scanner;

public class DoWhile06 {

	public static void main(String[] args) {
//Kullan�c�dan bir String al�n ve bu String�in icinde �a� harfi varsa ekrana �a harfi var� yazd�r�n.
//�a� harfi yoksa tekrar bir String girmesini isteyin.
		
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
