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
import main.Settings;
import input.Input;

public class MainController extends JPanel implements ActionListener{
	
	
	public static Artisan[] artisans = new Artisan[Settings.ARTISAN_NUM];
	public static Ruffian[] ruffians = new Ruffian[Settings.RUFFIAN_NUM];
	private Input input = new Input();
	
	public void paint(Graphics g) {
		Toolkit.getDefaultToolkit().sync();
		super.paintComponent(g);
		
		Update.update(input.getInput());
		Render.render(g);
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		repaint();
	}

	public MainController() {
		int next = 0;
		for (int i = 0; i < Settings.SPINNER_NUM; i++, next++) {
			artisans[next] = new Spinner(Settings.SPINNER_WIDTH, Settings.SPINNER_HEIGHT, 0, 28, 1);
		}
		for (int i = 0; i < Settings.WEAVER_NUM; i++, next++) {
			artisans[next] = new Weaver(Settings.WEAVER_WIDTH, Settings.WEAVER_HEIGHT, 0, 28, 2);
		}
		for (int i = 0; i < Settings.DYER_NUM; i++, next++) {
			artisans[next] = new Dyer(Settings.DYER_WIDTH, Settings.DYER_HEIGHT, 0, 28, 3);
		}
		
		ruffians[0] = new Ruffian(Settings.SPINNER_WIDTH, Settings.SPINNER_HEIGHT, 0, 28, 1);
		ruffians[1] = new Ruffian(Settings.WEAVER_WIDTH, Settings.WEAVER_HEIGHT, 0, 28, 2);
		ruffians[2] = new Ruffian(Settings.DYER_WIDTH, Settings.DYER_HEIGHT, 0, 28, 3);
		
		JFrame f = new JFrame();
		f.setTitle("In Plain Sight");
		f.setBackground(Color.BLACK);
		f.setResizable(false);

		f.add(this);
		t = new Timer(1000/60, this);
		t.start();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		f.setExtendedState(JFrame.MAXIMIZED_BOTH); 
		f.setUndecorated(true);
		f.setVisible(true);
		
		f.addKeyListener(input);
	}
	Timer t;
}
