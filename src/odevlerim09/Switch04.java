package odevlerim09;

import java.util.Scanner;

public class Switch04 {

	public static void main(String[] args) {
//kullanıcıdan ay ismi alın eğer ay ismi  31 çeken aylardan biri
//ise ekrana “Bu ay 31 gündür” yazdırın. Eğer ay ismi  30 çeken 
//aylardan biri ise ekrana “Bu ay 30 gündür” yazdırın.
//Eğer ay ismi  28 veya 29 çeken aylardan biri ise ekrana
//“Bu ay Şubat ayıdır” yazdırın. Bu isimlerin dışındaki isimler
//için “Geçersiz ay ismi” yazdırın
		
		Scanner scan = new Scanner(System.in);
		String ay = scan.nextLine();
		ay = ay.toLowerCase();// toLowerCase() ==> Bu method String'leri kucuk harfe cevirmek icin kullanilir
                              // toUpperCase() ==> Bu method String'leri buyuk harfe cevirmek icin kullanilir

		switch(ay) { 

		case "ocak":
            System.out.println("bu ay 31 gundur");
            break;
		case "mart":
            System.out.println("bu ay 31 gundur");
            break;
		case "mayis":
            System.out.println("bu ay 31 gundur");
            break;
		case "temmuz":
            System.out.println("bu ay 31 gundur");
            break;
		case "agustos":
            System.out.println("bu ay 31 gundur");
            break;
		case "ekim":
            System.out.println("bu ay 31 gundur");
            break;
		case "aralik":
            System.out.println("bu ay 31 gundur");
            break;
		case "nisan":
            System.out.println("bu ay 30 gundur");
            break;
		case "haziran":
            System.out.println("bu ay 30 gundur");
            break;
		case "eylul":
            System.out.println("bu ay 30 gundur");
            break;
		case "kasim":
            System.out.println("bu ay 30 gundur");
            break;
		case "subat":
            System.out.println("bu ay 28 veya 29 gundur");
            break;
            default:
                System.out.println("gecersiz ay");
                break;
		
		
		
		}
	}

}
