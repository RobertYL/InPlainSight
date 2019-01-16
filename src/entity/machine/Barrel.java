package entity.machine;

import java.awt.Graphics;

import main.Settings;
import main.Sheet;

public class Barrel extends Machine {
	public Barrel(int width, int height, int x, int y, int job) {
		super(width, height, x, y, job);
		sprite = sheet.getSubimage(Sheet.BRRL[getState()][0], Sheet.BRRL[getState()][1], Sheet.BRRL_SIZE[getState()][0], Sheet.BRRL_SIZE[getState()][1]);
	}

	@Override
	public void render(Graphics g) {
		g.drawImage(sprite, getX(), getY(), null);
	}
	
	@Override
	public void tick() {
		frames--;
		if (frames < 0) {
			sprite = sheet.getSubimage(720, 392, 96, 64);
			return;
		}
		sprite = sheet.getSubimage(frameX, frameY, 64, 96);
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