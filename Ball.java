import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

import javax.swing.JComponent;

public class Ball extends JComponent{
	
	private int dx, dy;
	public Ball(int x, int y) {
		this.setLocation(x, y);
		this.setSize(30,30);
	}
	public void paintComponent (Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		Ellipse2D.Double bullet = new Ellipse2D.Double(4,0,20,20);
		g2.setColor(Color.RED);
		g2.fill(bullet);
	}
	
	public void setXY(int x, int y) {
		dx = x; 
		dy = y;
	}
	
	public void update() {
		this.setLocation(getX() + 2, getY());
	}
}
