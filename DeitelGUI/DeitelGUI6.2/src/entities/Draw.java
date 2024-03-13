package entities;

import java.awt.Color;
import java.awt.Graphics;
import java.security.SecureRandom;

import javax.swing.JPanel;

public class Draw extends JPanel {
	private static final long serialVersionUID = 1L;

	private static final SecureRandom randomNumbers = new SecureRandom();

	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		for (int x = 1; x <= 10; x++) {

			switch (randomNumbers.nextInt(2)) {
			case 0:
				randomColor(g);
				g.fillOval(randomSize(), randomSize(), randomSize(), randomSize());
				break;
			case 1:
				randomColor(g);
				g.fillRect(randomSize(), randomSize(), randomSize(), randomSize());
				break;
			}

		}

	}

	public void randomColor(Graphics g) {
		g.setColor(new Color(randomNumbers.nextInt(256), randomNumbers.nextInt(256), randomNumbers.nextInt(256)));
	}

	public int randomSize() {
		return 1 + randomNumbers.nextInt(229) / 2;
	}

}
