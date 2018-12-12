package home;

public class Ship implements Runnable {
	private Dock[] docks = new Dock[2];
	private String cargo;
	private Thread thr;
	private boolean shipTurn;
	
	public Ship(Dock dockOne, Dock dockTwo, String cargo, boolean shipTurn) {
		super();
		this.docks[0] = dockOne;
		this.docks[1] = dockTwo;
		this.cargo = cargo;
		this.thr = new Thread(this);
		thr.start();
		this.shipTurn = shipTurn;

	}
	
	
	public boolean isShipTurn() {
		return shipTurn;
	}


	public void setShipTurn(boolean shipTurn) {
		this.shipTurn = shipTurn;
	}


	public String getGrus() {
		return cargo;
	}

	public void setGrus(String cargo) {
		this.cargo = cargo;
	}
	
	public Thread getThr() {
		return thr;
	}

	public void setThr(Thread thr) {
		this.thr = thr;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			docks[i % 2].rasgrusity(cargo, this);
		}

	}

}
