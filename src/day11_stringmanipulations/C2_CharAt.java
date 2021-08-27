package day11_stringmanipulations;

public class C2_CharAt {

	public static void main(String[] args) {
		// charAt(index)
		// scan.next().charAt(0) yapýyorduk "0. indexdeki karakteri veriyordu
		// 
		
		String str = "Java cok guzel" ;
		System.out.println(str.charAt(0)); // J verir
		
		System.out.println(str.charAt(5)); // 012345 c yazar
		System.out.println(str.charAt(13)); // l yazar	
        // kelimenin uzunlugu son index+1 dir
		// son index kelimenin uzungunu -1 dir (length)
		
		// System.out.println(str.charAt(15)); // hata verir
		// eger index olarak kelimenin uzunlugu veya daha buyuk bir sayi girilirse hata verir
		
	    
		// kullanici 10 harfli bir kelime girerse
		// bana son harfi verecek kodu yazin
		// str.charAt(9) yazmam lazim nedenn?  10-1=9 dur
		
		System.out.println(str.charAt(14)); // hata verir
		// burda hata olarak anlamamasinin sebebi cunku kod daha calismadý calisinca verir
		// run calisinca ortaya cikan bu tür hatalara RTE denir
		
		
		// altakinde calistirma olmuyor o yuzden direk hatayi veriyor 
		//String str3 = 5 ; // compile time error CTE
		                  // kod calismadan javanin farkýna varip altini
		                  // kirmizi cizdigi hatalardir
		                  // bur tur hatalara ise CTE denir
		                  
		
	
	}

}
