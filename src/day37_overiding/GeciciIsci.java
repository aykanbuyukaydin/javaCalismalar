package day37_overiding;

public class GeciciIsci extends Isci{

	public String calistigiBolum="yemekhane";
	
	public static void main(String[] args) {
		
		//overriding (gecersiz kýlma)
		//bir child classda parent classda miras alinan methodu 
		//degistirmeye overriding denir
		
		
		GeciciIsci gi1 = new GeciciIsci();
		System.out.println(gi1.maasHesapla());
		gi1.mesai();
	}
	
	//overriding yapmak icin parent class daki method signature ile
	//child class da bir method olusturulur
	//signature ayný oldugundan sadece bady degisir
	//boylece parent class daki method gecersiz hala gelir
		public int maasHesapla() {
			return 30*8*10;

		}

		@Override  // annotation denir
		public void mesai() {
			//super.mesai();
			System.out.println("gecici isciler haftada 25 saat calisir");
		}
//annotation . aciklama dipnot
//java 29. satirda kodu inceleyenler icin aciklamma yapiyor
		
		//annotation olmasi ile olmamamsi arasindaki fark: annotation sadece bir aciklama degildir
		//override yaptigimiz methodu surekli kontrol eder ve parent classdaki
		//override method signature degistirilirse CTE verdirir

//eger overide edilen parent classdaki methodun(overriden) da calismasini istiyorsak
// overriding methodunun super.overridenMethodIsmi yazariz
		//eger overriding methodda super yazilmazsa
		//overriden method calismaz 
		
		// acces modifier
		//child parenti sinirlandirimaz 
		//yani overriding methodu acces modifier i overridin methodun acces modifierindan
		//daha dar olamaz
		
		//rutern type 
		//overridden methýdun return type i pirimitive yada void ise overriding methodun type da ayni olmalidir
		
		// eger rutern type i pirimitive degilse 
		//(overriding methodun return type i) IS-A (overridden  methodun return type i) olmalidir
             //  string-->object gibi	
}


