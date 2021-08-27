package day43_interfaces;

public interface Interface01 {

	public void motor(); // interface icinde abstract methotlar ve
	                      // ozel concrete methodlar olabilir

/* bir abstract methodun body si olmadigindan o methodun istenen dinamik ozelligi
 nasil gerceklestiricegini bilmemiz mumkun degildir
 sadece ne yapacagini biliriz
 
 bu method bize sunu anlatir:
 beni inherit eden her cocrete clasýýn dinamik motor ozelligi olmalidir
 */

	void vites();//beni inherit eden her cocrete clasýýn dinamik motor ozelligi olmalidir
	
	abstract void kasa();//beni inherit eden her cocrete clasýýn dinamik motor ozelligi olmalidir

//interface de sadece abstract, public methodlar olur
	// bu 2 keywordu yazsakta yazmasakda java tum methodlari bu sekilde kabul eder

//javada interface olusyturmak istiyorsak basta o sekilde olusturmaliyiz
	//bir class sonradan bazi keyword ler yazilarak interface yapýlamaz
	

	String ISIM = "mustafa"; //java isim kelimesini italik ve bold yaptý 
	                         //demekki tum veriableler final ve statiktir
	
}
