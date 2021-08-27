package day21_scope;

public class Scope1 {

	static int okulId=1201;
	static String okulAdi="yildiz koleji";
	static boolean acikMi;
	
	public static void main(String[] args) {

		System.out.println(okulId + " " + okulAdi + " " + acikMi); // 1201 yildiz koleji false
		okulId=1202;
		acikMi=true;
		
		staticMethod(); // method cagirma / method call
		
		System.out.println(okulId + " " + okulAdi + " " + acikMi); //
		
		
	}

	public static void staticMethod() {

		System.out.println(okulId + " " + okulAdi + " " + acikMi); // 1202 yildiz koleji true
		okulId=1203;
		
	}

	public void method() {
		
		okulId=1205;

	}

}
