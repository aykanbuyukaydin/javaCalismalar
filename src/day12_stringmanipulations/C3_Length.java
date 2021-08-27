package day12_stringmanipulations;

import java.util.Scanner;

public class C3_Length {

	public static void main(String[] args) {
		// kulanicidan bir string isteyin
		// girilen stringin son harfini buyuk harf olark yazdirin
		
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen bir cumle yazin");
		String sonHarf = scan.nextLine().toUpperCase();
		
		System.out.println("girdiginiz cumlenin son harfi " + sonHarf.charAt(sonHarf.length()-1));
		
		// length methodu girilen stringin uzunlugunu verir
		
		String str2 = "";
		System.out.println(str2.length()); // 0 yazar
		
		String str3 = null ; // null hiç demek
		// System.out.println(str3.length()); // null case sensitivedir
		                                   // dulayisiyla NULL veya Null yazilmaz
		                                   // null bir deger degildir hicligi gösteren pointer dir
// RTE verir calisinca anlicaz hata oldugunu
		
		// null deger atanan string ile string manipulation methoodlarý kullanilmaz
		
		// System.out.println(str3.equals(str2));
		
		System.out.println(sonHarf.charAt(1));  // bastan ikinci verir
		System.out.println(str3.charAt(1)); // RTE verir
	}

}
