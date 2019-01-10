package entity;

import java.awt.Graphics;
import java.awt.Image;

public abstract class Entity {
	protected int width;
	protected int height;
	protected int x;
	protected int y;
	protected int state;
		// Artisans
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
	
		// Structures
		// 1 Idle
		// 2 Working
		// 3 Broken
	
		// Stockpiles
		// 1 Raw Wool
		// 2 Yarn
		// 3 Fabric
		// 4 Dyed Fabric
	
	protected Image image;
	
	public Entity(int width, int height, int x, int y) {
		this.width = width;
		this.height = height;
		this.x = x;
		this.y = y;
	}
	
	public Entity(int width, int height) {
		this(width, height, 0, 0);
	}
	
	public int getWidth() {return width;}
	public int getHeight() {return height;}
	public int getX() {return x;}
	public void setX(int x) {this.x = x;}
	public int getY() {return y;}
	public void setY(int y) {this.y = y;}
	public int getState() {return state;}
	public void setState(int state) {this.state = state;}
	
	public boolean isClicked(int x, int y) {
		return x > this.x && x < this.x + this.width && y > this.y && y < this.y + this.height;
	}
	
	public abstract void render(Graphics g);
}
