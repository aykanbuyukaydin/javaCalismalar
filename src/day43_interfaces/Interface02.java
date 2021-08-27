package day43_interfaces;

public interface Interface02 {

	//soru su buradaki default ve static bizim bildigimiz static ve default mu ??
	//cevap: hayir
	
	public default void deneme() {
		System.out.println("default keyword lu method calisti");
		
		//bizim bildigimiz default acces modifierdi
		//bir methodda birden fazla acces modifier olur mu?
		//bizim interface de olusturdugumuz tum methodlar public dedik
		//interface de default keyword kullanarak concrete method olusturabilirz
		//buradaki default keywordu acces modifier degil 
		//javanin ozel bir cozumudur
		//buradaki defult keyword basina yazildigi methodun cocrete oldugunu belirtir
}

    public static void deneme2() {
    	System.out.println("static keyword lu method calisti");
    }
    //yukarida default keywordu icin yzadiklarimiz static icin de gecerlidir
    
    //static ve default keywordu olarak olusturdugumuz methodlar
    //everride edilmek zorunda degildir
}
