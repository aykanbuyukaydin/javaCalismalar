package day12_stringmanipulations;

import java.util.Scanner;

public class C5_LastIndexOf {

	public static void main(String[] args) {
		// kullanicidan bir cumlemalin
		// ve asagidaki uc durumdan uygun olani yazdirin
		// 1-cumle java icermiyor
		// 2-cumle 1 tane java iceriyor
		// 3-cumlede birden fazla java var
		
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen bir cumle yazin");
		String cumle = scan.nextLine().toLowerCase();
		
		int ilkJava = cumle.indexOf("java"); // -1 verecek yada ilk javanin indexsini
		int sonJava = cumle.lastIndexOf("java"); // -2 yada son javanin indexsini verecek
		
		if (ilkJava==-1) {
			System.out.println("cumle java icermiyor");
		}else if (ilkJava==sonJava) {
			System.out.println("cumle 1 tane java iceriyor");
		}else {
			System.out.println("java birden fazla java iceriyor");
		}

	}

}
