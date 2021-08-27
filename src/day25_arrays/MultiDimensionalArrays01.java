package day25_arrays;

import java.util.Arrays;

public class MultiDimensionalArrays01 {

	public static void main(String[] args) {
		// ic ice array olusturdugumuzda disardaki ana arraye outer arraw
		//icerdeki kucuk arraylere ise inner array denir
		
		//eger icerdeki arraylaerin boyutlari birbirinden farkli ise
		//array i ancak tum elemanlarin yazarak declara edebiliriz
		
		//multi dimensiional arrayde bir elemanin indexi icin en disteki
		//array haric elemana kadar ici ice olan tum arraylarin indexlerini yazmak
		//gerekir
		
		int arr[][]= {{1,3,5},{3,5},{5,9,11,3}}; // iki katli bir array dir
		// 11 i index ini ifade etmek icin istersek arr[2][2]; olur
		
		// eger arrayi decrale etmek istersek inner array uzunluklari esit olmali
		
		int arr2[][]=new int[3][2];
		// [3] ilk yazilan sayi outer arrayın icinde kac tane inner array oldugunu belirtir
		// [2]

		System.out.println(Arrays.toString(arr2));
		
		// multidimensional arraylaei yazdırmak icin toString methodu kullanılamaz
		//cunku toString methodu outer arrayi stringe ceviriri
		//outer arrayin icinde inner arrayler oldugundan toString method unda inner arraylerin,
		//referans degerlerini yazdirir 
		System.out.println(Arrays.deepToString(arr2));
		
	}

}
