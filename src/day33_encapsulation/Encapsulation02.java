package day33_encapsulation;

public class Encapsulation02 {

	private String okulIsmi="yildiz koleji";
	//okul isminin baska classlardan okunmasini ama deger atamamasini istiyorsak
	//getter() methodu olusturuyoruz
	
	private String tcNo = "12345678901";
	private int hesapNo = 5554321;
	//obje olusturularak deger atanip kullanilmasini istedigimiz ama 
	//ilk atadigimiz deger,n gorunmemesini istiyorsak 
	//setter() methodu kullaniriz
	
	public int sayi=100;

	public static void main(String[] args) {
		// eger ulasmak istedigim class uyeleri (class member) public degil ise baska
		// package lerden ulasmak icin extra islem yapmamiz gerekir

		// yapabilecegimiz islemlerden birincisi Encapsulation dir(kapsulleme)
		// (data saklama)
		// bu classda kimseyle paylasmak istemedigimiz veriable ve methodlar
		// olusturalim

		
		//private yaoinca guvenlik konusunu halletmis olduk
		//ancak class uyelerinin private olmasi oop concepte aykiri
		
		//Encapsulation clasimizda olusturdugumuz class uyelrine kimlerin
		//ne oranda ulasabilecegini belirlemek icin yapilir
		
	}

	private void denemeMethod() {
System.out.println("deneme methodu calisti");
	}

	public String getOkulIsmi() {
		return okulIsmi;
	}

	public void setTcNo(String tcNo) {
		this.tcNo = tcNo;
	}

	public void setHesapNo(int hesapNo) {
		this.hesapNo = hesapNo;
		System.out.println(hesapNo);
		
	}
}
