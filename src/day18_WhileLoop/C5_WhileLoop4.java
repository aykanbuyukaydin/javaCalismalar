package day18_WhileLoop;

import java.util.Scanner;

public class C5_WhileLoop4 {

	public static void main(String[] args) {
		/* Kullanicidan bir sayi alin ve 
		bu sayiyi tam bolen sayilari ve toplam kac tane 
		olduklarini ekranda yazdirin
		*/

		
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen bolenleri bulmak icin pozitif bir tamsayi giriniz");
		int sayi = scan.nextInt();
		
		int bolen=1;
		int count=0;  //count sayac demek
		
		while (bolen<=sayi) {
			
			if (sayi%bolen==0) {
				count++;  // biz bolenlerin artmasýný istidigimiz icin  buraya yazdik
				System.out.println(bolen);
				
			}
		bolen++;
		}
		System.out.println(sayi + " bolenlerinin sayisi " + count + " adettir");
		
		
		
		// bolenleri þu þekilde yazdirin
		//1-1 (1.boleni 1
		//2-2 (2. boleni 2
		//3-4 /3.boleni 4 gibi yazdirin
		
		bolen=1;
		count=0; 
		
		while (bolen<=sayi) {
			
			if (sayi%bolen==0) {
				count++; 
				System.out.println(count + "- " + bolen);
				
			}
		bolen++;
		}
		
		
	}

}
