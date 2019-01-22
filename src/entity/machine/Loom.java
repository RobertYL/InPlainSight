package entity.machine;

import java.awt.Graphics;

import entity.machine.Machine;
import main.Settings;
import main.Sheet;

public class Loom extends Machine {
	public Loom(int width, int height, int x, int y, int job) {
		super(width, height, x, y, job);
		sprite = sheet.getSubimage(Sheet.LOOM[getState()][0], Sheet.LOOM[getState()][1], 
				Sheet.LOOM_SIZE[getState()][0], Sheet.LOOM_SIZE[getState()][1]);
	}

	@Override
	public void render(Graphics g) {
		g.drawImage(sprite, getX(), getY()-(Sheet.LOOM_SIZE[getState()][1]-Settings.LOOM_HEIGHT), null);
	}
	
	@Override
	public void tick() {
		if(tick >= Sheet.LOOM[getState()].length/2)
			idle();
		sprite = sheet.getSubimage(Sheet.LOOM[getState()][tick*2], Sheet.LOOM[getState()][tick*2+1], 
				Sheet.LOOM_SIZE[getState()][0], Sheet.LOOM_SIZE[getState()][1]);
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
