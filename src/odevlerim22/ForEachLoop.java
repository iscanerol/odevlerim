package odevlerim22;

public class ForEachLoop {

	public static void main(String[] args) {
		//Bir integer array olu�turunuz ve bu array�deki tum say�lar�n �arp�m�n� For-each loop kullanarak
		//bulunuz. Sonucu ekrana yazd�r�n�z
		
		int arr[]= {10,11,12};
		int sum = 0;
		for(int w : arr) {
			w = w*w;
			sum = sum + w;
			
		}System.out.println("karalerin toplami" + "=" + sum);
	}

}
