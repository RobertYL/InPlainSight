package entity.machine;

import java.awt.Graphics;

import javax.swing.ImageIcon;

import entity.machine.Machine;
import main.Settings;

public class Loom extends Machine {
	public Loom(int width, int height, int x, int y, int job) {
		super(width, height, x, y, job);
		ImageIcon icon = new ImageIcon(Settings.LOOM_PATH);
		image = icon.getImage();
		image = sheet.getSubimage(0, 0, 10, 10);
	}

	@Override
	public void render(Graphics g) {
		g.drawImage(image, x, y, null);
	}
	
	@Override
	public void tick() {
		frames--;
		image = sheet.getSubimage(0,  0, 10, 10);
	}
	
	public void work() {
		this.frames = Settings.LOOM_FRAMES;
	}
}
