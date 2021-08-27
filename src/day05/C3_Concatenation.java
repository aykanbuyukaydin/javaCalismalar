package day05;

public class C3_Concatenation {

	public static void main(String[] args) {
		
		String str1 = "Java" ;
		String str2 = "Guzeldir" ;
		
		System.out.println(str1 + str2);
		// eger arada bosluk birakmak istersek profu araya koymaktir
		
		System.out.println(str1 + " " + str2);
		
		
		System.out.println(str2 + str1);
		
		int sayi1 = 5;
		int sayi2 = 4;
		
		// verilen göre 9 yazdirin
		
		System.out.println(sayi1 + sayi2);
		
		System.out.println(sayi1 + sayi2 + str1 + str2);
		
		System.out.println(str1 + str2 + sayi1 + sayi2);
		
		
		// javaguzeldir1 yazalim
		
		System.out.println(str1 + str2 + (sayi1 - sayi2));
		
		System.out.println((sayi1 + sayi2) + " " + str1 + str2);
		
		System.out.println(sayi1 + sayi2 + ' ' + str1 + str2); // char varya ascii aldi

		
		System.out.println(sayi1 + sayi2 + str1 + ' ' + str2);
		
		System.out.println(str1 + str2 + sayi1 * sayi2);
	}

}
