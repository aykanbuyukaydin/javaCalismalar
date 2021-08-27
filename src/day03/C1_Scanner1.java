package day03;

import java.util.Scanner;

public class C1_Scanner1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("lutfen isiminizi giriniz");
		
        String name= scan.nextLine();
        
        System.out.println("lutfen soyismizi giriniz");

        String surname = scan.nextLine();
        
        System.out.println("Isminiz: " + name);
        System.out.println("Soyisminiz: " + surname);
        System.out.println("kursumuza kaydiniz alinmistir, teekkur");
	scan.close();
	}

}
