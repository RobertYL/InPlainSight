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
		this.x += x * 4;
		this.y += y * 4;
		this.x = Math.max(Math.min(this.x, Settings.COL_NUM * 64 - this.width), 0);
		this.y = Math.max(Math.min(this.y, Settings.ROW_NUM * 64 - this.height + 28), 28);
	}
	
	public void render(Graphics g) {
		g.drawImage(image, x, y, null);
	}
}
