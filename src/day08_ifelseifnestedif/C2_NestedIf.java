package day08_ifelseifnestedif;

public class C2_NestedIf {

	public static void main(String[] args) {
		// nested : ic ice
		// verilen cinsiyet ve yas icin
		// eger calisan erkekse 60 dan buyukse emekli olur
		// eger calisan kadinsa 65 den buyukse emekli olur
		
		// nested siz if else if ile cozmeye calisalim
		
		String cinsiyet="erkek";
		int yas = 10;
		
		// Scanner yapmiyoruz kullanicidan istemedik degerler ustte verilmis

		
		if (yas<10) {
			System.out.println("yas negatif olamaz");
		}
		else if(cinsiyet.equalsIgnoreCase("erkek") && yas>=65) {
			System.out.println("emekli olabilirsin");
		} else if (cinsiyet.equalsIgnoreCase("erkek") && yas<65) {
			System.out.println("emekli olamaz");
		} else if (cinsiyet.equalsIgnoreCase("kadin") && yas>=60) {
			System.out.println("emekli olablirsin");
		}else {
			System.out.println("emekli olamazsýn");
		}
		
		
		
		
		System.out.println("nested if ile sonuc");
		
		if (cinsiyet.equalsIgnoreCase("erkek")) {
			
			if (yas<0) {
				System.out.println("erkek yas negatif olamaz");
			} else if (yas<65) {
				System.out.println("emekli olamazsin");
			} else {
				System.out.println("emekli olabilir");
			}
			
			
		} else if (cinsiyet.equalsIgnoreCase("kadin")) {
			if (yas<0) {
				System.out.println("kadin yas emekli olamaz");
			} else if (yas<60) {
				System.out.println("bu yasdaki kadin emekli olamaz");
			} else {
				System.out.println("bu yasdaki kadin emekli olabilir");
			}
			
			
		}else {
			System.out.println("yazdiginiz cinsiyet tanimli degil");
			
			
		}
		
		
		
	}

}
