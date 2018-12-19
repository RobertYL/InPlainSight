import java.awt.Color;
import java.awt.Graphics;

public class Render {
	
	public Render(Graphics g, Fool[] fools, Rebel[] rebels) {
		drawFools(g, fools);
		drawRebels(g, rebels);
	}
	
	public void drawFools(Graphics g, Fool[] fools) {
		for(int i = 0; i < fools.length; i++) {
			g.setColor(Color.WHITE);
			g.fillRect(fools[i].x(), fools[i].y(), fools[i].size(), fools[i].size());
			g.setColor(Color.BLACK);
			g.drawRect(fools[i].x(), fools[i].y(), fools[i].size(), fools[i].size());
		}
	}
	
	public void drawRebels(Graphics g, Rebel[] rebels) {
		for(int i = 0; i < rebels.length; i++) {
			g.setColor(Color.WHITE);
			g.fillRect(rebels[i].x(), rebels[i].y(), rebels[i].size(), rebels[i].size());
			g.setColor(Color.RED);
			g.drawRect(rebels[i].x(), rebels[i].y(), rebels[i].size(), rebels[i].size());
		}
	}
}
