package day19_dowhileloop;

import java.util.Scanner;

public class C1_count {

	public static void main(String[] args) {
		// kullanicidan bir cumle ve bir harf isteyin
		// whileloop kullanarak cumlede istenen kac kez kullanilmis bulunuz
		// program case sensitive olsun (buyuk kucuk harf duyarli olsun)
		
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen bir cumle giriniz");
		String cumle = scan.nextLine();
		System.out.println("lutfen saymak istediginiz harfi giriniz");
		String harf = scan.next().substring(0, 1);  // degisiklik olsun bu sefer ncharat almadýk
		
		int count=0;
		
		int index=0;
		while (index<cumle.length()) {// index<=cumle.(length-1) da diyebillrdik
			if(cumle.subSequence(index, index+1).equals(harf)) { // 0.index
				count++;                                         //1. index diye gider kod
					
			}
			index++;
		}
System.out.println("cumlede " + harf + " harfi " + count + " defa kullanilmis");
	}

}
