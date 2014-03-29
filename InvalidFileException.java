package errors;


public class InvalidFileException extends Exception {

	String message;
	
	public InvalidFileException(String msg){
		message = msg;
	}
	
	@Override
	public String toString(){
		return message;
	}
}
