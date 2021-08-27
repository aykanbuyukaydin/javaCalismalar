package day12_stringmanipulations;

import java.util.Scanner;

public class C4_IndexOf {

	public static void main(String[] args) {
		// IndexOf() methodu bize istedigimiz karakterlerin indexsini döndürüür
		
		String str = "Java ogren, is sahibi ol" ;
		System.out.println(str.charAt(6)); // g yazdirir
		
		System.out.println(str.indexOf('g')); // 6 yazdircak
		
		System.out.println(str.indexOf("g"));  // 6 yazacak
		
		System.out.println(str.indexOf("is")); // 12 vercek
		                                    // is tek karakter gibi gorup islem yapacak
		
		System.out.println("birden fazla ise ayni karakter varsa" + str.indexOf("i")); // ilk i yi getirir

		// javadan sonraki ilk a nin indexi nedir desem ??
		
		System.out.println(str.indexOf('a', 3)); // once karakteri gir sonra baslangic indexi 4 ver java ya 3 dahil gorur
		
		// olmayan harfi sorsak
		
		System.out.println(str.indexOf("dert"));
		
		// kullanicidan bir cumle isteyin
		// harf duyarliligi olmadan Java kelimesi icerip icermedigini yazdirin
		
		Scanner scan = new Scanner (System.in);
		System.out.println("lutfen bir cumle girin");
		String cumle = scan.nextLine().toLowerCase();
		
		// int sonuc = cumle.indexOf("java"); // eger java varsa ilk java kelimesinin indexsini dondurur
		                                       // yoksa -1 yazar
		
		System.out.println(cumle.indexOf("java")==-1 ? "java icermiyor" : "java iceriyor");
		
	}

}
