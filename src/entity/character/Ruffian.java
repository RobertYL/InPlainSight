package entity.character;

import java.awt.Graphics;

import javax.swing.ImageIcon;

import entity.Entity;

public class Ruffian extends Entity {

	public Ruffian(int width, int height, int x, int y, int disguise) {
		super(width, height, x, y);
		ImageIcon icon = null;
		switch (disguise) {
		case 1:
			icon = new ImageIcon("src/resources/spinner.png");
			break;
		case 2:
			icon = new ImageIcon("src/resources/weaver.png");
			break;
		case 3:
			icon = new ImageIcon("src/resources/dyer.png");
		}
		image = icon.getImage();
	}
	
	public void update(int direction) {
		int x = 0, y = 0;
		switch (direction) {
		case 1:
			y = -1;
			break;
		case 2:
			x = 1;
			break;
		case 3:
			y = 1;
			break;
		case 4:
			x = -1;
		}
		this.x += x * speed;
		this.y += y * speed;
	}
	
	public void render(Graphics g) {
		g.drawImage(image, x, y, null);
	}
}
