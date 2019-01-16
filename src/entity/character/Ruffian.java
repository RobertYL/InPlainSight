package entity.character;

import java.awt.Graphics;
import javax.swing.ImageIcon;

import entity.Entity;
import main.Settings;

public class Ruffian extends Entity {

	public Ruffian(int width, int height, int x, int y, int disguise) {
		super(width, height, x, y);
		ImageIcon icon = null;
		switch (disguise) {
		case 1:
			icon = new ImageIcon(Settings.SPINNER_PATH);
			break;
		case 2:
			icon = new ImageIcon(Settings.WEAVER_PATH);
			break;
		case 3:
			icon = new ImageIcon(Settings.DYER_PATH);
		}
		sprite = icon.getImage();
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
		setX(getX() + x * 4);
		setY(getY() + y * 4);
		setX(Math.max(Math.min(getX(), Settings.COL_NUM * 64 - getWidth()), 0));
		setY(Math.max(Math.min(getY(), Settings.ROW_NUM * 64 - getHeight() + 28), 28));
	}
	
	public void render(Graphics g) {
		g.drawImage(sprite, getX(), getY(), null);
	}
}
