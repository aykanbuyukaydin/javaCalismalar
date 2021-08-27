package day23_statickeyword;

public class StaticBlock {

	
	static String isim;
	// static block class calistirildiginda ilk olarak calisir (main method dan bile once calisir)
	//static blocklar static veriable lara deger atamak icin kullanilir
	
	
	static {
		System.out.println("1.static block calisti");
	}
	
	static {
		isim="mehmet";
		System.out.println(isim);
	}
	
	
	public static void main(String[] args) {
		isim="alican";
		System.out.println(isim);
		
	}

}
