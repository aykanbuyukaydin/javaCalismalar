package day21_scope;

public class Scope2 {
	
	
	public static void main(String[] args) {
		
		// stattic veriabler icin obje olusturma ihtiyaci yoktur
		// baska bir classdan static veriablele ulasmak istedigimizde 
		//ulasmak istedigimiz clasin adi . static veriable adi yazmamiz yeterlidir
		
		System.out.println(Scope1.okulAdi);
		System.out.println(Scope1.okulId); // java run time programdir, 
		                                  // scope2 classi calistrildiginda scope1 calsimazzz
		                                  // dolayisiyla en basta olusturulan veya atanan degerler gecerli olur
	Scope1.okulAdi="mehmet koleji";
	System.out.println(Scope1.okulAdi);  // mehmet koleji 
	
	Scope1.staticMethod();
	System.out.println(Scope1.okulId);
	System.out.println(Scope1.okulAdi);
	}

}
