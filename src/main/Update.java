package main;

public class Update {
	private static int num = 0;
	
	public static void update(int[] input, boolean[] dTap, int[] mouse) {
		num++;
		num%=3;
		
		for (int i = 0; i < Settings.RUFFIAN_NUM; i++) {
			MainController.ruffians[i].update(input[i]);
			if(num == 0)
				MainController.ruffians[i].tick();
			if(dTap[i]) System.out.println(i);//do something later
		}
		
		for (int i = 0; i < Settings.MACHINE_NUM; i++) {
			if(MainController.machines[i].isIdle()) {
				MainController.machines[i].work();
			}
			
			MainController.machines[i].tick();
		}
	}
}
