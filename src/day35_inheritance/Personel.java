package day35_inheritance;

public class Personel {

	public String isim;

	public int sayi;

	public Personel() { // parametresiz bir cont. olusturdum
		// super(); // javadan yardım alarak bir cons. olusturdugumuzda
		// java, cons. ın ilk satirina super kkeywordunu ekler
		// eger icinde bulundugumuz class bir child class degilse super(); keywordu
		// silinebilir
		// bugune kadar biz olusturdugumuz cons. larda hic super(); kuywordu kulanmadik
		// ancak bizim classlarımız child class olmadigindan bir sorun olmadi
		System.out.println("personel parametresiz cons. calisti");
	}

	public Personel(String isim, int sayi) { // psrsmetreli bir cons. olusturdum
		// super();
		System.out.println("personel parametreli cons. calisti");
	}

	/*
	 * her class default constructor a sahiptir defalt constructer un parametresi
	 * yoktur biz parametreli veya parametresiz contructer olusturdugumuzda defalt
	 * con. silinir eger biz sadece 1 tane parametreli con. olusturursak, java
	 * default olani sildigi icin parametresiz con. kalmaz dolayisiyla parametreli
	 * bir con. olusturdugumuzda mutlka default cons. yerine de parametresiz bir
	 * con. olusturmamız gerekir
	 */
}
