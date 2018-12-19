import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Input implements KeyListener, MouseListener{
	Constants c = new Constants();
	//Pair[] event = new Pair[c.REBEL_NUM];
	Rebel[] rebels = new Rebel[c.REBEL_NUM];
	
	public Input(Rebel[] i) {
		rebels = i;
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
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode() == 87)
			rebels[0].s.facing = 0;
		else if(e.getKeyCode() == 68)
			rebels[0].s.facing = 1;
		else if(e.getKeyCode() == 83)
			rebels[0].s.facing = 2;
		else if(e.getKeyCode() == 65)
			rebels[0].s.facing = 3;
		
		else if(e.getKeyCode() == 73)
			rebels[1].s.facing = 0;
		else if(e.getKeyCode() == 76)
			rebels[1].s.facing = 1;
		else if(e.getKeyCode() == 75)
			rebels[1].s.facing = 2;
		else if(e.getKeyCode() == 74)
			rebels[1].s.facing = 3;
		
		else if(e.getKeyCode() == 38)
			rebels[2].s.facing = 0;
		else if(e.getKeyCode() == 39)
			rebels[2].s.facing = 1;
		else if(e.getKeyCode() == 40)
			rebels[2].s.facing = 2;
		else if(e.getKeyCode() == 37)
			rebels[2].s.facing = 3;
	}

	@Override
	public void keyReleased(KeyEvent e) {
		/*if(e.getKeyCode() == 87)
			rebels[0].s.facing = 4;
		else if(e.getKeyCode() == 68)
			rebels[0].s.facing = 4;
		else if(e.getKeyCode() == 83)
			rebels[0].s.facing = 4;
		else if(e.getKeyCode() == 65)
			rebels[0].s.facing = 4;
		
		else if(e.getKeyCode() == 73)
			rebels[1].s.facing = 4;
		else if(e.getKeyCode() == 76)
			rebels[1].s.facing = 4;
		else if(e.getKeyCode() == 75)
			rebels[1].s.facing = 4;
		else if(e.getKeyCode() == 74)
			rebels[1].s.facing = 4;
		
		else if(e.getKeyCode() == 38)
			rebels[2].s.facing = 4;
		else if(e.getKeyCode() == 39)
			rebels[2].s.facing = 4;
		else if(e.getKeyCode() == 40)
			rebels[2].s.facing = 4;
		else if(e.getKeyCode() == 37)
			rebels[2].s.facing = 4;*/
	}

	@Override
	public void keyTyped(KeyEvent e) {
		
	}

}
