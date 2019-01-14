package entity.machine;

import entity.Entity;

public abstract class Machine extends Entity {
	private int job;
		// 1 Wheel
		// 2 Loom
		// 3 Barrel
	
	public Machine(int width, int height, int x, int y, int job) {
		super(width, height, x, y);
		this.state = 1;
		this.job = job;
	}
	
	public abstract void tick();
	public abstract void work();
}
