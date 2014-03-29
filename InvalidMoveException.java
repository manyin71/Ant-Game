package errors;

public class InvalidMoveException extends Exception{

	String message;
	
	public InvalidMoveException(String msg){
		message = msg;
	}
	
	@Override
	public String toString(){
		return message;
	}
}


