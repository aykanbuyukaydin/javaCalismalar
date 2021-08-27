package day13_stringmanipulations;

import java.util.Scanner;

public class C4_Replace {

	public static void main(String[] args) {
		// kulanicidan bir cumle isteyin
		// cumledeki tüm bosluklari silin ve tum a larin yerine e yazirin
		
		Scanner scan = new Scanner(System.in);
		System.out.println("bir cumle giriniz");
		String cumle = scan.nextLine();
		
		cumle=cumle.replace(" ", "");
		cumle=cumle.replace("a", "e");
		System.out.println(cumle); // bunun yerine atama yapmak yada
		                           // direk yazdirmak daha mantiklidir
		                           /// cunku cumlemin orjinali elimde olsun diye
		
		System.out.println("lutfen bir cumle daha girin");
		String cumle2= scan.nextLine();
		
		System.out.println(cumle2.replace(" ", "").replace("a", "e"));
		
		// hem a hem e nin yerine i yazalim
		
		System.out.println(cumle2.replace("a", "i").replace("e", "i"));
		
		// hem a hem e nin yerine i yazalim buyuk kucuk harf gozetmeksizin
		
		System.out.println(cumle2.toLowerCase().replace("a", "i").replace("e", "i"));
	}

}