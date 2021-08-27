package day40_exceptinon;

public class RunnerCheckedException {

	public static void main(String[] args) throws InvalidEmailIdCheckedException {
		String email="rasit@gmail.com";
		
		maildogrula(email);

	}

	public static void maildogrula(String email) throws InvalidEmailIdCheckedException {
		
		if (email.contains("@gmail.com") || email.contains("@hotmail.com")) {
			System.out.println("mailiniz basari ile kaydedildi");
		}else {
			throw new InvalidEmailIdCheckedException("email uygun degil");
		}
		
	}

}
