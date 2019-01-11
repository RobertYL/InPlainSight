package entity.machine;

import java.awt.Graphics;

import javax.swing.ImageIcon;

import main.Settings;

public class Barrel extends Machine {
	public Barrel(int width, int height, int x, int y, int job) {
		super(width, height, x, y, job);
		ImageIcon icon = new ImageIcon(Settings.BARREL_PATH);
		image = icon.getImage();
	}

	@Override
	public void render(Graphics g) {
		g.drawImage(image, x, y, null);
	}
	
	@Override
	public void tick() {
		
	}
}