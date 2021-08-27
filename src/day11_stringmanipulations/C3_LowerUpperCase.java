package day11_stringmanipulations;

import java.util.Locale;

public class C3_LowerUpperCase {

	public static void main(String[] args) {
		// str.toLowerCase() verilen stringin tamamini kucuk harfe cevirir
		// str.toUpperCase() verilen stringin tamamini buyuk harfe cevirir
		
		String str = "Techproeducation" ;
		
		// buyuk harfle yazdirmak istersek
		System.out.println(str.toUpperCase());
		
		// stri buyuk harfe cevirmek istersek
		// atama yapmak lazim
		str=str.toUpperCase();
		// str benim buyuk harf olur kalici olur
		System.out.println(str);
		
		System.out.println(str.toLowerCase(Locale.forLanguageTag("tr")));
	
		
	
	}

}
