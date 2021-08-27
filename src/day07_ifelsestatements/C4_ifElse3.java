package day07_ifelsestatements;

import java.util.Scanner;

public class C4_ifElse3 {

	public static void main(String[] args) {
		// kullanicidan yasini sorun
		// 65ve  buyukse "emekli olursun" degilse
		// "emekli olamazsin" yazdirin
		
		
	Scanner scan = new Scanner(System.in);
	System.out.println("lutfen yasinizi girin");
	int yas = scan.nextInt();
	
	if (yas>=65) {
		System.out.println("emekli olursun");
		
	}
	else {
		System.out.println("emekli olamazsin");
	}
	scan.close();
	

	}

}
