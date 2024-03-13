package entities;

import java.awt.Color;
import java.awt.Graphics;
import java.security.SecureRandom;

import javax.swing.JPanel;

public class DrawCircle extends JPanel {
	private static final long serialVersionUID = 1L;

	int a = 10;
	int b = 10;
	int c = 200;
	int d = 200;

	private static final SecureRandom randomNumbers = new SecureRandom();

	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		for (int x = 1; x <= 5; x++) {

			g.setColor(new Color(randomNumbers.nextInt(256), randomNumbers.nextInt(256), randomNumbers.nextInt(256)));
			g.fillOval(a, b, c, d);

			a += 20;
			b += 20;
			c -= 40;
			d -= 40;
		}

	}

}
