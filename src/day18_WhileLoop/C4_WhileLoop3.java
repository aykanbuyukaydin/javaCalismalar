package day18_WhileLoop;

import java.util.Scanner;

public class C4_WhileLoop3 {

	public static void main(String[] args) {
		// Kullanicidan baslangic ve bitis haflerini alin ve 
		//baslangic harfinden baslayip bitis harfinde biten tum harfleri 
		// buyuk harf olarak ekrana yazdirin. Kullanicinin hata yapmadigini farz edin.

		
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen baslangic harfi giriniz");
		char basHarf = scan.next().toUpperCase().charAt(0);  // örnegin C girmis olsun
		
		System.out.println("lutfen bitis harfi girin");
		char bitHarf = scan.next().toUpperCase().charAt(0);  // ornegin F girmis olsun
		
		
		// for loop ile yapalim
		
		for (char i = basHarf; i <= bitHarf; i++) {
			System.out.print(i + " ");
		}
		System.out.println("");
		// while loop ile yapalim
		
		// baslangic degeri kullanici girecek tekrar olusturmaya gerek yok
		
		while (basHarf<=bitHarf) {
			System.out.print(basHarf + " ");
			basHarf++;
		}
		
	
	
	}

}
