package main;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

import entity.character.Artisan;
import entity.character.Dyer;
import entity.character.Ruffian;
import entity.character.Spinner;
import entity.character.Weaver;
import main.Settings;
import input.Input;

public class MainController extends JPanel implements ActionListener{
	
	
	public static Artisan[] artisans = new Artisan[Settings.ARTISAN_NUM];
	Ruffian[] ruffians = new Ruffian[3];
	Input input = new Input(ruffians);
	
	public void paint(Graphics g) {
		Toolkit.getDefaultToolkit().sync();
		super.paintComponent(g);
		
		Render.render(g);
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		repaint();
	}

	public MainController() {
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
		
	}
	Timer t;
}
