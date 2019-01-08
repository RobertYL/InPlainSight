package input;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import entity.character.Ruffian;

public class Input implements KeyListener, MouseListener{
	//Pair[] event = new Pair[c.REBEL_NUM];
	Ruffian[] ruffians;
	
	public Input(Ruffian[] i) {
		ruffians = i;
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		int x = e.getX(), y = e.getY();
		for (Ruffian r : ruffians) {
			if (x > r.getX() && x < r.getY() + r.getWidth() && y > r.getY() && y < r.getY() + r.getHeight()) {
				System.out.println("d");
			}
		}
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		int keyCode = e.getKeyCode();
		if (keyCode == 27) System.exit(1);
		/*
		if(e.getKeyCode() == 87)
			ruffians[0].s.facing = 0;
		else if(e.getKeyCode() == 68)
			ruffians[0].s.facing = 1;
		else if(e.getKeyCode() == 83)
			ruffians[0].s.facing = 2;
		else if(e.getKeyCode() == 65)
			ruffians[0].s.facing = 3;
		
		else if(e.getKeyCode() == 73)
			ruffians[1].s.facing = 0;
		else if(e.getKeyCode() == 76)
			ruffians[1].s.facing = 1;
		else if(e.getKeyCode() == 75)
			ruffians[1].s.facing = 2;
		else if(e.getKeyCode() == 74)
			ruffians[1].s.facing = 3;
		
		else if(e.getKeyCode() == 38)
			ruffians[2].s.facing = 0;
		else if(e.getKeyCode() == 39)
			ruffians[2].s.facing = 1;
		else if(e.getKeyCode() == 40)
			ruffians[2].s.facing = 2;
		else if(e.getKeyCode() == 37)
			ruffians[2].s.facing = 3;
			*/
	}

	@Override
	public void keyReleased(KeyEvent e) {

	}

	@Override
	public void keyTyped(KeyEvent e) {
		
	}

}
