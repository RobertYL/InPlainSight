
public class Sprite {
	int size = 50, VEL_MAX = 2;
	
	int x, y;
	Pair[] vel = new Pair[5];
	int facing = 0;
	boolean isHoldingShard, isHustling;
	
	public Sprite() {
		vel[0] = new Pair(0, -VEL_MAX);
    	vel[1] = new Pair(VEL_MAX, 0);
    	vel[2] = new Pair(0, VEL_MAX);
    	vel[3] = new Pair(-VEL_MAX, 0);
    	vel[4] = new Pair(0, 0);
	}
	
	public void move() {		
		x += vel[facing].first;
		y += vel[facing].second;
	}
}