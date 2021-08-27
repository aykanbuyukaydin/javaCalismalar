package day13_stringmanipulations;

import java.util.Scanner;

public class C7_Examples1 {

	public static void main(String[] args) {
		// Kullaniciidan 4 harfi bir kelime iste
		//ve tersten yazdir
		
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen 4 harfli bir kelime girin");
		String str = scan.nextLine();
		
		if (str.length()!=4) {
			System.out.println("lutfen 4 harfli bir kelime girin");
		}else {
			System.out.print(str.substring(3));
			System.out.print(str.substring(2, 3));
			System.out.println(str.substring(1, 2));
			System.out.println(str.substring(0, 1));
		}
		
		
	}

}
