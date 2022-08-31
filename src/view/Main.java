package view;

import javax.swing.JOptionPane;

import controller.RedesController;;

public class Main {
	public static void main(String[] args) {
		RedesController controller = new RedesController();
		int option = 0;
		do {
			option = Integer.parseInt(JOptionPane.showInputDialog(null,
					"1 - Exibir IPv4\n" + "2 - Média de ping google\n" + "3 - Finalizar"));
			switch (option) {
			case 1:
				controller.ip();
				break;
			case 2:
				controller.ping();
				break;
			case 3:
				JOptionPane.showMessageDialog(null, "Finalizando.");
				break;
			}
		} while (option != 3);
	}
}