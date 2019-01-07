import java.util.Random;
import java.util.Stack;

import constants.Constants;

public class Rebel {
	Sprite s = new Sprite();
	Constants c = new Constants();
	
	Stack<Integer> stack = new Stack<Integer>();
	
	public Rebel() {
		s = new Sprite();
	}
	
	public void update() {
		s.move();
		
		bounds();
	}
	
	private void bounds() {
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