package entity.machine;

import java.awt.Graphics;

import main.Settings;

public class Barrel extends Machine {
	private int i = 0;
	public Barrel(int width, int height, int x, int y, int job) {
		super(width, height, x, y, job);
		image = sheet.getSubimage(888, 392, 64, 64);
		frameX = 4;
		frameY = 1144;
	}

	@Override
	public void render(Graphics g) {
		g.drawImage(image, x, y, null);
	}
	
	@Override
	public void tick() {
		if (i % 3 == 0) {
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
		i++;
	}
	
	@Override
	public void work() {
		if (frames > 0) return;
		frames = Settings.BARREL_FRAMES;
	}
}