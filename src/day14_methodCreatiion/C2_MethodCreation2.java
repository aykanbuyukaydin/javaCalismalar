package day14_methodCreatiion;

public class C2_MethodCreation2 {

	public static void main(String[] args) {
		// bir methodu calistirmsk icin msin method icinden cagirmamiz gerekir
		// bir mothodu cagirmak icin method adini ve parametlere uygun argumentleri yazmaliyiz
		
		ortalama(85.2,90.3);

	}

	//bir method olusturmak istersek classin icinde ama main methonun disinda
	//bir alanda olusturmaliyiz 
	//genelde main methoddan sonra yapilir
	
	public static void ortalama(double sayi1, double sayi2) {
		System.out.println("girdiginiz iki sayinin ortalamasi : " + (sayi1+sayi2)/2);
	// aciklama : bir methonu olusturmak o methonun calirtirmak icin yeterli degildir
	// olusturulan method main method icinden cagirinla calisir	
	}
	// mainden sonra mecbur static yazicaz simdilik d�nd�rmesin void olsun
	// ortalama yapilacak bir method olustural�m bu ortama yapacak bady olusturalim
	
}
