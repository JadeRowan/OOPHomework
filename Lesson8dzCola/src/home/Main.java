package home;

import java.util.ArrayDeque;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDeque<String> company = new ArrayDeque<>();
		int howMuchCola = 0;
		company.push("Volovic");
		company.push("Penny");
		company.push("Cutropally");
		company.push("Sheldon");
		for (;;) {
			try {
				howMuchCola = Integer.valueOf(JOptionPane.showInputDialog("How much cola?"));
				if (howMuchCola < 0) {
					howMuchCola = 0;
				}
				break;
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Error number format");
			} catch (NullPointerException e) {
				howMuchCola = 0;
				JOptionPane.showMessageDialog(null, "Cansel");
				break;
			}
		}
		for (int i = 0; i < howMuchCola; i++) {
			String temp = company.removeFirst();
			company.addLast(temp);
			company.addLast(temp);
		}
		System.out.println(company);
	}

}
