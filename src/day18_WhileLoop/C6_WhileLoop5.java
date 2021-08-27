package day18_WhileLoop;

public class C6_WhileLoop5 {

	public static void main(String[] args) {
		// verilen sayinin asal olup olmadigini bulan bir program yazin
		
		int sayi=50;
		
		String flag="asal"; // flag=bayrak demek bizim istedigimiz sartin gerceklesip gerceklesmedigini kontrol eder
		
		int bolen=2;
		while (bolen<sayi) {
			if(sayi%bolen==0) {
				flag="asal sayi degil";
				
			}
			bolen++;
		}
System.out.println(flag);
	}

}
