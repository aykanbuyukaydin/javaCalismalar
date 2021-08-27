package day21_scope;

public class Scope5 {

	public static void main(String[] args) {
		
		for (int i = 0; i < 5; i++) {
			
			String isim = "ayse";
			System.out.println(i + " " + isim);
		}
		// System.out.println(isim); // loop icinde olusturulan veriableler
		// loopa ozeldir ve loop disinda kullanilamz
		
		for (int i = 0; i < 5; i++) {
			System.out.println(i + " ");
		}
	//System.out.println(i); // for loop disinda kullanildigi icin hata verir
		
		int count = 0;  // methoda ait local veriabledir, 
		                 // deger atamadan kullanmaya calisirsaniz cte verir
		while (count<5) {
			System.out.println(count);
			count++;
		}
	}

}
