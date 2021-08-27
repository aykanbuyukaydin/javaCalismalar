package day16_Foorloop;

import java.util.Scanner;

public class C6_LoopFoor6 {

	public static void main(String[] args) {
		// kullanicidan bir string isteyin
		// stringi tersine cceviren bir program yazin
		
		// index olarak dusunmeliyiz
		
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen tersine cevirmek icin bir yazi giriniz");
		String yazi = scan.nextLine();
		
		//1.yol veriable olusturup en son yazdiralim
		String tersYazi = "";
		
	for (int i=yazi.length()-1 ; i>=0 ; i-- ) {
		
		tersYazi+=yazi.charAt(i);
		}
System.out.println("girdiginiz sayinin tersten yazilisi = " + tersYazi);

// 2.yol sadece yazdiracaksak veriabla olusturmadan yapabiliriz
 System.out.print("girdiginiz yazinin tersi =");
for (int i=yazi.length()-1 ; i>=0 ; i-- ) {
       System.out.print(yazi.charAt(i));
}
System.out.println("");

// 3.yol method olustuýrup yazdiralim

tersineCevir(yazi);

	}

	public static void tersineCevir(String yazi) {
		for (int i=yazi.length()-1 ; i>=0 ; i-- ) {
		       System.out.print(yazi.charAt(i));
		}
		
	}

}
