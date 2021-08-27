package day07_ifelsestatements;

import java.util.Scanner;

public class C6_ifElseIf1 {

	public static void main(String[] args) {
		// kullanicidan 100 uzerinden notunu isteyin
		// notu harf sistemine cevirip yazin
		// 50 den kucukse "D" 50-60 arasi "C"
		// 60-80 arasi "B" 80 nin uzeri "A" yazsin

		
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen notunuzu girin");
		double not = scan.nextDouble();
		
		if (not<0 || not>100) {
			System.out.println("lutfen gecerli bir not giriniz");
		}  // þu asamada 0-100 arasi ise ustteki cikar degilse asagi yapacak 
		else if (not<50){
			System.out.println("notunuz: D");
		} 
		else if (not<60) {  // bu satira geldiyse not 50 ile 100 arasindadir demektir
			System.out.println("notunuz: C");
			
		}
		else if (not<80) {
			System.out.println("notunuz: B");
			
		}
		else {
			System.out.println("notunuz: A");
		}
			scan.close();
		}
	}


