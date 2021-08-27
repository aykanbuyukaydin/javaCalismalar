package day37_overiding;

public class Formen extends Isci{
	
	public String sorumluOldBolum="bakim";
	public String isim ="emrullah";

	public static void main(String[] args) {
		
		
		
//inheritancede data turu olarak class ismi kullanimi
		// bir class da obje uretirken data turu olarak claasýn kendisini
		//veya parentlerini kullanabilirz
		//olusturdugumuz obje ile veriable gerekirse hangi degeri
		//alacagini anlamak icin once data turu olan class gideriz
		//orada aradigimiz veriable varsa kullaniriz yoksa
		//parentlerina bakariz yukari doðru giderken ilk buldugumuz degeri kullaniriz
		
		Formen fr1 = new Formen();
		// fr1 objesini kullanarak hangi classlarin veriablelerini gorebilirm
		fr1.sorumluOldBolum="marangozhane";
		fr1.maas=10000;
		System.out.println(fr1.isim + " " + fr1.sorumluOldBolum + " " + fr1.maas);
		// emrullah maragozhane 10000 
		
		Isci fr2 = new Formen();
		//data turu olarak Isci secildigi icin 
		fr2.bolum="kaynak atolyesi";
		//fr2.isim="yakup";
		System.out.println(fr2.isim + " " + fr2.bolum + " " + fr2.maas);
		// mesut kaynak atolyesi 5000
		
		Personel fr3=new Formen();
		System.out.println(fr3.isim); // emre

	}

}
