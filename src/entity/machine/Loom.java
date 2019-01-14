package entity.machine;

import java.awt.Graphics;

import entity.machine.Machine;
import main.Settings;

public class Loom extends Machine {
	public Loom(int width, int height, int x, int y, int job) {
		super(width, height, x, y, job);
		image = sheet.getSubimage(820, 392, 64, 80);
		frameX = 420;
		frameY = 788;
	}

	@Override
	public void render(Graphics g) {
		if (frames < 0) {
			g.drawImage(image, x, y, null);
		} else {
			g.drawImage(image, x, y - 48, null);
		}
	}
	
	@Override
	public void tick() {
		frames--;
		if (frames < 0) {
			image = sheet.getSubimage(820, 392, 64, 80);
			return;
		}
		image = sheet.getSubimage(frameX, frameY, 64, 128);
		if (frames % 4 == 0) {
			if (frames % 12 == 0) {
				frameX = 420;
				frameY = 788;
			} else {
				frameX = 420;
				frameY += 128 + 4;
			}
		} else {
			frameX += 64 + 4;
		}
	}
	
	@Override
	public void work() {
		if (frames > 0) return;
		this.frames = Settings.LOOM_FRAMES;
	}
}
