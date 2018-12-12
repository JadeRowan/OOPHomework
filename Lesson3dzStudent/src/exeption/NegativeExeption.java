package exeption;

public class NegativeExeption extends Exception{
	
	@Override
	public String getMessage() {
		return "Not correct value";
	}
}