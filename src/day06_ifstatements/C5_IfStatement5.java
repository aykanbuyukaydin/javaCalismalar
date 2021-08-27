package day06_ifstatements;

import java.util.Scanner;

public class C5_IfStatement5 {

	public static void main(String[] args) {
		// kullanicidan iki kenar iste
		// kenar uzunlukları esitse kare yazilsin
		// degilse dikdortgen yazilsin
		
		Scanner scan = new Scanner(System.in);
		System.out.println("lufen dörtgenin kenarlarini girin");
		
		double kenar1 =scan.nextDouble();
		double kenar2 =scan.nextDouble();
		
		if (kenar1>0 && kenar2>0 && kenar1==kenar2) {
			System.out.println("kare");
			
		}
		
		if (kenar1>0 && kenar2>0 && kenar1!=kenar2) {
			System.out.println("dikdortgen");
		}
		
		if (kenar1<=0 || kenar2<=0) {
			System.out.println("lutfen gecerli uzunluk girin");
		}
		// bug: yazilimdaki hatalara denir
		scan.close();

	}

}
