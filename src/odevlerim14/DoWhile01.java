package odevlerim14;

public class DoWhile01 {

	public static void main(String[] args) {
		//9 den 190 e kadar 7 nin kati olan t�m tamsay�lar� ekrana yazd�r�n�z
		int i = 9;
		do {
			if(i%7==0) {
				System.out.print(i+"-");
				
			}i++;	
		}while(i<=190);
	}

}
