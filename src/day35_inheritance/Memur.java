package day35_inheritance;

public class Memur extends Personel {

	public int maas;
	
	public Memur() {
		super();
		System.out.println("child class parametresiz cons. calisti");
	}

	public Memur(int maas) {
		super();
		System.out.println("child class parametreli cons. calisti");
	}
	
	//inheritance con. olusturdugumuzda java nin otomatik olarak con. a 
	//koydugu super(); keyword onemlidir
	//super(); keyword defalt cons. gibidir. biz gormesek de calisir, ancak
	//yerine baska bir keyword yazarsak etkisiz hale gelir
	//extends varsa yerine baska birsey yazmadikca super() calisir......
	public static void main(String[] args) {
		

		Memur obj1 = new Memur(2400);
		
	}

	
	}


