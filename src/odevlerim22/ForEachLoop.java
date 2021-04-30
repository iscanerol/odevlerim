package odevlerim22;

public class ForEachLoop {

	public static void main(String[] args) {
		//Bir integer array oluþturunuz ve bu array’deki tum sayýlarýn çarpýmýný For-each loop kullanarak
		//bulunuz. Sonucu ekrana yazdýrýnýz
		
		int arr[]= {10,11,12};
		int sum = 0;
		for(int w : arr) {
			w = w*w;
			sum = sum + w;
			
		}System.out.println("karalerin toplami" + "=" + sum);
	}

}
