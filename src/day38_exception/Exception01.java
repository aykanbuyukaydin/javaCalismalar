package day38_exception;

import java.util.Scanner;

public class Exception01 {

	public static void main(String[] args) {
		// kullanicidan 2 tamsayi alin ve bolumlerini yadirin
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen bolunecek tamsayiyi yazin");
		int sayi1 = scan.nextInt();
		System.out.println("lutfen kaca bolmek istediginizi yazin");
		int sayi2=scan.nextInt();
		
		// java exceptionlara handle etmek için try-catch blogu olusturmus
		
		try {
		System.out.println("bolme isleminin sonucu: " + sayi1/sayi2);
		} catch (ArithmeticException e) {
			System.out.println("sayiyi sifira bolemezsin");
		}
		

	}

}
