package day07_ifelsestatements;

import java.util.Scanner;

public class C8_ifElseIf3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen maas icin teklif verin");
		double maas = scan.nextDouble();
		
		if (maas>80000) {
			System.out.println("kabul ediyorum");
			
		} else if (maas>60000){
			System.out.println("konusabiliriz");
        
		} else {
			System.out.println("kabul edemem");
			
			scan.close();
			
		}
		
	}

}
