package day13_stringmanipulations;

import java.util.Scanner;

public class C8_Examples3 {

	public static void main(String[] args) {
		// Kullanicidan ismini soyidimi ve kredi karý bilgileirni
		// isteyin ve 
		// isim-soyisim : M** B***
		// kart no **** **** *** 1234 yazdirin
		
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen isminizi girin");
		String isim = scan.next();
		
		
		System.out.println("lutfen soyisminizi girin");
		String soyisim = scan.next();
		
		
		System.out.println("lutfen kart no girin");
		String kartNo = scan.next();
		
		char isimIlkHarf = isim.toUpperCase().charAt(0);
		String isimGeriKalan = isim.substring(1).replaceAll("\\w", "*") ;
		String soyisimIlk = soyisim.toUpperCase().substring(0, 1); // farketmez char ile olurdu string ile gorduk
		String soyisimGeriyeKalan =soyisim.substring(1).replaceAll("\\w", "*");
		String kartNoBasi = "**** **** **** " ;
		String kartNoSonu=kartNo.substring(kartNo.length() -4);
		System.out.println("isminiz ve soyisminiz : " + isimIlkHarf + isimGeriKalan + " " +
				                                         soyisimIlk + soyisimGeriyeKalan);
		
		System.out.println("kart no : " + kartNoBasi + kartNoSonu);
				

	}

}
