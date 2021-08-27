package day09_ternary;

import java.util.Scanner;

public class C4_ternary4 {

	public static void main(String[] args) {
		// kullanicidan 2 sayi alın
		// sayinin tek yada cift oldugunu yazdirin
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen tam sayi giriniz");
		int sayi = scan.nextInt();
		
		System.out.println((sayi%2==0) ? "sayi ciftir" : "sayi tektir");
		
		// girilen ssayinin mutlak degerini yazdirin
		
		
		System.out.println((sayi>0) ? sayi : -sayi);
		
		
		
	}

}
