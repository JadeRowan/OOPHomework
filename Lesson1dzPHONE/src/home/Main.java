package home;

public class Main {

	public static void main(String[] args) {
		Network life = new Network();
		Network MTC = new Network();
		Phone nokia3310 = new Phone("2342342534");
		Phone motorolla2033 = new Phone("3987654321");
		Phone sumsungOI24 = new Phone("1234567890");
		
		nokia3310.regNumberIn(life);
		motorolla2033.regNumberIn(life);
		sumsungOI24.regNumberIn(MTC);
		
		nokia3310.call(motorolla2033.getNumber());
		motorolla2033.call(sumsungOI24.getNumber());
		sumsungOI24.call("Wrong input");
				
	}

}
