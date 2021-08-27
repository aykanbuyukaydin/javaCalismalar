package day17_FoorLoop;

import java.util.Scanner;

public class C2_FoorLoop2 {
	public static void main(String[] args) {
		/*
		 Kullanicidan bir tamsayi girmesini isteyin
		 sayi negatif veya sifirsa "Lutfen pozitif bir tamsayi giriniz" yazdirin
		 Girilen Sayinin rakamlar toplamini ayri bir method'da hesaplayin
		
		 Main method icinde Kullanicidan bir sinir deger isteyin
		 rakamlar toplami sinir degerden buyukse
		 "Girdiginiz sayinin rakamlar toplami, girdiginiz sinir degerinden buyuk",
		 degilse "Girdiginiz sayinin rakamlar toplami, girdiginiz sinir degerinden buyuk degil"
		 yazdirin		
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen bir tamsayi girin");
		int sayi = scan.nextInt();
		System.out.println("lutfen sinir deger icin pozitif tamsayi girin");
		int sinir = scan.nextInt();
		
		if (sayi<=0) {
			System.out.println("lutfen pozitif tam sayi girin");
			}else {
				if(rakamlarToplamiHesapla(sayi)>sinir) {
					System.out.println("girdiginiz sayinin rakamlar toplami, sinir degerinden buyuk");
				}else {
					System.out.println("girdiginiz sayinin rakamlar toplami, sinir degerinden kucuk");
				}
			}

	}
	public static int rakamlarToplamiHesapla(int sayi) {
		
		int rakamlarToplami=0;
		String sayi2=sayi+"";
		
		for (int i = 1 ; i<=sayi2.length() ; i++) {
			rakamlarToplami+=sayi%10;
			sayi/=10;
		}
		
		return rakamlarToplami;
		
	}
}
