package day22_constructer;

public class Otomobil {

public Otomobil (String renk) { // istersek contsructeri parametreli olarak olusturabiliriz
	
}
// biz bir constructor olusturdugumuzda java defalt olani iptal eder
// dolayisiyla biz bir constructer olustýurdugumuzda mutlka
// defalt contsructor in yerine de bir contsructer yazmaliyiz

public Otomobil() {
	// hemen bos parametre ile olsa bile tanýmladým constructeri
}

// önemli not
// defalt cructer dan baska  bir constructer yazdigimizda java defalt contructer
// olani yok ettiði icin mutlaka biz defalt yerine de contructer yazmaliyiz 
	    String marka;
	    String model;
	    int yil;
	    boolean kazasiVarMi;
	   
	    
	    public void yakit(String yakit) { // method
	        System.out.println("Araba yakit olarak " + yakit  + " kullanir");
	    }
	    
	    public void vites(String vites) { // method
	        System.out.println("Araba " + vites + " viteslidir");
	    }
}
