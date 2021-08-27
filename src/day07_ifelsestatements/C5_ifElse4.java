package day07_ifelsestatements;

import java.util.Scanner;

public class C5_ifElse4 {

	public static void main(String[] args) {
		// kullanicidan kenar uzunlari alin
		// uckenar esitse eskenar ucgen yazdirin
		// degilse eskenar degil yazdirin
		
		Scanner scan = new Scanner(System.in);
		System.out.println("ucgenin uc kenar uzunlugunu girin");
		double kenar1 = scan.nextDouble();
		double kenar2 = scan.nextDouble();
		double kenar3 = scan.nextDouble();
		
		if (kenar1==kenar2 && kenar2==kenar3) {
			System.out.println("eskanar ucgendir");
			
		}
		else {
			System.out.println("eskanar ucgen degil");
		}
		scan.close();
	}

}
