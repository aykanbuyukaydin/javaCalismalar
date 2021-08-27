package day40_exceptinon;

public class InvalidEmailIdCheckedException extends Exception {

	
	private static final long serialVersionUID = 1L; 
	// java exceptionlarin tekrarsiz olamsini saglamak icin 
	//her exception a uniqe bir kod verir

	InvalidEmailIdCheckedException(String message) {
		super(message);
	}

}
