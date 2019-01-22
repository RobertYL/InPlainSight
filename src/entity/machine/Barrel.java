package entity.machine;

import java.awt.Graphics;

import entity.machine.Machine;
import main.Settings;
import main.Sheet;

public class Barrel extends Machine {
	public Barrel(int width, int height, int x, int y, int job) {
		super(width, height, x, y, job);
		sprite = sheet.getSubimage(Sheet.BRRL[getState()][0], Sheet.BRRL[getState()][1], 
				Sheet.BRRL_SIZE[getState()][0], Sheet.BRRL_SIZE[getState()][1]);
	}

	@Override
	public void render(Graphics g) {
		g.drawImage(sprite, getX(), getY()-(Sheet.BRRL_SIZE[getState()][1]-Settings.BARREL_HEIGHT), null);
	}
	
	@Override
	public void tick() {
		if(tick >= Sheet.BRRL[getState()].length/2)
			idle();
		sprite = sheet.getSubimage(Sheet.BRRL[getState()][tick*2], Sheet.BRRL[getState()][tick*2+1], 
				Sheet.BRRL_SIZE[getState()][0], Sheet.BRRL_SIZE[getState()][1]);
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