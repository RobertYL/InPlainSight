package main;

public final class Settings {
	public static final int FPS = 30;
	
	public static final boolean DEBUG = true;
	
	public static final int COL_NUM = 30;
	public static final int ROW_NUM = 16;
	
	public static final int RUFFIAN_NUM = 3;
	public static final int PRODUCTION 	= 200;
	
	public static final int ARTISAN_NUM = 27;
	public static final int SPINNER_NUM = 9;
	public static final int WEAVER_NUM 	= 9;
	public static final int DYER_NUM 	= 9;
	
	public static final int MACHINE_NUM = 15;
	public static final int WHEEL_NUM 	= 4;
	public static final int LOOM_NUM 	= 5;
	public static final int BARREL_NUM 	= 6;
	
	public static final int SPINNER_WIDTH 	= 4*8;
	public static final int SPINNER_HEIGHT 	= 4*16;
	public static final int WEAVER_WIDTH 	= 4*8;
	public static final int WEAVER_HEIGHT 	= 4*8;
	public static final int DYER_WIDTH 		= 4*16;
	public static final int DYER_HEIGHT 	= 4*16;
	
	public static final int WHEEL_WIDTH 	= 4*24;
	public static final int WHEEL_HEIGHT 	= 4*16;
	public static final int LOOM_WIDTH 		= 4*16;
	public static final int LOOM_HEIGHT 	= 4*24;
	public static final int BARREL_WIDTH 	= 4*16;
	public static final int BARREL_HEIGHT 	= 4*16;
	
	public static final int STOCKPILE_WIDTH = 4*32;
	public static final int STOCKPILE_HEIGHT= 4*32;
	
	public static final int WHEEL_FRAMES 	= 24;
	public static final int LOOM_FRAMES 	= 24;
	public static final int BARREL_FRAMES 	= 24;
	public static final int STOCK_FRAMES 	= 4;
	
	public static final String BACKGROUND_PATH = "src/resources/background.png";
	public static final String SHEET_PATH = "src/resources/spritesheet.png";
	
	public static final String SPINNER_PATH = "src/resources/spinner.png";
	public static final String WEAVER_PATH 	= "src/resources/weaver.png";
	public static final String DYER_PATH 	= "src/resources/dyer.png";
	public static final String WHEEL_PATH 	= "src/resources/wheel.png";
	public static final String LOOM_PATH 	= "src/resources/loom.png";
	public static final String BARREL_PATH 	= "src/resources/barrel.png";
	
	public static final String[] STOCKPILE_PATH = {"src/resources/wool_stockpile.png", 
												"src/resources/yarn_stockpile.png", 
												"src/resources/fabric_stockpile.png", 
												"src/resources/dyed_fabric_stockpile.png"};
}
