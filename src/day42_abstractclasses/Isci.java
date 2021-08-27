package day42_abstractclasses;

public class Isci extends Personel{

	public static void main(String[] args) {

		Isci isci1=new Isci();
		isci1.maasHesapla(); //isciler icin maas 500 tl
		isci1.mesai();//isciler gunluk 8 saat calisir
		isci1.isim="rumeysa";//abstract parent classdaki veriableelri istersem kullanirim
		System.out.println(isci1.isim);
		
		isci1.ozelSigorta(); //abstract parent classdaki concrete methodu istersem kullanirim
		//bu personel ozel sigorta kapsamindadir
		//bu methodu override etmedik ama parent child iliskisi ile kullanabildik

	}

	@Override
	public void maasHesapla() {
		//parent classdaki abstract methudu implement(uyarlama) etti
		//1-sen aabstract bir classi parent edindiysen mutlaka ordaki abstract
		//methodu implement etmelisin
		//2-parent classdaki methodda bady olmadigi icin onu kullanmanin anlami yok
		//biz child class da bady olan method(concrete) kullanip islem yapmaliyiz
		
		System.out.println("isciler icin maas 500 tl");
		
	}

	@Override
	public void mesai() {
		System.out.println("isciler gunluk 8 saat calisir");
		
	}

}
