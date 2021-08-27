package day10_switchcase;

import java.util.Scanner;

public class C6_switchcase4 {

	public static void main(String[] args) {
		// kullanicidan VIP kisaltmasinda hangi harfin
		// anlamini soralim
		// girilen harfin açiklamsini yazlim
		// very important person
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("VIP icin hangi harfin aciklamsini istiyorsan yazin");
		char vip = scan.next().toLowerCase().charAt(0);
		
		switch(vip) {
		case 'v' :
			System.out.println("very");
	        break;	
		case 'i' :
			System.out.println("important");
	        break;
	    case 'p' :
	    	System.out.println("person");
	        break;
	    default :
	    System.out.println("lutfen gecerli harf giriniz");
		}
		
		// kullanicinin birden fazla harf girmesini sorun yapip gecersiz harf
		// olarak yazmasini istiyorsan örnek vali
		
		
		System.out.println("VIP icin hangi harfin aciklamsini istiyorsan yazin");
		String str = scan.next().toLowerCase();
		
		switch(str) {
		case "v" :
			System.out.println("very");
	        break;	
		case "i" :
			System.out.println("important");
	        break;
	    case "p" :
	    	System.out.println("person");
	        break;
	    default :
	    System.out.println("lutfen gecerli harf giriniz");
		}
		scan.close();
	}

}
