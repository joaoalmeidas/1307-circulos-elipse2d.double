import java.awt.Color;
import java.awt.Graphics;
import java.security.SecureRandom;

import javax.swing.JPanel;

public class Circulos extends JPanel{
	
	@Override
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		final int centroY = getHeight()/2 - 5;
		final int centroX = getWidth()/2 - 5;
		final SecureRandom aleatorio = new SecureRandom();
		
		g.setColor(Color.RED);
		g.drawLine(centroX + 10, centroY + 5, centroX + 20, centroY + 5);
		

		
		for(int i = 0; i < 100; i+=10) {
			
			g.setColor(new Color(aleatorio.nextInt(256), aleatorio.nextInt(256), aleatorio.nextInt(256)));
			
			g.drawArc(centroX - i, centroY - i, 10 + i * 2, 10 + i * 2, 0, 360);
			
		}
		
		
	}
	
}
