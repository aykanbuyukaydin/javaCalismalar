package day07_ifelsestatements;

import java.util.Scanner;

public class C2_ifElse1 {

	public static void main(String[] args) {
		
		// KARE �SE KARE YAZS�N
		// DEG�LSE KARE DEG�L YAZSIN
		Scanner scan = new Scanner(System.in);
		System.out.println("dikd�rtgen icin kenar uzunlugunu girin");
		
		double kenar1 = scan.nextDouble();
		double kenar2 = scan.nextDouble();
		
		if (kenar1==kenar2) {
			System.out.println("kare");
		
		}
		else {
			System.out.println("kare degil");
		}
		scan.close();
	}

}
