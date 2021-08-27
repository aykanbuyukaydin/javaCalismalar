package day38_exception;

import java.util.Scanner;

public class Exception02 {

	public static void main(String[] args) {
		//kullanicidan 2 tamsayi alin ve bolumlerini yadirin
		//bu islemi araliksiz 100 kere yaptiralim
		
		
		Scanner scan = new Scanner(System.in);
		
		int count=0;
		while (count<=100) {
		System.out.println("lutfen bolunecek tamsayiyi yazin");
		int sayi1 = scan.nextInt();
		System.out.println("lutfen kaca bolmek istediginizi yazin");
		int sayi2=scan.nextInt();
		
		//javaya exceptionu handle etmek icin bir cozum uretmezsek
		//java exception ile karsilastiginda calismayi durdurur(stop execution)
		//throws exception (exception firlatir) (problemin kaynagini bize gosterir

		//tum apliction durmus olur..
		//musterilerin kullandigi bir uygulama icin bu KABUL EDÝLEMEZ
		//bunun icin kod yazan kisi muhtemel sorunlari on gormeli ve javaya
		//bu sorunla handle edebilmesi icin yol gostermelidir
		
		    System.out.println("islem no: " + count);
			try {
		    System.out.println("bolme isleminin sonucu: " + sayi1/sayi2);
			} catch (ArithmeticException e) {
				System.out.println("sayiyi sifira bolemezsin");
			}
		count++;
		
		}

	}

}
