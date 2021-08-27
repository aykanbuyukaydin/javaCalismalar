package day07_ifelsestatements;

import java.util.Scanner;

public class C3_ifElse2 {

	public static void main(String[] args) {
		// kullanicidan bir karakter isteyin
		// harf olup olmadigini yazdirin
		
		Scanner scan = new Scanner(System.in);
	    System.out.println("bir karakter girin");
		char karakter = scan.next().charAt(0)	; // buyukleri de görmesi icin tolowercase yapabilriz
		  
		// yada asagida komut eklerim 
		if ((karakter >='a' && karakter <='z') || (karakter >='A' && karakter <='Z' )) {
			System.out.println("girdiginiz karakter harf");
		}
		else {
			System.out.println("girdiginiz karakter harf degil");
		}
scan.close();
	}

}
