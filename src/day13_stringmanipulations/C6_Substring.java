package day13_stringmanipulations;

public class C6_Substring {

	public static void main(String[] args) {
		// 
		String str = 	"her ders java gibi olsa";
        
		// str in ilk 10 harfini yildiz ile gizleyin
		// geriye kalanlar normal yazilsin
		
		System.out.println(str.substring(10)); // bize 10 dan yazmaya bastatir
		System.out.println(str.substring(str.length()-10)); // son 10 verir
        System.out.println(str.substring(0, 10)); // ilk 11 i bize verecek
        System.out.println(str.substring(11));  // 11. karakterden sonuna kadar yazdir
	
// str in ilk 10 karakter * ile gizleyin geriyw kalani normal yazin

        System.out.println("**********" + str.substring(10));
        
        
        
        System.out.println(str.substring(10, 10)); // ilk 10. indexi al sonra 10 indexi alma der o yuzden
        
      //  System.out.println(str.substring(8, 7));  // hata verir
        
        
        System.out.println(str.substring(22)); // den sonrasýný yazdiriir
        System.out.println(str.substring(23)); // boþluk cýkar
       // System.out.println(str.substring(24)); // hata verir
        
        System.out.println(str.substring(11));
	}

}
