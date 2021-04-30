package odevlerim22;

public class odevlerim4 {

	public static void main(String[] args) {
//Bir String oluþturunuz, bu String’deki character’leri yukarýdan aþaðýya for-each loop kullanarak 
		//yazdýrýnýz.  Ýpucu: split()
		
		String str = "Javayi sevecegim";
		String cumle[] = str.split("");
		for(String w : cumle) {
			System.out.println(w);
		}
		
		
		
		
		
	}

}
