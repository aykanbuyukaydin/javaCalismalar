package day10_switchcase;

import java.util.Scanner;

public class C2_Ternary2 {

	public static void main(String[] args) {
		// kullanicidan bir sayi alin
		// sayi cift ise "cift" yazsin
		// degilse sayinin karesi alsin
		
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen bir tamsayi giriniz");
		int sayi = scan.nextInt();

		 //(islemin data tipi karisik hem string var hem double o yuzden bir atama yapma direk syso icinde islem yap) sonuc = sayi%2==0 ? "cifttir" : sayi*sayi ;
		 
		 System.out.println(sayi%2==0 ? "cifttir" : sayi*sayi);
	}

}
