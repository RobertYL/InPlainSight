package entity;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public abstract class Entity {
	protected int width;
	protected int height;
	protected int x;
	protected int y;
	protected int state;
		// Artisans
		// 01 Walk up
		// 02 Walk right
		// 03 Walk down
		// 04 Walk left
		// 05 Walk up + carry
		// 06 Walk right + carry
		// 07 Walk down + carry
		// 08 Walk left + carry
		// 09 Working
		// 10 Pick up
		// 11 Drop off
	
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
	
	//animation variables
	protected BufferedImage sheet;
	protected int frames;
	
	public Entity(int width, int height, int x, int y) {
		this.width = width;
		this.height = height;
		this.x = x;
		this.y = y;
		try {
			sheet = ImageIO.read(new File("src/resources/sheet.png"));
		} catch (IOException e) {}
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
