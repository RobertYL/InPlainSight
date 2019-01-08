package entity.character;

import entity.Entity;

public abstract class Artisan extends Entity {
	private int job;
		// 1 Spinner
		// 2 Weaver
		// 3 Dyer
	
	public Artisan(int width, int height, int x, int y, int job) {
		super(width, height, x, y);
		this.state = 3;
		this.job = job;
	}
	
	public Artisan(int width, int height, int job) {
		this(width, height, 0, 0, job);
	}
}
