package homework;

import java.math.BigInteger;

public class FactTask implements Runnable{
	private int number;
	
	public FactTask(int number) {
		super();
		this.number = number;
	}

	public BigInteger factorialCalculate(int n) {
		BigInteger fact = new BigInteger("1");
		for (int i = 1; i <= n; i++) {
			fact = fact.multiply(new BigInteger("" + i));
		}
		return fact;
	}
	
	@Override
	public void run() {
		
		System.out.println(Thread.currentThread().getName() + 
				" factorial "+number+" = "+factorialCalculate(number));
		
	}

}
