package entity.machine;

import java.awt.Graphics;

import javax.swing.ImageIcon;

import main.Settings;

public class Wheel extends Machine {
	public Wheel(int width, int height, int x, int y, int job) {
		super(width, height, x, y, job);
		ImageIcon icon = new ImageIcon(Settings.WHEEL_PATH);
		image = icon.getImage();
		image = sheet.getSubimage(720, 392, 96, 64);
	}

	@Override
	public void render(Graphics g) {
		g.drawImage(image, x, y, null);
	}
	
	@Override
	public void tick() {
		
	}
	
	@Override
	public void work() {
		
	}
}
