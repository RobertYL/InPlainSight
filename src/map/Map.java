package map;

import java.io.File;
import java.io.FileNotFoundException;
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
		Scanner sc = null;
		try {
			sc = new Scanner(new File("src/map/default.map"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i = 0; i < Settings.ROW_NUM; i++) {
			for(int j = 0; j < Settings.COL_NUM; j++) {
				System.out.println("d");
				map[j][i] = sc.nextInt();
			}
		}
	}
}
