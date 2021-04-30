package odevlerim14;

import java.util.Scanner;

public class DoWhile06Deneme {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String password = "";

		

		do {			

			System.out.println("Passwordunuzu giriniz");

			password = scan.nextLine();

			

			if(password.equals("AliCan")) {

				System.out.println("Dogru");

			}else {

				System.out.println("Yanlis");

			}
scan.close();
			

		}while(!(password.equals("AliCan")));
}
	}


