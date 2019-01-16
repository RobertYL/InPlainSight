package entity.character;

import java.awt.Graphics;

import javax.swing.ImageIcon;

import main.Settings;

public class Spinner extends Artisan {
		
	public Spinner(int width, int height, int x, int y, int job) {
		super(width, height, x, y, job);
		ImageIcon icon = new ImageIcon(Settings.SPINNER_PATH);
		sprite = icon.getImage();
	}

	@Override
	public void render(Graphics g) {
		g.drawImage(sprite, getX(), getY(), null);
	}
	
	private int goal;
		// 1 idling (just walking around randomly, starts if machine is broken)
		// 2 grabbing (grab from stockpile)
		// 3 processing (move to machine)
		// 4 stocking (place into next stockpile)
	
	@Override
	public void ai() {
		switch(goal) {
		case 1:
			
		case 2:
			
		case 3:
			
		case 4:
		
		default:
			goal = 1;
			break;
		}
		
		// grabbing
			// bfs to stockpile
			// walk to stockpile
			// pick up
			// -> idling
		// processing
			// bfs to claimed machine
			// move to machine
			// process at machine
			// -> stocking
		// idling
			// check if a machine is available
			// if available claim and -> processing
			// else -> idle
		// stocking
			// bfs to stockpile
			// walk to stockpile
			// drop off
			// -> grabbing
	}
	
	@Override
	public void work() {
		this.work = true;
	}
}
