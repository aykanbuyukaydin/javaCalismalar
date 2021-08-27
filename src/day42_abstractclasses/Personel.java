package day42_abstractclasses;

public abstract class Personel {
//bir class i abstract yapmak icin class keywordunden once abstract yazmak yeterlidir
	
	//abstract bir classi icinde veriabla olabilir mi ?
	//olabilir
	
	public String isim="yasin";
	
	//veriableler abstract olur mu?
	//olmaz
	//public abstract int sayi=10; // hata verir
	
	//absrtact classýn tum concrete childleri abstract classdaki 
	//tum dinamik yani methodlari
	//ozellikleri override etmek zorundadir
	
	//bir method abstract olur mu ve nasil yapilir?
	//olur
	/*public abstract void maasHesapla() {
		
	}*/  // bady yazilmaz
	public abstract void maasHesapla();  //override etmek zorunlu
	
	public abstract void mesai();  //override etmek zorunlu
	
	//bir abstract classda concrete method yazilablir mi
	public void ozelSigorta() {  //override etmek zorrrunlu degil
		System.out.println("bu personel ozel sigorta kapsamindadir");
	}
	//cevap: bir abstract class da abstract ve concrete methodlar olabilir
	//concrete child classlar abstrack methodlari override etmek zorundadir
	//ama cocrete methodlari override etmek istege baglidir
}
