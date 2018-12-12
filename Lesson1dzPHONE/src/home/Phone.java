package home;

import java.util.Arrays;

public class Phone {
	private String number;
	private Network phNetwork;

	public Phone(String number) {
		super();
		this.number = number;
	}

	public Phone() {
		super();
	}
	
	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public Network getPhNetwork() {
		return phNetwork;
	}

	public void setPhNetwork(Network phNetwork) {
		this.phNetwork = phNetwork;
	}

	public boolean regNumberIn(Network nw) {
		Phone[] phoneArray = nw.getBase();
		for (int i = 0; i < nw.getBase().length; i++) {

			if (phoneArray[i] == null) {
				phoneArray[i] = this;
				nw.setBase(phoneArray);
				phNetwork = nw;
				return true;
			}
		}

		Arrays.copyOf(phoneArray, phoneArray.length + 10);
		return this.regNumberIn(nw);
	}

	public void call(String s) {

		if (this.phNetwork == null) {
			System.out.println("Not registred number");
			return;
		}
		Phone [] base = phNetwork.getBase();
		
		for (Phone phone : base) {
			if(phone != null && phone.number.equals(s)) {
				phone.inputCall();
				return;
			}
		}
		System.out.println("Number is not finded");

	}

	public void inputCall() {
		System.out.println("Ring-Rang!");
	}
}
