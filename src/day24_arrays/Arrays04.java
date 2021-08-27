package day24_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays04 {

	public static void main(String[] args) {
		// Kullanicidan degerler alarak integer bir array olusturun

		// kullanicidan once girecegi sayi adetini almak gerekir
		
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen kac sayidan olusacak bir array istediginizi yaziniz");
		int uzunluk=scan.nextInt();
		
		int arr[]=new int[uzunluk]; // 5 girdi diyelim
		
		
		System.out.println("lutfen sayilari giriniz");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=scan.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		
		
	}

}
