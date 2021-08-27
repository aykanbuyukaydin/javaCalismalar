package day26_arraylists;

import java.util.Arrays;

public class C1_Array01 {

	public static void main(String[] args) {
		// Verilen bir Array’den istenen degere esit olan elamanlari kaldirip,
		//kalanlari yeni bir  Array olarak yazdiran bir method yaziniz
	
	int arr[]= {2,3,5,3,6,4,3,6,7}; // {2,5,6,4,6,7} olmasini istiyoz ornegin istenmeyen sayi 3 olsun
	int sayi=3;
	
	//1.adim olarak arr icinde kaldirmam gereken sayi kac tane var bulmam gerek
	int count=0;
	for (int i = 0; i < arr.length; i++) {
		if(arr[i]==sayi) {
			count++;
		}
	}
	// for loop bittiginde isteyenmeyen sayidan kac tane var bulmus alurum
	
	// 2.adim yeni array olusturalim
	
	int arr2[]=new int[arr.length-count];
	
	// 3.adim arr arrayinden elemanlarini tek tek alip istenen sayiya esit degilse
	//arr2 ye ekleyecegim
	
	int temp=0; // bununla yeni arrayin indexlerini kontol edecegim
	
	for (int i = 0; i < arr.length; i++) {
		if (arr[i]!=sayi) {
			arr2[temp]=arr[i];
			temp++;
		}
	}
	
	System.out.println(Arrays.toString(arr2));
	}

}
