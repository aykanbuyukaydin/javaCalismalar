package day25_arrays;

import java.util.Arrays;

public class Arrays03 {

	public static void main(String[] args) {
		// verilen bir Stringi arraye nasil cceviririz?
		//verilen bir cumlede kac kelime oldugunu bulunuz? 
		//yada verilen cumlede her kelimenin ilk harfini buyuk yapiniz ?
		
		String str="herkes javayi tanisa severdi";
		// bu stringi kelimlere ayiralim
		//split methodu : bolme
		
		String arr[]=str.split(" "); // bosluklardan oldurup arrays yapar
		System.out.println(Arrays.toString(arr));

		
		String arr2[]=str.split("java");
		System.out.println(Arrays.toString(arr2));
		
		String arr3[]=str.split("a");
		System.out.println(Arrays.toString(arr3));
		
		String arr4[]=str.split("");
		System.out.println(Arrays.toString(arr4));
	}

}
