package odevlerim09;

import java.util.Scanner;

public class Switch04 {

	public static void main(String[] args) {
//kullan?c?dan ay ismi al?n e?er ay ismi  31 ?eken aylardan biri
//ise ekrana ?Bu ay 31 g?nd?r? yazd?r?n. E?er ay ismi  30 ?eken 
//aylardan biri ise ekrana ?Bu ay 30 g?nd?r? yazd?r?n.
//E?er ay ismi  28 veya 29 ?eken aylardan biri ise ekrana
//?Bu ay ?ubat ay?d?r? yazd?r?n. Bu isimlerin d???ndaki isimler
//i?in ?Ge?ersiz ay ismi? yazd?r?n
		
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
