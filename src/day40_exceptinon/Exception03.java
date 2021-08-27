package day40_exceptinon;

public class Exception03 {

	public static void main(String[] args) {
		// 
		
		int arr[] = {1,4,7,8};
		
		try {
		System.out.println(arr[20]);
		}/*catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		} */finally {
			System.out.println("ne olursa olsun bu satir yazilsin");
		}
	//finally blogu try-catch blogu ile veya sadece try blogu ile calisabilir
		//finally blogu catch ile ongordugum bir sorun oldugunda calistigi gibi
		//ongoremedigim bir exception olustudugunda da calisir
	}

}
