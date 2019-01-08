package entity.character;

import java.awt.Graphics;

import entity.Entity;

public class Ruffian extends Entity {
	public Ruffian(int width, int height, int x, int y) {
		super(width, height, x, y);
	}
	
	public void render(Graphics g) {
		g.drawRect(x, y, width, height);
	}
}
