package day28_foreachloop;

public class C1_ForEachLoop1 {

	public static void main(String[] args) {
		// bir arrayin tum elemanlarini for loop ile yazdiralim

		int arr[] = { 2, 4, 6, 8, 10 };

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
// for lop yazmamizin amaci arrayin tum elemanlari uzerinde islem yapmak ise 
//for each loop daha kolay kod yazmamizi saglar
		// each ===> her bir demek (her bir elemani getir demek istiyoruz yani)
		// for each loop istedigin bir toplulukdaki tum elemanlari birer birer bana
		// getirir
		// for each loop da baslangýc degeri,bitis degeri ,inddex yokturr
		System.out.println();
		
		for (int each : arr) { // hoca genelde each yaziyormus i yerine
			System.out.print(each + " ");
		}

	}

}
