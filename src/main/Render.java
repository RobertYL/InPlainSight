package main;

import java.awt.Color;
import java.awt.Graphics;

import map.Map;

public class Render {
	
	
	public static void render(Graphics g) {
		map(g);
		structures(g);
		artisans(g);
		ruffians(g);
		
		if(Settings.DEBUG) {
			g.setColor(new Color(128, 128, 128));
			for(int i = 0; i <= 1920; i+=(4 * 16))
				g.drawLine(i, 0, i, 1080);
			for(int i = 28; i <= 1080; i+=(4 * 16))
				g.drawLine(0, i, 1920, i);
			
			g.setColor(new Color(0, 0, 0));
			g.fillRect(0, 0, 1920, 28);
			g.fillRect(0, 1080-28, 1920, 28);
		}
	}
	
	public static void map(Graphics g) {
		Map.render(g);
	}
	
	public static void structures(Graphics g) {
		for (int i = 0; i < Settings.MACHINE_NUM; i++) {
			MainController.machines[i].render(g);
		}
	}
	
	public static void artisans(Graphics g) {
		for (int i = 0; i < Settings.ARTISAN_NUM; i++) {
			MainController.artisans[i].render(g);
		}
	}
	
	public static void ruffians(Graphics g) {
		for (int i = 0; i < Settings.RUFFIAN_NUM; i++) {
			MainController.ruffians[i].render(g);
		}
		
	}
	
}
