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
	}

	@Override
	public void render(Graphics g) {
		g.drawImage(image, x, y, null);
	}
}
