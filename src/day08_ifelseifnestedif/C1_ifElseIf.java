package day08_ifelseifnestedif;

import java.util.Scanner;

public class C1_ifElseIf {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen gun ismini giriniz");
		String gunIsmi =scan.nextLine();  // girilen tum yaziyi kucuk harfe cevirdik
	
		if (gunIsmi.equalsIgnoreCase("pazar") || gunIsmi.equalsIgnoreCase("pazartesi")) {
			System.out.println("Paz");
		} else if (gunIsmi.equalsIgnoreCase("sali")) {
			System.out.println("Sal");
			
		} else if (gunIsmi.equalsIgnoreCase("carsamba")) {
			System.out.println("Car");
		} else if(gunIsmi.equalsIgnoreCase("persembe")) {
			System.out.println("Per");
		}else if (gunIsmi.equalsIgnoreCase("cuma") || gunIsmi.equalsIgnoreCase("cumartesi")) {
			System.out.println("Cum");
		}else {
			System.out.println("lutfen gecerli gun ismi girin");
		}
		scan.close();
		
		}
		
			
		
	}


