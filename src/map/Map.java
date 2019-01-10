package map;

import java.util.ArrayList;
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
	public ArrayList<Pair<Integer, Integer>> wheel = new ArrayList<Pair<Integer, Integer>>();
	public ArrayList<Pair<Integer, Integer>> loom = new ArrayList<Pair<Integer, Integer>>();
	public ArrayList<Pair<Integer, Integer>> barrel = new ArrayList<Pair<Integer, Integer>>();
	public Pair<Integer, Integer> woolStockpile, yarnStockpile, fabricStockpile, dyedFabricStockpile;
	
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
				if(map[j][i] == 2 && !(woolStockpile instanceof Pair))
					woolStockpile = new Pair<Integer, Integer>(j, i);
				if(map[j][i] == 3)
					wheel.add(new Pair<Integer, Integer>(j, i));
				if(map[j][i] == 4 && !(yarnStockpile instanceof Pair))
					yarnStockpile = new Pair<Integer, Integer>(j, i);
				if(map[j][i] == 5)
					loom.add(new Pair<Integer, Integer>(j, i));
				if(map[j][i] == 6 && !(fabricStockpile instanceof Pair))
					fabricStockpile = new Pair<Integer, Integer>(j, i);
				if(map[j][i] == 7)
					barrel.add(new Pair<Integer, Integer>(j, i));
				if(map[j][i] == 8 && !(dyedFabricStockpile instanceof Pair))
					dyedFabricStockpile = new Pair<Integer, Integer>(j, i);
			}
		}
	}
}

class Pair<A, B> {
	public final A first;
	public final B second;
	public Pair(final A first, final B second) {
		this.first = first;
		this.second = second;
	}
}
