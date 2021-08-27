package day16_Foorloop;

import java.util.Iterator;
import java.util.Scanner;

public class C1_FoorLoop1 {

	public static void main(String[] args) {
		// kullanicidan pozitif iki sayi alin
		// aldiginiz degerlerden kucuk olandan baslayip buyuk olana kadar
		//tum sayilari yanyana yazdirin
		
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen iki pozitif sayi giriniz");
		int sayi1 =scan.nextInt();
		int sayi2 =scan.nextInt();
		
		int buyukSayi=0 ;  // =0 yapabilirz sikinti yok for icin daha iyi oluyor
		int kucukSayi=0 ;
		
	if (sayi1<1 || sayi2<0) {
		System.out.println("lutfen pozitif sayi giriniz");
	}else if (sayi1>sayi2) {
		buyukSayi=sayi1;
		kucukSayi=sayi2;
	}else {
		buyukSayi=sayi2 ;
		kucukSayi=sayi1;
	}

	for (int i=kucukSayi; i<=buyukSayi ; i++ ) {
		System.out.print(i + ",");
	}
	
	}

}