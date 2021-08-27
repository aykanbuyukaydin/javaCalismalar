package day09_ternary;

import java.util.Scanner;

public class C5_NestedTernary {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen iki kenar giriniz");
		double sayi1 = scan.nextDouble();
		double sayi2 = scan.nextDouble();
		
		// System.out.println(sayi1==sayi2 ? "kare" : "kare degil");
		
		System.out.println(sayi1>0 && sayi2>0 ? sayi1==sayi2 ? "kare" : "kare degil" : "gecersiz kenar uzunlugu" );
	
	// yada
	// String sonuc = sayi1>0 && sayi2>0 ? sayi1==sayi2 ? "kare" : "kare degil" : "gecersiz kenar uzunlugu" 	
	//System.out.println(sonuc);
	}

}
