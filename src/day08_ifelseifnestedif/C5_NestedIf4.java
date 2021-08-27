package day08_ifelseifnestedif;

import java.util.Scanner;

public class C5_NestedIf4 {

	public static void main(String[] args) {
	// Nested If kullanarak asagidaki soruyu cozen kodu yaziniz.
	// Kullanicidan bir sifre girmesini isteyin
	// Eger ilk harf buyuk harf ise “A” olup olmadigini kontrol edin. Ilk harf A ise  “Gecerli Sifre” degilse “Gecersiz Sifre” yazdirin.
	// Eger ilk harf kucuk harf ise “z” olup olmadigini kontrol edin. Ilk harf z ise  “Gecerli Sifre” degilse “Gecersiz Sifre” yazdirin.

		
		// 1. islem sifreyi alip ilk harfine bak
		// buyuk harf mi kucuk harf mi
		
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen sifrenizi giriniz");
		char ilkHarf= scan.next().charAt(0); // girilen sifrenin ilk karakterini alýr
		
		if (ilkHarf>='A' && ilkHarf<='Z') { // ilk harf buyuk A ise
			if (ilkHarf=='A') { // sifre buyuk harf ise 
				System.out.println("sifre gecerli");
			}else { // degilse
				System.out.println("sifre gecersiz");
			}
			
			
		}else if (ilkHarf>='a' && ilkHarf<='z') { // ilk harf kucuk ise
			if (ilkHarf=='z') { // ilk harf kucuk z ise
				System.out.println("sifre gecerli");
			} else { // degilse
				System.out.println("sifre gecersiz");
			}
			
		}else {   // ilk harf buyuk yada kucuk degilse
			System.out.println("sifre gecersiz");
		}
		
	}

}
