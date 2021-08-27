package day29_passbyvalueimmutable;

public class C5_ImMutable02 {

	public static void main(String[] args) {
		// degisikligi kalici yapmak icin atama yaparsak
		//ýmmutable callss lar nsýl davranir
		
		String isim = "ali";
		isim=isim+"";
		System.out.println(isim.equals("ali")); // true
		System.out.println(isim=="ali"); // false
		
		String str1=new String("mehmet");
		String str2=new String("mehmet");
		
		System.out.println(str1==str2); // false
		System.out.println(str1.equals(str2)); // true
		
		String str3="mehmet";
		String str4="mehmet";
		
		System.out.println(str3==str4); // true
		System.out.println(str3.equals(str4)); // true
		
		System.out.println(str3==str1); // false
		System.out.println(str3.equals(str1)); // true
	}

}
