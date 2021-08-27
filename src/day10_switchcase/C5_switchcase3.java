package day10_switchcase;

import java.util.Scanner;

public class C5_switchcase3 {

	public static void main(String[] args) {
		// kullanicidan hangi gunde oldugumuzu isteyin yaziyla
		// girilen gunun haftaici veya haftasonu
		// oldugunu yazdirin
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen bir gun girin");
		String gun = scan.next().toLowerCase();
		
		switch(gun) {
		case "pazartesi" : // eger syso lar kalsaydi hepsi altta alta hafta ici yazardi biz bir kere verdik
		case "sali" :
	    case "carsamba" :
	    case "persembe" :
	    case "cuma" :
	    System.out.println("hafta ici");
	        break;
		case "cumartesi" :   
		case "pazar" :
	    System.out.println("haziran");
	        break;
	    default :
	    System.out.println("lutfen gecerli gun giriniz");
		}
		
		scan.close();
	}
	

}
