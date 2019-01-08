package entity.structure;

import entity.Entity;

public abstract class Structure extends Entity {
	private int job;
		// 1 Wheel
		// 2 Loom
		// 3 Barrel
	
	public Structure(int width, int height, int x, int y, int job) {
		super(width, height, x, y);
		this.state = 2;
		this.job = job;
	}
}
