package entity.character;

import java.awt.Graphics;

import javax.swing.ImageIcon;

public class Dyer extends Artisan {
	public Dyer(int width, int height, int x, int y, int job) {
		super(width, height, x, y, job);
		ImageIcon icon = new ImageIcon("src/resources/dyer.png");
		image = icon.getImage();
	}
	
	@Override
	public void render(Graphics g) {
		g.drawImage(image, x, y, null);
	}
}
