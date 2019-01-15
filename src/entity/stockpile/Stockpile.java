package entity.stockpile;

import java.awt.Graphics;
import javax.swing.ImageIcon;

import entity.Entity;
import main.Settings;

public class Stockpile extends Entity {
	private int job;
	// 1 Raw Wool
	// 2 Yarn
	// 3 Fabric
	// 4 Dyed Fabric
	
	public Stockpile(int width, int height, int x, int y, int job) {
		super(width, height, x, y);
		this.state = 1;
		this.job = job;
		//ImageIcon icon = new ImageIcon(Settings.STOCKPILE_PATH[job-1]);
		//image = icon.getImage();
	}

	@Override
	public void render(Graphics g) {
		g.drawImage(image, x, y, null);
	}
}
