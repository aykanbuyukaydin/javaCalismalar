package day06_ifstatements;

import java.util.Scanner;

public class C4_IfStatement4 {

	public static void main(String[] args) {
		// kullanicidan gun ismini isteyin
		// girilen gun haftaici veya haftasonu oldugunu yazdirin
		
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen bir gun giriniz");
		String gunAdi = scan.next().toLowerCase(); // ne olursa olsun buyuk yada kucuk harfi hep kucuk girilmis algýlar
		
		// eger striglerde esitlik sorguluyorsak == kullanmamaliyiz
		// stringlerde esitlik durumu sorgulamak icin equal ()
		
		// if (gunAdi=="cumartesi" || gunAdi=="pazar"); 
		// syso haftasonu yazdiramayiz
		
		if(gunAdi.equals("cumartesi") || gunAdi.equals("pazar")) {
			System.out.println("Haftasonu");
		}
		if (gunAdi.equals("pazartesi") || gunAdi.equals("sali") || 
				gunAdi.equals("carsamba") || gunAdi.equals("persembe") || 
				gunAdi.equals("cuma")) {
			System.out.println("haftaici");
		}
		
		// bu kodda yanlis gun ismi yazilirse bir durum yok 
		
scan.close();
	}

}
