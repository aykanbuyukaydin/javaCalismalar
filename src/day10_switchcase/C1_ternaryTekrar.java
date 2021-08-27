package day10_switchcase;

import java.util.Scanner;

public class C1_ternaryTekrar {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen bir tamsayi giriniz");
		int sayi = scan.nextInt();
		
String sonuc =	sayi>99 ? sayi<1000 ? "sayi uc basamakli" : "sayi uc basamakli degil": "sayi uc basamakli degil" ;

System.out.println(sonuc);

// yada nested ternary olmasın
// sayi>=100 && sayi<1000 dersek tek koşulla cozulmus olur

	}

}
