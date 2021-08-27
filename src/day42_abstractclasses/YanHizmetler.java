package day42_abstractclasses;

public abstract class YanHizmetler extends  Personel{

	//abstract bir classýn abstract childini olusturursak 
	//abstract methodlari implement etmek zorunda olmayiz
	//java bilir ki bu child son class degil mutlaka bu child in
	//concrete child clssi olacak
	
	
	public static void main(String[] args) {
		//YanHizmetler obj1 = new YanHizmetler();
		//abstract bir classdan obje uretilemez
		//abstract soyut birsey ya obje artýk somut oluyor
		//Cannot instantiate the type YanHizmetler
	}

}
