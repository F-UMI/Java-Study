package ch10_07;

public class WrongPasswordException extends Exception {
	public WrongPasswordException() {}	
	public WrongPasswordException(String message) {
		super(message); //상위 클래스인 Exception으로 
	}
}
