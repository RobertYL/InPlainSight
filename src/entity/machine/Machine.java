package entity.machine;

import entity.Entity;

public abstract class Machine extends Entity {
	private int job;
		// 1 Wheel
		// 2 Loom
		// 3 Barrel
	
	public Machine(int width, int height, int x, int y, int job) {
		super(width, height, x, y);
		setState(0);
		this.job = job;
	}
	
	public abstract void tick();
	
	public abstract void idle();
	public abstract boolean isIdle();
	public abstract void work();
	public abstract boolean isWork();
	public abstract void broken();
	public abstract boolean isBroken();
}
