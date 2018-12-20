import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

@SuppressWarnings("serial")
public class Driver extends JPanel implements ActionListener{
	Constants c = new Constants();
	
	Fool[] fools = new Fool[c.FOOL_NUM];
	Rebel[] rebels = new Rebel[c.REBEL_NUM];
	
	Initialize init = new Initialize(fools, rebels);
	Input input = new Input(rebels);
	
	public void paint(Graphics g) {
		Toolkit.getDefaultToolkit().sync();
		super.paintComponent(g);

		Update u = new Update(fools, rebels);
		Render r = new Render(g, fools, rebels);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		repaint();
	}
	
	public static void main(String[] arg) {
		Driver d = new Driver();
	}
	
	public Driver(){
		JFrame f = new JFrame();
		f.setTitle("In Plain Sight");
		f.setBackground(Color.BLACK);
		f.setResizable(false);

		f.add(this);
		t = new Timer(10, this);
		t.start();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		f.setExtendedState(JFrame.MAXIMIZED_BOTH); 
		f.setUndecorated(true);
		f.setVisible(true);
		
		f.addKeyListener(input);
		f.addMouseListener(input);
		
		
		
	}
	Timer t;
}
