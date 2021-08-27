package day12_stringmanipulations;

public class C2_EqualsIgnoreCase {

	public static void main(String[] args) {
		// equalsIgnoreCase() method'u karailastirdigi
		// stringlere buyuk kucuk harf duyarliligi olmaksizin bakr
		
		String str1 = "Ali Can" ;
		String str2 = "ali CAN" ;
		
		
		System.out.println(str1.equals(str2)); // false verir
		System.out.println(str1.equalsIgnoreCase(str2)); // true verir

	}

}
