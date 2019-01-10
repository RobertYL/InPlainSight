package map;

import java.util.Scanner;

import main.Settings;

public class Map {
	public int[][] map = new int[30][16];
		// 0 Empty
		// 1 Wall
		// 2 Raw Wool Stockpile
		// 3 Spinner
		// 4 Yarn Stockpile
		// 5 Loom
		// 6 Fabric Stockpile
		// 7 Barrel
		// 8 Dyed Fabric Stockpile
	
	
	public Map() {
		Scanner sc = new Scanner("src/map/default.map");
		for(int i = 0; i < Settings.ROW_NUM; i++) {
			for(int j = 0; j < Settings.COL_NUM; j++) {
				map[j][i] = sc.nextInt();
			}
		}
	}
}
