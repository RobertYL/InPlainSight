package entity.machine;

import java.awt.Graphics;

import entity.machine.Machine;
import main.Settings;

public class Loom extends Machine {
	public Loom(int width, int height, int x, int y, int job) {
		super(width, height, x, y, job);
		sprite = sheet.getSubimage(820, 392, 64, 80);
		frameX = 420;
		frameY = 788;
	}

	@Override
	public void render(Graphics g) {
		if (frames < 0) {
			g.drawImage(sprite, getX(), getY(), null);
		} else {
			g.drawImage(sprite, getX(), getY(), null);
		}
	}
	
	@Override
	public void tick() {
		frames--;
		if (frames < 0) {
			sprite = sheet.getSubimage(820, 392, 64, 80);
			return;
		}
		sprite = sheet.getSubimage(frameX, frameY, 64, 128);
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
	public void idle() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isIdle() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void work() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isWork() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void broken() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isBroken() {
		// TODO Auto-generated method stub
		return false;
	}

}
