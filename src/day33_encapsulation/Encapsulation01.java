package day33_encapsulation;

import day20_scope.Scope1;
import day21_scope.Scope6;

public class Encapsulation01 {

	public static void main(String[] args) {
		// oop concept
		// object oriented programing
		// bir proje kapsamindaki classlarda olusturulan veriable ve methodlarin
		//baska classlarda tekrar tekrar yazilmamasi, var oldugu classdan obje
		//uretilerek bu veriable ve emethodlarin istendigi kadar kullanýlmasýdýr
		//(reusability)
		
		
		//scope6 clasindaki veriable ve methodlara ulasmak istiyorum
		//bunun icinScope6 clasýndan ýbje uretmeliyiz
		
		Scope6 obj1 = new Scope6();
		//esitligin sol tarafi declaration
		//declaration 2 parcadir ilk parca data turu ikinci kisim isim
		//non primitive ler icin data turu ayni zamanda class ismi olabilir
		//esitligin saginda ise deger 2 parcadan olusur ilki new keyword ikincisi constructer
		//hangi classdan obje uretmek istersek o clasin contructer ni kullanilriz
		obj1.num1=10;
		System.out.println(obj1.num1);
		
		obj1.add();
		
		
		//deneme methodunu main method icinden cagýrabilir miyim ?
		//deneme(); // deneme methodu static olmadigi icin main methodda direk cagrilamaz
		//bunun yerine icinde olduguuz classdan bir obje uretip onun uzerinden
		//static olmayan methodlari da cagirabiliriz
		
		Encapsulation01 obj3 = new Encapsulation01();
		obj3.deneme(); // oldu
		
		

	}
	public void deneme() {
		//projemiz kapsamýnda bulunan tum classlardan 
		//public veriable ve methodlara istedigim yerden obje ureterek ulasabilirim
		//eger ulasmak istedigim class uyeleri (class member) public degil ise baska
		//package lerden ulasmak icin extra islem yapmamiz gerekir
		Scope1 obj2 = new Scope1();
		obj2.isim="ahmet";
		obj2.soyisim="ozcelik";
		obj2.method();
		
		//ben istedigim classdan onje uretip oradaki public class uyerine ulasabilirim
		
	}
}
