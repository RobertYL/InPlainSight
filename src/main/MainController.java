package main;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

import entity.character.*;
import entity.machine.*;
import main.Settings;
import map.Map;
import input.Input;

public class MainController extends JPanel implements ActionListener{
	
	
	public static Artisan[] artisans = new Artisan[Settings.ARTISAN_NUM];
	public static Ruffian[] ruffians = new Ruffian[Settings.RUFFIAN_NUM];
	public static Machine[] machines = new Machine[Settings.MACHINE_NUM];
	private Input input;
	public static Map map;
	
	public void paint(Graphics g) {
		Toolkit.getDefaultToolkit().sync();
		super.paintComponent(g);
		
		input.tick();
		Update.update(input.getInput(), input.getDTap(), input.getMouse());
		Render.render(g);
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		repaint();
	}

	public MainController() {
		input = new Input();
		map = new Map();
		
		int next = 0;
		for (int i = 0; i < Settings.SPINNER_NUM; i++, next++) 
			artisans[next] = new Spinner(Settings.SPINNER_WIDTH, Settings.SPINNER_HEIGHT, 0, 28, 1);
		for (int i = 0; i < Settings.WEAVER_NUM; i++, next++) 
			artisans[next] = new Weaver(Settings.WEAVER_WIDTH, Settings.WEAVER_HEIGHT, 0, 28, 2);
		for (int i = 0; i < Settings.DYER_NUM; i++, next++) 
			artisans[next] = new Dyer(Settings.DYER_WIDTH, Settings.DYER_HEIGHT, 0, 28, 3);
		next = 0;
		//for (int i = 0; i < Settings.WHEEL_NUM; i++, next++) 
			//machines[next] = new Wheel(Settings.WHEEL_WIDTH, Settings.WHEEL_HEIGHT, map.wheels.get(i).first*64, map.wheels.get(i).second*64 + 28, 1);
		//for (int i = 0; i < Settings.LOOM_NUM; i++, next++) 
			//machines[next] = new Loom(Settings.LOOM_WIDTH, Settings.LOOM_HEIGHT, map.looms.get(i).first*64, map.looms.get(i).second*64 + 28, 2);
		//for (int i = 0; i < Settings.BARREL_NUM; i++, next++) 
			//machines[next] = new Barrel(Settings.BARREL_WIDTH, Settings.BARREL_HEIGHT, map.barrels.get(i).first*64, map.barrels.get(i).second*64 + 28, 3);
		
		ruffians[0] = new Ruffian(Settings.SPINNER_WIDTH, Settings.SPINNER_HEIGHT, 0, 28, 1);
		ruffians[1] = new Ruffian(Settings.WEAVER_WIDTH, Settings.WEAVER_HEIGHT, 0, 28, 2);
		ruffians[2] = new Ruffian(Settings.DYER_WIDTH, Settings.DYER_HEIGHT, 0, 28, 3);
		
		JFrame f = new JFrame();
		f.setTitle("In Plain Sight");
		f.setBackground(Color.BLACK);
		f.setResizable(false);

		f.add(this);
		t = new Timer(1000/Settings.FPS, this);
		t.start();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		f.setExtendedState(JFrame.MAXIMIZED_BOTH); 
		f.setUndecorated(true);
		f.setVisible(true);
		
		f.addKeyListener(input);
	}
	Timer t;
}
