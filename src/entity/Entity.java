package entity;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import main.Settings;

public abstract class Entity {
	protected int width;
	protected int height;
	protected int x;
	protected int y;
	protected int state;
		// Artisans
		// 01 Walk l
		// 02 Walk d
		// 03 Walk u
		// 04 Walk r
		// 05 1Walk l + carry
		// 06 1Walk d + carry
		// 07 1Walk u + carry
		// 08 1Walk r + carry
		// 09 2Walk l + carry
		// 10 2Walk d + carry
		// 11 2Walk u + carry
		// 12 2Walk r + carry
		// 13 Stock l
		// 14 Stock d
		// 15 Stock u
		// 16 Stock r
		// 17 Working
	
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
