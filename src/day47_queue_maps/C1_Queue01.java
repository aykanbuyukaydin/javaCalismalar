package day47_queue_maps;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class C1_Queue01 {

	public static void main(String[] args) {
		//queue bir interfacedir dolayýsýyla obje ureteneyiz
		//Child class'i olan PriorityQueue ve LinkedList constructor secimine 
        // gore olusturdugumuz queue'nun davranislari degisir
		Queue<String> k1=new PriorityQueue<>();
		k1.add("d");
		k1.add("c");
		k1.add("m");
		k1.add("a");
		
		System.out.println(k1); // a c m d yazdý
		//queue(kuyruk) yapisi geregi insertion order e gore sýralama yapmasý beklenir
		//ancak constructor olarak priorityqueue sectigimiz icin java tarafýndan
		//belirlenen priority e gore sýralama yapar
		
		//bizde istersek priority kuralini tanýmlayabilirz o zaman bizim
		//istedigimize gore sýralar
		
		Queue<String> k2=new LinkedList<>();
		//ayný elemanalarla fakat linkedlist constructor i kullanarak
		//olusturdugumuz queue ise beklenenlere uygun olarak ekleme
		//sýrasina gore yazdýrýr
		k2.add("d");
		k2.add("c");
		k2.add("m");
		k2.add("a");
		
		System.out.println(k2); // d c m a yazdý
		
		//queue nun yapýsý geregi FÝFO kurali gecerlidir
		
		k2.offer("z"); //en sona ekliyor
		System.out.println(k2); // [d, c, m, a, z]
		k1.offer("z");// (priopity oldugu icin kendine gore tanýmlý o yuzden kestiremöeyiz)
		System.out.println(k1); // [a, c, m, d, z]
		k1.offer("l");// (priopity oldugu icin kendine gore tanýmlý o yuzden kestiremöeyiz)
		System.out.println(k1);// [a, c, l, d, z, m]
		
		
		System.out.println(k2.peek()); // birinci elemani bize getirir
		System.out.println(k2);
		
		k2.remove(); // bastakini siler
		System.out.println(k2);
		k2.remove();
		System.out.println(k2);
		
		System.out.println(k2.remove("a")); //true doner a yi sildigi icin
		System.out.println(k2); // a yi silmis oldu
		
		k2.poll(); //ilk elemani siler
		System.err.println(k2);
		
		System.out.println(k2.element());// silmeden ilk elemani getirir z
		
		k2.remove(); // bu satýrda son eleman olan z de silindi
		//artýk k2 bos
		System.out.println(k2.isEmpty()); // true dondu bos
		
		//k2.remove();// bos bir queue dan remove ile eleman silmek istersek exception verir
		
		k2.poll(); // bos bir queue de kullanýlýrsa exception vermez null donduruur
		System.out.println(k2.poll());
		
		//System.out.println(k2.element());// hýc eleman yoksa ( ilk elemani getirir z) bize exception verir
		
		
		
	}
}
