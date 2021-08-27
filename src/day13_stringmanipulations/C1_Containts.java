package day13_stringmanipulations;

import java.util.Scanner;

public class C1_Containts {

	public static void main(String[] args) {
		// kullanicidan bir cumle ve aramak istedigi bir stringi isteyin
		// cumle stringi iceriyorsa basarili icermiyorsa basarisiz yazdirin
		
		Scanner scan = new Scanner(System.in);		
		System.out.println("lutfen bir cumle giriniz");
		String cumle = scan.nextLine().toLowerCase();
		System.out.println("lutfen aramami istediginiz stringi girin");
		String aranan = scan.nextLine().toLowerCase();
		
		// cumle.contains(aranan) 
		
		System.out.println(cumle.contains(aranan) ? "basarili" : "basarisiz");
		
		
		// kullanicidan mail adresini isteyin
		// mail adresi @gmail.com iceriyorsa
		// mailiniz kaydedildi yoksa lutfen gmail adresinizi giriniz yazsin
		
		
		System.out.println("lutfen mail adresini giriniz");
		String email = scan.next().toLowerCase();
		
		  // email.contains("@gmail")
		
		if (email.contains("@gmail")) {
			System.out.println("mailiniz kaydedildi");
		}else {
			System.out.println("luten gmail adresinizi giriniz");
		}
		
		// eger @gmail.com un en sonda oldugunu kontrol etmek istersek
		int son = email.indexOf("@gmail.com", email.length()-10); // index olarak length-10 yqzmamm @gmail gotururur sonda
		// eger email@gmail.com ile bitiyorsa bu islemin sonucu bir index olur (int)
		// eger email@gmail.com ile bitmiyorsa -1 olacak
		if (email.contains("@gmail.com") && son!=-1) {
			System.out.println("mailiniz kaydedildi");
		}else {
			System.out.println("lutfen gecerli mail adresinizi giriniz");
			
			
	//  aslinda buda olmadi cunku adama studen@gmail.com@gmail.com yazabilir
			
		}
		
		
		
		
	}

}
