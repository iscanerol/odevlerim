package odevlerim22;

public class odevlerim4 {

	public static void main(String[] args) {
//Bir String olu�turunuz, bu String�deki character�leri yukar�dan a�a��ya for-each loop kullanarak 
		//yazd�r�n�z.  �pucu: split()
		
		String str = "Javayi sevecegim";
		String cumle[] = str.split("");
		for(String w : cumle) {
			System.out.println(w);
		}
		
		
		
		
		
	}

}
