package entity.machine;

import java.awt.Graphics;

import javax.swing.ImageIcon;

import main.Settings;

public class Wheel extends Machine {
	public Wheel(int width, int height, int x, int y, int job) {
		super(width, height, x, y, job);
		image = sheet.getSubimage(720, 392, 96, 64);
		frameX = 4;
		frameY = 1144;
	}

	@Override
	public void render(Graphics g) {
		g.drawImage(image, x, y, null);
	}
	
	@Override
	public void tick() {
		frames--;
		if (frames < 0) {
			image = sheet.getSubimage(720, 392, 96, 64);
			return;
		}
		image = sheet.getSubimage(frameX, frameY, 64, 96);
		if (frames % 4 == 0) {
			if (frames % 12 == 0) {
				frameX = 4;
				frameY = 1144;
			} else {
				frameX = 4;
				frameY += 96 + 4;
			}
		} else {
			frameX += 64 + 4;
		}
	}
	
	@Override
	public void work() {
		if (frames > 0) return;
		frames = Settings.WHEEL_FRAMES;
	}
}
