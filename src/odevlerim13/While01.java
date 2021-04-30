package odevlerim13;

public class While01 {

	public static void main(String[] args) {
		//)8 den 180 e kadar 5 in kati olan tum tamsayýlarý ekrana yazdýrýnýz
		//for kullanarak cozum
		
		
		for(int i = 8;i<=180; i++) {
			if(i%5==0) {
				System.out.print(i + "-");
			}
			
		}
		System.out.println("sonra");
		int i1 = 8;
		while(i1<=180) {
			if(i1%5==0) {
				System.out.print(i1 + "-");			}
			i1++;
		}
	}

}
