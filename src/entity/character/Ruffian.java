package entity.character;

import java.awt.Graphics;
import javax.swing.ImageIcon;

import entity.Entity;
import main.Settings;
import main.Sheet;

public class Ruffian extends Entity {

	int disguise;
	
	public Ruffian(int width, int height, int x, int y, int disguise) {
		super(width, height, x, y);
		this.disguise = disguise;
		switch (disguise) {
		case 1:
			sprite = sheet.getSubimage(Sheet.SPNR[getState()][0], Sheet.SPNR[getState()][1], 
					Sheet.SPNR_SIZE[getState()][0], Sheet.SPNR_SIZE[getState()][1]);
			break;
		case 2:
			sprite = sheet.getSubimage(Sheet.WEVR[getState()][0], Sheet.WEVR[getState()][1], 
					Sheet.WEVR_SIZE[getState()][0], Sheet.WEVR_SIZE[getState()][1]);
			break;
		case 3:
			sprite = sheet.getSubimage(Sheet.DYER[getState()][0], Sheet.DYER[getState()][1], 
					Sheet.DYER_SIZE[getState()][0], Sheet.DYER_SIZE[getState()][1]);
		}
	}

	public void update(int direction) {
		if((direction == 1 && getState() == 2) || (direction == 2 && getState() == 3) || 
				(direction == 3 && getState() == 1) || (direction == 4 && getState() == 0)) {
			
		}
		int x = 0, y = 0;
		switch (direction) {
		case 1:
			y = -1;
			setState(2);
			break;
		case 2:
			x = 1;
			setState(3);
			break;
		case 3:
			setState(1);
			y = 1;
			break;
		case 4:
			setState(0);
			x = -1;
		}
		setX(getX() + x * 4);
		setY(getY() + y * 4);
		setX(Math.max(Math.min(getX(), (Settings.COL_NUM - 2) * 32 - getWidth()), 64));
		setY(Math.max(Math.min(getY(), (Settings.ROW_NUM - 4) * 32 - getHeight() + 28), 28 + 128));
	}
	
	public void render(Graphics g) {
		g.drawImage(sprite, getX(), getY(), null);
	}
	
	public void tick() {
		switch(disguise) {
		case 1:
			if(tick >= Sheet.SPNR[getState()].length/2)
				tick = 0;
			sprite = sheet.getSubimage(Sheet.SPNR[getState()][tick*2], Sheet.SPNR[getState()][tick*2+1], 
					Sheet.SPNR_SIZE[getState()][0], Sheet.SPNR_SIZE[getState()][1]);
			break;
		case 2:
			if(tick >= Sheet.WEVR[getState()].length/2)
				tick = 0;
			sprite = sheet.getSubimage(Sheet.WEVR[getState()][tick*2], Sheet.WEVR[getState()][tick*2+1], 
					Sheet.WEVR_SIZE[getState()][0], Sheet.WEVR_SIZE[getState()][1]);
			break;
		case 3:
			if(tick >= Sheet.DYER[getState()].length/2)
				tick = 0;
			sprite = sheet.getSubimage(Sheet.DYER[getState()][tick*2], Sheet.DYER[getState()][tick*2+1], 
					Sheet.DYER_SIZE[getState()][0], Sheet.DYER_SIZE[getState()][1]);
		}
		
		tick++;
	}
}
