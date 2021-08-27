package day25_arrays;

import java.util.Arrays;

public class Arrays02 {

	public static void main(String[] args) {
		// verilen bir arrayda bir elemanýn var olup olmadýgýný nasýl kontrol ederiz ?
		
		int arr[]= {10,25,3,16,75};
		
		int sayi=25;
		
		// ilk onve bi flag ý olustururuz
		
		boolean flag=false;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==sayi) {
				flag=true;
			
			}
		}
if (flag) {
	System.out.println("array elemani iceriyor");
}else {
	System.out.println("array elemani icermiyor");
}

// java direk kýsayol tanýmýs bununicin
//arrays clasýndan method kullanarak yapalým:
// önce sýralma yapilmasi gerekiyor

Arrays.sort(arr); // siralamayi yaptýk
Arrays.binarySearch(arr, sayi); // sonuc olarak true yada false doner
System.out.println(Arrays.binarySearch(arr, sayi)); // sonuc arayanan sayinin index sini doner
System.out.println(Arrays.binarySearch(arr, 25));
System.out.println(Arrays.binarySearch(arr, 10));
System.out.println(Arrays.binarySearch(arr, 28));
System.out.println(Arrays.binarySearch(arr, 5));
System.out.println(Arrays.binarySearch(arr, 100));

// binary.searc sonuc olarak aradigimiz eleman varsa indexsini verir
// aradigimiz eleman yoksa - isareti ile olsaydý kacýncý eleman olacagýný donduruur

int arr2[]= {12,15,25,14,3,12,65};
Arrays.sort(arr2);
System.out.println(Arrays.binarySearch(arr2, 20));
System.out.println(Arrays.binarySearch(arr2, 14));
System.out.println(Arrays.binarySearch(arr2, 12));

// array nasýl stringe cevrilir ??

String arrayString = Arrays.toString(arr2) ; // string oldu
System.out.println(arrayString);
System.out.println(arrayString.substring(5)); // bastaki koseli parantez dahil tum array stringe ceviriir
	}

}
