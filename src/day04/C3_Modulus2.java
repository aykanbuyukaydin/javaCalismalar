package day04;

import java.util.Scanner;

public class C3_Modulus2 {

	public static void main(String[] args) {
		// kullanicidan 4 basamakli bir sayi alalim ve 
		// sayinin basamaklarini ters sirada yazdiralim
		
		// bir sayinin 
		Scanner scan = new Scanner(System.in);
		System.out.println("basamaklarini bulmak icin 4 basamakli bir sayi gir");
        int sayi = scan.nextInt();
        
        int birlerBas = sayi % 10;
        sayi /= 10;
        
        int onlarBas = sayi % 10;
        sayi /= 10;
        
        int yuzlerBas = sayi % 10;
        sayi /= 10;
        
        int binlerBas = sayi;
        
        System.out.print(birlerBas);
        System.out.print(onlarBas);
        System.out.print(yuzlerBas);
        System.out.print(binlerBas);
        
        System.out.println();  // bir alta indirdi
        
        
        System.out.println(birlerBas + onlarBas + yuzlerBas + binlerBas);
        
        // syso ln olursa basa "" gelirse digerleri yanyana dzilir
        
        System.out.println("ekran " + birlerBas + onlarBas + yuzlerBas + binlerBas);
	}

}
