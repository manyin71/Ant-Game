

public class InvalidFileException extends Exception {

	String message;
	
	InvalidFileException(String msg){
		message = msg;
	}
	
	@Override
	public String toString(){
		return message;
	}
}
