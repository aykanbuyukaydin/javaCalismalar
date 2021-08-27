package day30_datetime;

import java.time.LocalDate;

public class C1_LocalDate01 {

	public static void main(String[] args) {
		// javada sadece tarih kullanmak istiyorsak
		//localdate clasýndan bir obje uretirirz
		
		LocalDate tarih = LocalDate.now();
		System.out.println(tarih); // sistemdan alip buraya ayzdirmis oluyor
		
		tarih.plusWeeks(20); // dersin bitmesine 20 hafta var diyelim
		System.out.println(tarih.plusWeeks(20));
		
		
		System.out.println(tarih.plusDays(500)); // 500 gun sonra tarih ne olur
		
		System.out.println(tarih.plusYears(3).plusMonths(5).plusDays(12));
		// 3 yýl 5 ay 12 gun sonrea tarih ne olur
		
		
		
		System.out.println(tarih.minusMonths(15)); // 15 ay once tarih neydi
		
		System.out.println(tarih.minusYears(3).minusMonths(4).minusDays(10));
		// 3 yýl 4 ay 10 gun once tarih neydi

		
		System.out.println(tarih.getDayOfYear()); // bu tarih yilin kacinci gunu
		System.out.println(tarih.getMonthValue()); // bu tarik int olark kacýncý ay
		System.out.println(tarih.getDayOfWeek()); // bu tarih hangi gundu
		
		
		LocalDate dogumGunu = LocalDate.of(1995, 10, 5);
		System.out.println(dogumGunu.getDayOfWeek()); // thursday
		
		System.out.println(tarih.getMonth()); // march verir
		
		
		System.out.println(tarih.isLeapYear()); // false ( bu anki tarih artik yil mi
		
		LocalDate tarih1 = LocalDate.of(1995, 12, 15); // now þimdiki tarihe gore idiydi
		//bu sekilde ise de olablir
		
		LocalDate tarih2 = LocalDate.of(1995, 12, 10);
		
		System.out.println(tarih1.isAfter(tarih2)); // tarih1 tarih2 den sonra mý ? // true
		System.out.println(tarih1.isBefore(tarih2)); // false
		
		
	}

}
