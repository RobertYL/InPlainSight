package entity;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import main.Settings;

public abstract class Entity {
	private int width;
	private int height;
	private int x;
	private int y;
	private int state;
		// Artisans
		// 00 Walk l
		// 01 Walk d
		// 02 Walk u
		// 03 Walk r
		// 04 1Walk l + carry
		// 05 1Walk d + carry
		// 06 1Walk u + carry
		// 07 1Walk r + carry
		// 08 2Walk l + carry
		// 09 2Walk d + carry
		// 10 2Walk u + carry
		// 11 2Walk r + carry
		// 12 Stock l
		// 13 Stock d
		// 14 Stock u
		// 15 Stock r
		// 16 Working
	
		// Structures
		// 0 Idle
		// 1 Working
		// 2 Broken
	
		// Stockpiles
		// 0 Raw Wool
		// 1 Yarn
		// 2 Fabric
		// 3 Dyed Fabric
	
	protected Image sprite;
	
	//animation variables
	protected BufferedImage sheet;
	protected int frames;
	protected int frameX;
	protected int frameY;
	
	public Entity(int width, int height, int x, int y) {
		this.width = width;
		this.height = height;
		this.x = x;
		this.y = y;
		try {
			sheet = ImageIO.read(new File(Settings.SHEET_PATH));
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
