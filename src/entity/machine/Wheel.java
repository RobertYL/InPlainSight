package entity.machine;

import java.awt.Graphics;

import javax.swing.ImageIcon;

import main.Settings;

public class Wheel extends Machine {
	public Wheel(int width, int height, int x, int y, int job) {
		super(width, height, x, y, job);
		sprite = sheet.getSubimage(720, 392, 96, 64);
		frameX = 276;
		frameY = 1144;
	}

	@Override
	public void render(Graphics g) {
		g.drawImage(sprite, getX(), getY(), null);
	}
	
	@Override
	public void tick() {
		frames--;
		if (frames < 0) {
			sprite = sheet.getSubimage(888, 392, 64, 64);
			return;
		}
		sprite = sheet.getSubimage(frameX, frameY, 96, 84);
		if (frames % 4 == 0) {
			frameY = 1144;
		} else {
			frameY += 84 + 4;
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
