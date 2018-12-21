import java.util.Random;

import constants.Constants;

public class Fool {
	Sprite s = new Sprite();
	Constants c = new Constants();
	
	public Fool() {
		s = new Sprite();
	}
	
	public void update() {
		s.move();
		
		ai();
		bounds();
	}
	
	private void ai() {
		Random rand = new Random();
		if(rand.nextInt(50) == 0) {
			s.facing = rand.nextInt(5);
		}
	}
	
	private void bounds() {
		Random rand = new Random();
		if(s.x + s.size > c.W_WIDTH || s.x < 0)
			s.facing = rand.nextInt(5);
		if(s.y + s.size > c.W_HEIGHT || s.y < 0)
			s.facing = rand.nextInt(5);
		
		if(s.x < 0) {
			s.x = 0;
		}else if(s.x + s.size > c.W_WIDTH) {
			s.x = c.W_WIDTH - s.size;
		}
		if(s.y < 0) {
			s.y = 0;
		}else if(s.y + s.size > c.W_HEIGHT) {
			s.y = c.W_HEIGHT - s.size;
		}
	}
	
	public int x() {
		return s.x;
	}
	
	public int y() {
		return s.y;
	}
	
	public int size() {
		return s.size;
	}
}