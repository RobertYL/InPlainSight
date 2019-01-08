package main;

public class Update {
	public static void update(int[] input) {
		for (int i = 0; i < Settings.RUFFIAN_NUM; i++) {
			MainController.ruffians[i].update(input[i]);
		}
	}
}
