package day09_ternary;

import java.util.Scanner;

public class C3_ternary3 {

	public static void main(String[] args) {
		// kullanicidan 2 sayi alın
		// buyuk olani yazdirin
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen iki sayi giriniz");
		double sayi1 = scan.nextDouble();
		double sayi2 = scan.nextDouble();
	
		
		double sonuc = (sayi1>=sayi2) ? sayi1 : sayi2 ;
		 System.out.println(sonuc);
		 
		// yada direk 
		// System.out.println((sayi1>=sayi2) ? sayi1 : sayi);
	}

}
