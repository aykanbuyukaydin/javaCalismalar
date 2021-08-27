package day17_FoorLoop;

import java.util.Scanner;

public class C3_FoorLoop3 {

	public static void main(String[] args) {
		// kullanicidan 35 dan kucuk pozitif bir sayi alin
		// girilen sayinin faktoriyelini hesaplayýp yazdiran bir method olusturun
		
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen 35 dan kucuk pozitif bir sayi yazin");
		int sayi = scan.nextInt();
		
		if (sayi<=0 || sayi>=35) {
			System.out.println("lutfen gecerli sayi giriniz");
		}else {
			faktoriyelBul(sayi);
		}
	}

	private static void faktoriyelBul(int sayi) {
		long faktoriyel =1;
		
		for (int i = 1; i <= sayi; i++) {
			faktoriyel*=i;
		}
		System.out.println(faktoriyel);
		
	}

}
