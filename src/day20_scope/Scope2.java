package day20_scope;

public class Scope2 {

	public static void main(String[] args) {
		// ben farkli classlardan da scope1 clasina ulaþabilirm
		
		Scope1 obj4 = new Scope1();
		
		System.out.println(obj4.isim);
		System.out.println(obj4.soyisim);
		
		obj4.soyisim="can";
		obj4.isim="ali";
		
		System.out.println(obj4.isim + obj4.soyisim);
	}

}
