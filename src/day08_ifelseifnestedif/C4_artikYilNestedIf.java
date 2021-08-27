package day08_ifelseifnestedif;

import java.util.Scanner;

public class C4_artikYilNestedIf {

	public static void main(String[] args) {
		// nested ile yapalým
		
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen yil giriniz");
		int yil = scan.nextInt();
		
		if (yil%100==0) {
			if (yil%400==0) {
				System.out.println("artik yil");
			}else {
				System.out.println("artik yil degil");
			}
			
			
			
		}else 
           if (yil%4==0) {
        	   System.out.println("artik yil");
           }else {
        	   System.out.println("artik yil degil");
           }
	}

}
