import java.util.Random;

public class temp {
	int size = 50, TIMER_MAX = 50, VEL_MAX = 2;
	
	int x, y;
	Pair[] vel = new Pair[4];
	int facing, timer;
	boolean isHoldingShard, isHustling;
	double shardProb, hustlingProb;
	
	int w_width, w_height;
	
	public temp(int width, int height) {
		w_width = width;
		w_height = height;
		Random rand = new Random();
		
		x = rand.nextInt(Math.abs(w_width - size));
		y = rand.nextInt(Math.abs(w_height - size));
		
		vel[0] = new Pair(0, -VEL_MAX);
    	vel[1] = new Pair(VEL_MAX, 0);
    	vel[2] = new Pair(0, VEL_MAX);
    	vel[3] = new Pair(-VEL_MAX, 0);
    	facing = rand.nextInt(4);
    	timer = rand.nextInt(TIMER_MAX + 1) + 50;
	}
	
	public void update() {
		move();
		reflect();
		bounds();
	}

	private void move() {
		Random rand = new Random();
		
		x += vel[facing].first;
		y += vel[facing].second;
		
		if(timer == 0) {
			facing = rand.nextInt(4);
			timer = rand.nextInt(TIMER_MAX + 1) + 50;
		}
		timer--;
	}
	
	private void reflect() {
		Random rand = new Random();
		if(x + size > w_width || x < 0)
			facing = rand.nextInt(4);
		if(y + size > w_height || y < 0)
			facing = rand.nextInt(4);
	}
	
	private void bounds() {
		if(x < 0) {
			x = 0;
		}else if(x + size > w_width) {
			x = w_width - size;
		}
		if(y < 0) {
			y = 0;
		}else if(y + size > w_height) {
			y = w_height - size;
		}
	}
}