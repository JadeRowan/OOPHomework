package home;

import java.util.Arrays;

public class Phone {
	private long number;
	private Network phNetwork;

	public Phone(long number) {
		super();
		this.number = number;
	}

	public Phone() {
		super();
	}
	
	public boolean regNumberIn(Network nw) {
		long [] base = nw.getNumberBase();
		
		for (int i = 0; i < base.length; i++) {
			if(base[i] == 0) {
				base[i] = this.number;
				nw.setNumberBase(base);
				phNetwork = nw;
				return true;
			}
		}
		
		Arrays.copyOf(base, base.length + 10);
		return this.regNumberIn(nw);
	}
	
	public void call(long l) {
		
		if(this.phNetwork == null){
			System.out.println("Not registred number");
			return;
		}
		long [] base = phNetwork.getNumberBase();
		
		for (int i = 0; i < base.length; i++) {
			if(base[i] == l) {
				System.out.println("Din-don!");
				return;
			}
		}
		System.out.println("Number is not finded");	
		
	}
}
