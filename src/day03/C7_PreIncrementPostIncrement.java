package day03;

public class C7_PreIncrementPostIncrement {

	public static void main(String[] args) {
		
		int num = 20;
		num ++;  // 21
		System.out.println(num);  // 21 cikar
		
		System.out.println(num++); // 21 once yazdiriir sonra yazdirdiktan sonra 22 olur
		
        System.out.println(num);  // 22 olur
        
        System.out.println(++num); // once artir diyor 23 cikar
        
        System.out.println(num); // direk 23 cikar 
	}

}
