
public class Update {
	public Update(Fool[] fools, Rebel[] rebels) {
		for(int i = 0; i < fools.length; i++) {
			fools[i].update();
		}
		for(int i = 0; i < rebels.length; i++) {
			rebels[i].update();
		}
	}
}
