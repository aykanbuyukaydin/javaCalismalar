package day16_Foorloop;

import java.util.Scanner;

public class C2_FoorLoop2 {

	public static void main(String[] args) {
		// kullanicidan iki tam sayi alin
		// ilk sayidan ikinci sayiya kadar tum tamsayilari
		// yanyana aralarinda bosluk birakarak yazdirin

		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen 2 tane tamsayi giriniz");
		int sayi1 = scan.nextInt();
		int sayi2 = scan.nextInt();

		// simdi buyuk sayidan kucuge gidersem azaltrak gitmem gerek
		// kucuk sayidan buyuk sayiya gidersem artarak gitmem gerek
		// ona gore karar vermem lazim

		if (sayi1 > sayi2) {
			for (int i = sayi1; i >= sayi2; i--) {
				System.out.print(i + " ");
			}
		} else { // degilse yani sayi1<sayi2 demek

			for (int i = sayi1; i <= sayi2; i++) {
				System.out.print(i + " ");
			}

		}

	}
}