package odevlerim19;

public class Arrays01 {

	public static void main(String[] args) {
     
		//int arr[] = {10,20,30,40,50};
		//for(int i = 0; i<arr.length; i++) {
		//	System.out.println(" " + arr[i]);
		//}
				
		int arr[] = new int[5];

		int count = 1;

		for(int i=0; i<5; i++){

		     arr[i] = count;

		     count+=2;
		     System.out.println(i);

		}
	}

}
