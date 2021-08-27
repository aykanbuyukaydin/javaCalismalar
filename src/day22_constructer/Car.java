package day22_constructer;

public class Car {

	String marka ; // static olmaz bir arabanin ismini degistirsek butun arabalarin adi degisir sacma olur
	String model;
	int yil;
	boolean kazasiVarMi;
	
	
	public static void main(String[] args) {
		
		Car car1 = new Car(); // bir araba obje olarak olusturduk
		//bir obje olusturudugunda esitligin saginda mutlaka constructer kullanilir
		//constructer ismi class ismi ile ayni olmalidir
		//constructer da mutlaka () olmalidir parametre olmasi istege baglidir
		
		System.out.println(car1.marka + " " + car1.model + " " + car1.yil + " " + car1.kazasiVarMi);
		// marka icin null, model icin null, yil icin o, kazasiicin false yazar
		
		//simdi bir araba yapmak istersek
	
	car1.marka="toyota";
	car1.model="corolla";
	car1.yil=2010;
	car1.kazasiVarMi=false;
	System.out.println(car1.marka + " " + car1.model + " " + car1.yil + " " + car1.kazasiVarMi);
	
	Car car2 = new Car(); // yeni bir araba obje olarak olusturduk
	car2.marka="opel";
	car2.model="astra";
	car2.yil=2015;
	car2.kazasiVarMi=true;
	System.out.println(car2.marka + " " + car2.model + " " + car2.yil + " " + car2.kazasiVarMi);		;
	
	System.out.println(car1.marka + " " + car1.model + " " + car1.yil + " " + car1.kazasiVarMi);
	// car1 degerleri gelir car2 etkilemz
	
	car1.kazasiVarMi=true ; // car1 ait herjangi bir ozelligi degistirebiliriz
	
	System.out.println(car1.marka + " " + car1.model + " " + car1.yil + " " + car1.kazasiVarMi);
	}

}
