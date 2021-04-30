package odevlerim11;

import java.util.Scanner;

public class ForLoopSoru4 {

	public static void main(String[] args) {
		//kullanicidan baslangic ve bitis degerlerini alin ve baslangic degerinden baslayip bitis 
				// degerinde biten tum sayilarin toplamini ekrana yazdirin
		
		Scanner scan = new Scanner(System.in);
		System.out.println("baslangic degerini giriniz");
		int num1 = scan.nextInt();
		System.out.println("bitis degerini giriniz");
		int num2 = scan.nextInt();
		int sum = 0;
		if(num1<num2) {
			for(int i = num1; i<=num2;i++) {
				sum = sum+i;
				
			}
			System.out.println("toplamin sonucu : "+ sum);
		}else {
			for(int i = num1; i>=num2;i--){
				sum = sum +i;
				
				
			}
			System.out.println("toplamin sonucu : "+ sum);
		}
	}

}
