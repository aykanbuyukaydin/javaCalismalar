package day18_WhileLoop;

public class C2_WhileLoop1 {

	public static void main(String[] args) {
		// while : iken, oldugu surece
		// 10 dan 30 a kadar olan sayilardan 4 e bolunenleri
		// aralarinda bosluk olacak sekilde yanyana yazdirin

		// once for looop ile yapalim
		
		for (int i = 10; i <=30; i++) {
			if (i%4==0) {
				System.out.print(i + " ");
			}
		}
		  
		System.out.println("");
		// aynisini while loop ile yapalim
		
		int sayi=10;  // 1.sart gerceklestim (baslangic degeri)
		while (sayi<=30) { // 2.sart gerceklestirdim (bitis degeri)
			if (sayi%4==0) {
				System.out.print(sayi + " ");
			
			
			
			
			
		}
			sayi++; // 3.sart gerceklestirdim (degisim degeri) en sonda yaptim	
			        // sayi++; yapmazsak dongu yzamadan ölece kalir
		}
		System.out.println("");	
		System.out.println("loop bitti mi ?");
		}
	}


