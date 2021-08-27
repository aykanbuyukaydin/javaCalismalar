package day07_ifelsestatements;

import java.util.Scanner;

public class C1_ifStatements {

	public static void main(String[] args) {
		// kullaicidan bir tam sayi isteyelim
		//sayi pozitif ise "sayi pozitif" yazsin
		//sayi 100 den kucukse "kucuk sayi" yazsin
		// sayi 1000 den buyukse "buyuk sayi" yazsin
		
		Scanner scan = new Scanner(System.in);
		System.out.println("bir tamsayi yaziniz");
		int sayi = scan.nextInt();
		
		if(sayi>0) {
			System.out.println("sayi pozitif");
		}
		
		if (sayi<100) {
			System.out.println("kucuk sayi");
		}
		
		if (sayi>1000) {
			System.out.println("buyuk sayi");
		}
		
		scan.close();
	}

}
