package day22_constructer;

public class ParametreliConstructer {

	String marka;
	String model;
	int yil;
	boolean kazasiVarMi;

	public ParametreliConstructer(int yil) { // 1
       this.yil=yil;
	}

	public ParametreliConstructer() {// 2 olmasi gerekiyor

	}

public ParametreliConstructer(String marka, String model) { // 3
}

	public ParametreliConstructer(String marka, String model, int yil, boolean kazasiVarMi) { // 4
this.marka=marka;
this.model=model;
this.yil=yil;
this.kazasiVarMi=kazasiVarMi;
	}

	public void yakit(String yakit) { // method
		System.out.println("Araba yakit olarak " + yakit + " kullanir");
	}

	public void vites(String vites) { // method
		System.out.println("Araba " + vites + " viteslidir");
	}
}
