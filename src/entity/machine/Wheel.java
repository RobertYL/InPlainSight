package entity.machine;

import java.awt.Graphics;

import javax.swing.ImageIcon;

import main.Settings;
import main.Sheet;

public class Wheel extends Machine {
	private int i = 0;
	public Wheel(int width, int height, int x, int y, int job) {
		super(width, height, x, y, job);
		sprite = sheet.getSubimage(Sheet.WHEL[getState()][0], Sheet.WHEL[getState()][1], 
				Sheet.WHEL_SIZE[getState()][0], Sheet.WHEL_SIZE[getState()][1]);
	}

	@Override
	public void render(Graphics g) {
		g.drawImage(sprite, getX(), getY()-(Sheet.WHEL_SIZE[getState()][1]-Settings.WHEEL_HEIGHT), null);
	}
	
	@Override
	public void tick() {
		if(tick >= Sheet.WHEL[getState()].length/2)
			idle();
		sprite = sheet.getSubimage(Sheet.WHEL[getState()][tick*2], Sheet.WHEL[getState()][tick*2+1], 
				Sheet.WHEL_SIZE[getState()][0], Sheet.WHEL_SIZE[getState()][1]);
		tick++;
	}

	@Override
	public void idle() {
		setState(0);
		tick = 0;
	}

	@Override
	public boolean isIdle() {
		return getState() == 0;
	}

	@Override
		// TODO Auto-generated method stub
	public void work() {
		setState(1);
		tick = 0;
	}

	@Override
	public boolean isWork() {
		return getState() == 1;
	}

	@Override
	public void broken() {
		setState(2);
		tick = 0;
	}

	@Override
	public boolean isBroken() {
		return getState() == 2;
	}
}
