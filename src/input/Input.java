package input;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Input implements KeyListener, MouseListener {
	int[] input = new int[3];
	
	public Input() {
		
	}
	
	public int[] getInput() {
		return input;
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
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		int keyCode = e.getKeyCode();
		if (keyCode == 27) System.exit(1);

		if(keyCode == 87)
			input[0] = 1;
		else if(keyCode == 68)
			input[0] = 2;
		else if(keyCode == 83)
			input[0] = 3;
		else if(keyCode == 65)
			input[0] = 4;
		
		else if(keyCode == 73)
			input[1] = 1;
		else if(keyCode == 76)
			input[1] = 2;
		else if(keyCode == 75)
			input[1] = 3;
		else if(keyCode == 74)
			input[1] = 4;
		
		else if(keyCode == 38)
			input[2] = 1;
		else if(keyCode == 39)
			input[2] = 2;
		else if(keyCode == 40)
			input[2] = 3;
		else if(keyCode == 37)
			input[2] = 4;
	}

	@Override
	public void keyReleased(KeyEvent e) {

	}

	@Override
	public void keyTyped(KeyEvent e) {
		
	}

}
