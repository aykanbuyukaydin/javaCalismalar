package day33_encapsulation;

public class Encapsulation03 {

	public static void main(String[] args) {
		// Encapsulation02 clasindaki class membera ulasmaya calisalim
		
		Encapsulation02 obj2 = new Encapsulation02();
		Encapsulation02 obj1 = new Encapsulation02();
		// biz erisim yetkisini ikiyw ayiriyoruz
		//1 okuyabilme ----get() 
		//2 degistirip kullanabilme----
        
		//sayi public oldugu icin
		System.out.println(obj1.sayi); // hem okudum
		obj1.sayi=25;                  //hemde eger atadim
		System.out.println(obj1.sayi); //25
		
		System.out.println(obj2.sayi); //100 farkli objede yeni yapt�m
		
		// obj1.getOkulIsmi()="mehmet koleji";  yapmazzz
		System.out.println(obj1.getOkulIsmi()); // goruruz
		
		//System.out.println(obj1.setHesapNo(0)); yazd�rmazz
		obj1.setHesapNo(546789); // hesapno faydalanip hesap no olusturabiliriz
		
		// Bir Calss i�inde class member olu�turuken bunu di�er class lar ile
		// ne oranda payla�aca��m�za karar veririz
		// 1- Herkes okuyabilsin ve obje �zerinden de�er atay�p kullanbilsin ==> public
		// 2 - Herkes okuyabilsin ama kimse obje uzerinden de olsa de�i�tiremesin Private ==> Public get();
		// 3 - �lk atad���m de�eri kimse goremesin Private ==> Public set ()

	}

}
