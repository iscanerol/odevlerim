package odevlerim13;

import java.util.Scanner;

public class While03 {

	public static void main(String[] args) {
		// S0RU 3:Kullanýcýdan bir sayý alýn ve bu sayýnýn bölenlerini hem for loop hem
		// de while loop
//      kullanarak ekrana yazdýrýnýz.
//		Ornegin; 12'nin bölenleri 1, 2, 3, 4, 6, 12 dir.		

		Scanner scan = new Scanner(System.in);
		System.out.println("bir sayi  giriniz");
		int num1 = scan.nextInt();
		// for(int i = 1;i<=num1; i++) {
		// if(num1%i==0) {
		// System.out.println(i);
		// }

		// }
		int i1 = 1;
		while (i1 <= num1) {
			if (num1 % i1 == 0) {
				System.out.print(i1 + " ");

			}
			i1++;
		}
		scan.close();
	}

}
