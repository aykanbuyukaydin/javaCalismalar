package day15_MethodCreation;

public class C3_MethodOverloading {

	public static void main(String[] args) {
		// javada ayni isimde birden fazla method olusturulursa buna overloading denir
		// overloading yapabilmek icin method signature lerinin farkli olmasi gerekir
		// method signature = isim + parametre sayisi + parametre data turu
		// birbirini kapsayan data turu oldugunda java en optimum cozumu uretir
		// birebir uyan varsa o methodu calistirir,tamamem uyan yoksa en fazla uyan
		// methodu kullanir
		// eger kapsayan bir deger bulamazsa java CTE verir string de oldugu gibi

		toplama('a', 'b'); //

	}

	public static void toplama(int sayi1, int sayi2) {
		System.out.println("integer method sonucu = " + (sayi1 + sayi2));
	}

	public static void toplama(double sayi1, double sayi2) {
		System.out.println("double method sonucu = " + (sayi1 + sayi2));
	}

	public static void toplama(int sayi1, double sayi2) {
		System.out.println("integer/double method sonucu = " + (sayi1 + sayi2));
	}

	public static void toplama(double sayi1, int sayi2) {
		System.out.println("double/integer method sonucu = " + (sayi1 + sayi2));
	} // public static void toplama (char char1, char char2 ) {
		// System.out.println("char method sonucu = " + (char1+char2));
		// }
	/*
	 * public static void toplama (String str1, String str2 ) {
	 * System.out.println("string method sonucu = " + (str1+str2)); }
	 */
}
