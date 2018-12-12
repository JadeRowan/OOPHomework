package home;

public class Network {
	private Phone[] base;

	public Network() {
		super();
		this.base = new Phone[10];
	}

	public Phone[] getBase() {
		return base;
	}

	public void setBase(Phone[] base) {
		this.base = base;
	}

}
