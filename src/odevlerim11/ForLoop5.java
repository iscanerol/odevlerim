package odevlerim11;

import java.util.Scanner;

public class ForLoop5 {

	public static void main(String[] args) {
		//kullanicidan baslangic ve bitis degerlerini alin ve baslangic degerinden baslayip bitis 
		// degerinde biten tum sayilarin carpimini ekrana yazdirin
		Scanner scan = new Scanner(System.in);
		System.out.println("baslangic degerini giriniz");
		int num1 = scan.nextInt();
		System.out.println("bitis degerini giriniz");
		int num2 = scan.nextInt();
		int product = 1;
		if(num1<num2) {
			for(int i = num1; i<=num2;i++) {
				product = product*i;
				
			}
			System.out.println("carpimin sonucu : "+ product);
		}else {
			
			for(int i = num1; i>=num2;i--){
				product = product*i;
				
			}
			System.out.println("carpimin sonucu"+ product);
				
			
			
	}}

}
