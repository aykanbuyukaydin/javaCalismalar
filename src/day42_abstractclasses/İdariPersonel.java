package day42_abstractclasses;

public class �dariPersonel extends Personel {
//extends personel yazarak abstract personle concrete bir child polusturdum
	//ve java cte verdi
	//cozum olarak urettigi 2 ihtimal var
	//1-unimplementd(uyarlanmam�s) methodlar� uyarla
	//2-yada personel class�ndan abstract kelimesini kaldir
	//bu classin calisabilmesi icin 2 islemden birini yapmak zounday�z
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
//conctere bir class da abstract bir method olabilir mi?
	//absrtract bir method sadece bir abstract classda olusturulabilir
	//public abstract void surekliCalisma(); // hata verdi
	//The abstract method surekliCalisma in type �dariPersonel can only 
	//be defined by an abstract class
	@Override
	public void maasHesapla() {
		System.out.println("idari personel maasi 4000 tl");
		
	}

	@Override
	public void mesai() {
		// TODO Auto-generated method stub
		
	}

}
