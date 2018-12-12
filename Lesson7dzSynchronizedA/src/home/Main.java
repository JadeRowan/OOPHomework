package home;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dock southDock = new Dock(true);
		Dock westDock = new Dock(false);
		long tStart = System.currentTimeMillis();
		Ship barga = new Ship(southDock, westDock, "Tea", true);
		Ship tanker = new Ship(westDock, southDock, "Oil", false);
		Ship parom = new Ship(southDock, westDock, "Log", true);		
		
		Ship[] ships = { barga, tanker, parom };
		
		for (Ship ship : ships) {
			try {
				ship.getThr().join();
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
		long tEnd = System.currentTimeMillis();
		System.out.println(Arrays.toString(westDock.getStuf()));
		System.out.println(Arrays.toString(southDock.getStuf()));
		System.out.println(tEnd - tStart);

	}
}