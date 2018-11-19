package home;

//import java.util.Arrays;

public class Network {
	long [] numberBase = new long[10];

	public Network(long[] numberBase) {
		super();
		this.numberBase = numberBase;
	}

	public long[] getNumberBase() {
		return numberBase;
	}

	public void setNumberBase(long[] numberBase) {
		this.numberBase = numberBase;
	}
	

	
//	public boolean addInBase(long addN) {
//		for (long someN : numberBase) {
//			if(someN == 0) {
//				someN = addN;
//				return true;
//			}
//		}
//		Arrays.copyOf(numberBase, numberBase.length + 10);
//		return addInBase(addN);	
//	}
	
}
