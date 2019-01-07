package entity.character;

import entity.Entity;

public class Artisan extends Entity{
	private String name;
	private int state;
		// 01 Face up
		// 02 Face right
		// 03 Face down
		// 04 Face left

		// 05 Walk up
		// 06 Walk right
		// 07 Walk down
		// 08 Walk left
	
		// 09 Work up
		// 10 Work right
		// 11 Work down
		// 12 Work left
	private int job;
		// 1 Spinner
		// 2 Weaver
		// 3 Dyer
	
	public Artisan(int width, int height, int x, int y, String name, int job){
		super(width, height, x, y);
		this.name = name;
		this.state = 3;
		this.job = job;
	}
	
	public Artisan(int width, int height, String name, int job) {
		this(width, height, 0, 0, name, job);
	}

	public String getName() {return name;}
	public int getState() {return state;}
	public void setState(int state) {this.state = state;}
}
