package day06_ifstatements;

import java.util.Scanner;

public class C3_IfStatement3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("lütfen gun icin bas harfini giriniz");
		
		char ilkHarf = scan.next().charAt(0);                // ilk karakter charat0 ilk harf 0 ile baslar
		                                                     // uppercase buyuk harf olarak veriyo 
		 // char ilkHarf = scan.next().toUpperCase().charAt(0); 
		// System.out.println(ilkHarf);  görduk
		
		if (ilkHarf=='p' || ilkHarf=='P') {
			
			System.out.println("pazar, pazartesi veya persembe");
		
		}
				
	    if (ilkHarf=='s' || ilkHarf=='S') {
	    	System.out.println("sali");
	    }
        if (ilkHarf=='c' || ilkHarf=='C') {
        	System.out.println("carsamba, cuma veya cumartesi");
        }
        
        if (ilkHarf!='p' && ilkHarf!='P' && ilkHarf!='c' &&
        		ilkHarf!='C' && ilkHarf!='s' && ilkHarf!='S') {
        	System.out.println("gecerli harf girin");
        }
        scan.close();
        
	}

}
