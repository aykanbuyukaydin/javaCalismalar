package day16_Foorloop;

import java.util.Scanner;

public class C5_FoorLoop5 {

	public static void main(String[] args) {
		//Kullanicidan 100’den kucuk bir tamsayi isteyin.
		//1’den baslayarak girilen sayiya kadar tum sayilari yazdirin.
		//Ancak;
        //Sayi 3’un kati ise sayi yerine “Java” yazdirin.
        //Sayi 5’in kati ise sayi yerine “Guzeldir” yazdirin.
        // Sayi hem 3’un hem 5’in kati ise sayi yerine “Java Guzeldir” yazdirin.

		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen 100 den kucuk bir tamsayi giriniz");
		int sayi = scan.nextInt();
		
		for (int i=1 ; i<=sayi ; i++) {
			// System.out.println(i + ""); olsaydi 1 2 3 diye giderdi
			
			if (i%15==0) {
				System.out.println("java guzeldir");
			}else if (i%5==0) {
				System.out.println("guzeldir");
			}else if (i%3==0) {
				System.out.println("java");
			}else {
				System.out.println(i);
			}
			
		}
		
	}

}
