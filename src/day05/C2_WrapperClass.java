package day05;

public class C2_WrapperClass {

	public static void main(String[] args) {
		String isim = "mehmet" ;
		System.out.println(isim.toUpperCase());
		
		// boolen, char, byte, short, int, long, float, double
		
		// byte sayi = 10;
		
		Byte sayi2 = 11; // ismen pirimitive data turu ile ayni olan
		                 // non primitive datalara wrapper data
		
		System.out.println(sayi2);
		

		Byte byteMinSayi = Byte.MIN_VALUE;
		System.out.println(byteMinSayi);
		
		Byte byteMaxSayi = Byte.MAX_VALUE;
		System.out.println(byteMaxSayi);
		
		// veriabla olusturmadan direk olarak shortun en kucuk ve enbuyuk degeri yaziralým
		System.out.println(Short.MAX_VALUE);
		System.out.println(Short.MIN_VALUE);
		
		
		// integer veri turunu  wrapper classý Imteger dir
		// integerin en kucuk ve en buyuk degeri
		
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		
		// wrapper class lar
		// Boolean, Character, Byte, Short, Integer, Long, Float, Double
		
	}

}
