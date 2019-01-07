import constants.Constants;

public class Initialize {
	Constants c = new Constants();
	
	public Initialize(Fool[] fools, Rebel[] rebels) {
		for(int i = 0; i < c.FOOL_NUM; i++) {
			fools[i] = new Fool();
		}
		for(int i = 0; i < c.REBEL_NUM; i++) {
			rebels[i] = new Rebel();
		}
	}
}
