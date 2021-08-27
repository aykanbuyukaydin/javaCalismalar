package day42_abstractclasses;

public class C1_Final {

	final static int SAYI=10;
	
	//instance bir variable i final ve static yaparsaniz jana onu bold yapar
	//bizde onu buyuk harf ile yazariz
	
	String isim; //default
	//instance veriablelelre ilk deger atamasi yapmak zorunda degiliz
	//deger atamadigimizda java data turune gore default bir deger atar
	
	//final String soyisim;
	//final veriablelerin degeri sonradan degistirilemeyecegi icin
	//ilj atama yapilmadan olusturulmasina java izin vermez
	
	public static void main(String[] args) {
		

		System.out.println(SAYI);
		
		System.out.println(Integer.MAX_VALUE);
		
		
		
	}
	public void deneme() {
		System.out.println("deneme yapiyoruz");
	}
	 public final void deneme2() {
		 System.out.println("deneme yapiyoruz 2");
}
}