package day22_constructer;

public class CarUretRunner {

	public static void main(String[] args) {
		CarUret car1 = new CarUret();
		car1.marka="toyota";
		car1.model="corolla";
		car1.yil=2010;
		car1.kazasiVarMi=true;
		System.out.println(car1.marka + " " + car1.model + " " + car1.yil + " " + car1.kazasiVarMi);
		
		car1.yakit("benzin");
		car1.vites("duz");
		
		
	}

}
