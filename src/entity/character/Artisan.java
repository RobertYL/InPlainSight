package entity.character;

import entity.Entity;

public abstract class Artisan extends Entity {
	private int job;
		// 1 Spinner
		// 2 Weaver
		// 3 Dyer
	protected boolean work = false;
	
	public Artisan(int width, int height, int x, int y, int job) {
		super(width, height, x, y);
		setState(0);
		this.job = job;
	}
	
	public Artisan(int width, int height, int job) {
		this(width, height, 0, 0, job);
	}
	
	public boolean isWorking() {return work;}
	
	public abstract void ai();	
	public abstract void work();
}
