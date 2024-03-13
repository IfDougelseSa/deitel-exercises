package application;

import javax.swing.JOptionPane;

public class Program {

	public static void main(String[] args) {
		String number = JOptionPane.showInputDialog("Type a number");
		String number2 = JOptionPane.showInputDialog("Type the second number");

		JOptionPane.showMessageDialog(null, Integer.parseInt(number) + Integer.parseInt(number2));
	}

}
