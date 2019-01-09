package input;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Input implements KeyListener, MouseListener {
	int[] currentInput = new int[3];
	int[] input = new int[3];
	int[] ticks = new int[3];
	boolean[] dTap = new boolean[3];
	
	public Input() {
		
	}
	
	public void tick() {
		for (int i = 0; i < input.length; i++) {
			dTap[i] = false;
			ticks[i]--;
			if (currentInput[i] != 0) {
				if (currentInput[i] == input[i]) {
					if (ticks[i] > 0) dTap[i] = true;
					ticks[i] = 20;
				}
				input[i] = currentInput[i];
			}
			currentInput[i] = 0;
		}
	}
	
	public int[] getInput() {
		return input;
	}
	public boolean[] getDTap() {
		return dTap;
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
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		int keyCode = e.getKeyCode();
		if (keyCode == 27) System.exit(1);

		if(keyCode == 87)
			currentInput[0] = 1;
		else if(keyCode == 68)
			currentInput[0] = 2;
		else if(keyCode == 83)
			currentInput[0] = 3;
		else if(keyCode == 65)
			currentInput[0] = 4;
		
		else if(keyCode == 73)
			currentInput[1] = 1;
		else if(keyCode == 76)
			currentInput[1] = 2;
		else if(keyCode == 75)
			currentInput[1] = 3;
		else if(keyCode == 74)
			currentInput[1] = 4;
		
		else if(keyCode == 38)
			currentInput[2] = 1;
		else if(keyCode == 39)
			currentInput[2] = 2;
		else if(keyCode == 40)
			currentInput[2] = 3;
		else if(keyCode == 37)
			currentInput[2] = 4;
	}

	@Override
	public void keyTyped(KeyEvent e) {
		
	}

}
