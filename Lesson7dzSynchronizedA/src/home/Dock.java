package home;

import java.util.Arrays;

public class Dock {

	private String[] stuf;
	private int emptyPart;
	private boolean turn;
	public Dock(boolean turn) {
		super();
		this.stuf = new String[15];
		this.emptyPart = 0;
		this.turn = turn;
	}

	public synchronized void rasgrusity(String cargo, Ship ship) {
		for (; ship.isShipTurn() != turn;) {
			try {
				wait();
			}catch (InterruptedException e) {
			}
		}
		ship.setShipTurn(!turn);
		if (emptyPart < 15) {
			stuf[emptyPart] = cargo;
			emptyPart += 1;
			try {
				wait(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		} else {
			System.out.println("The dock is Full" + Arrays.toString(stuf));
		}
		notifyAll();
	}

	public String[] getStuf() {
		return stuf;
	}
	

}
