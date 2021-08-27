package day16_Foorloop;

import java.util.Scanner;

public class C3_FoorLoop3 {

	public static void main(String[] args) {
		// kullanicidan pozitif bir tamsayi alin
		// 1'den kullanicinin girdigi sayiya kadar tum tamsayilarin toplamini
		// yazdirin

		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen pozitif bir tamsayi giriniz");
		int sayi = scan.nextInt();

		int toplam = 0;

		for (int i = 1; i <= sayi; i++) {
			// toplam=toplam+i diyebiliriz
			toplam += i; // ayni am adaha profesyonel
		}
		System.out.println(toplam);
	}

}
