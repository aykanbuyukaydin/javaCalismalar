package day39_exception;

import java.util.ArrayList;
import java.util.List;

public class Exception06 {

	public static void main(String[] args) {
		// list veya array de var olmayan bir index ile islem yapmak isterseniz
		//java ArrayIndexOutOfBoundsException verir
		
		int arr[] = {1,2,5,6};
		System.out.println(arr[1]); // 2
		System.out.println(arr[3]); //6
		System.out.println(arr[5]); // Exception
		
		
		List<String> list=new ArrayList<>();
		list.add("bahattin");
		list.add("kazim");
		list.add("celil");
		System.out.println(list);
        System.out.println(list.get(1)); //kazim
        System.out.println(list.get(3)); // Exception
	}

}
