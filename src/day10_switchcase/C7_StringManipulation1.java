package day10_switchcase;

public class C7_StringManipulation1 {

	public static void main(String[] args) {
		// 
		
		String str = "Hello World" ;
		
		System.out.println(str.toUpperCase()); // HELLO WORLD yazdirir
		
		System.out.println(str); // Hello World yazar cunku atama olmad�

		String str2 =str.toUpperCase(); // atama yapt�m ama yeni atama olmus oldu
		
		System.out.println(str);   // Hello World
		System.out.println(str2); // str2 yeni atanmis gibi dusun
	
	
	
	
	}

}
