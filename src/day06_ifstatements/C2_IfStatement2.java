package day06_ifstatements;

import java.util.Scanner;

public class C2_IfStatement2 {

	public static void main(String[] args) {
		
		// kullanicidan bir sayi isteyin  ve sayinin
		// tek veya cift oldugunu yazdirin
		
		Scanner scan = new Scanner (System.in);       //1
		System.out.println("lutfen tamsayi giriniz"); //2
		
		int sayi= scan.nextInt(); //3
		
		if(sayi%2==0) {
			System.out.println("girdiginiz sayi cift sayidir"); //4
			
		}
		
		if (sayi%2==1 || sayi%2==-1) {
			System.out.println("girdiginiz sayi tek sayidir"); //4
		}
		
		System.out.println("katildiginiz icin tesekkurler");
		scan.close();

	}
     

}
