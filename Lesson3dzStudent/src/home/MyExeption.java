package home;

public class MyExeption extends ArrayIndexOutOfBoundsException{
	@Override
	public String getMessage(){
	return "Sorry this group is full";
	}
}
