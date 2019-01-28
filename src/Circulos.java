import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.security.SecureRandom;

import javax.swing.JPanel;

public class Circulos extends JPanel{
	
	@Override
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		
		final int centroY = getHeight()/2 - 5;
		final int centroX = getWidth()/2 - 5;
		final SecureRandom aleatorio = new SecureRandom();
		
		g2d.setColor(Color.RED);
		g2d.drawLine(centroX + 10, centroY + 5, centroX + 20, centroY + 5);
		

		
		for(int i = 0; i < 100; i+=10) {
			
			g2d.setColor(new Color(aleatorio.nextInt(256), aleatorio.nextInt(256), aleatorio.nextInt(256)));
			
			g2d.draw(new Ellipse2D.Double(centroX - i, centroY - i, 10 + i * 2, 10 + i * 2));
			
		}
		
		
	}
	
}
