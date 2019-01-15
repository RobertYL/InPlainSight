package entity.machine;

import java.awt.Graphics;

import main.Settings;

public class Barrel extends Machine {
	public Barrel(int width, int height, int x, int y, int job) {
		super(width, height, x, y, job);
		image = sheet.getSubimage(888, 392, 64, 64);
		frameX = 276;
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
			image = sheet.getSubimage(888, 392, 64, 64);
			return;
		}
		image = sheet.getSubimage(frameX, frameY, 96, 84);
		if (frames % 4 == 0) {
			frameY = 1144;
		} else {
			frameY += 84 + 4;
		}
	}
	
	@Override
	public void work() {
		if (frames > 0) return;
		frames = Settings.BARREL_FRAMES;
	}
}