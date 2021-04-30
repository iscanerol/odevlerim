package odevlerim11;

import java.util.Scanner;

public class ForLoopSoru2 {

	public static void main(String[] args) {
//kullanicidan baslangic ve bitis degerini alin ve baslangic degerinden veya sonrasindan baslayip
//bitis degerinde ve ya oncesinde biten tum cift sayilari ekrana yazdirin
		Scanner scan = new Scanner(System.in);
		System.out.println("baslangic degerini giriniz");

		int num1 = scan.nextInt();
		System.out.println("bitis degerimizi giriniz");
		int num2 = scan.nextInt();
		if (num1 < num2) {
			for (int i = num1; i <= num2; i++) {
				if(i%2==0) {
					System.out.print(i + " ");
				}
			}
				
			

		} else {
			for (int i = num1; i >= num2; i--) {
				
				if(i%2==0) {
					System.out.print(i + " ");
				
			}
	}

		}
	}}
