package main;

public final class Sheet {
	public static final int[][] SPNR = {
			// Walk l
			{276,4, 276,72, 276,4, 276,72},
			// Walk d
			{312,4, 312,72, 312,140, 312,208},
			// Walk u
			{348,4, 348,72, 348,140, 348,208},
			// Walk r
			{384,4, 384,72, 384,4, 384,72},
			
			// Carry l wool
			{276,344, 276,444, 276,344, 276,444},
			// Carry d wool
			{312,344, 312,444, 312,544, 312,644},
			// Carry u wool
			{348,344, 348,444, 348,544, 348,644},
			// Carry r wool
			{384,344, 384,444, 384,344, 384,444},
			
			// Carry l yarn
			{276,744, 276,844, 276,744, 276,844},
			// Carry d yarn
			{312,744, 312,844, 312,944, 312,1044},
			// Carry u yarn
			{348,744, 348,844, 348,944, 348,1044},
			// Carry r yarn
			{384,744, 384,844, 384,744, 384,844},
			
			// Stock l
			{276,276, 276,276, 276,276, 276,276},
			// Stock d
			{312,276, 312,276, 312,276, 312,276},
			// Stock u
			{348,276, 348,276, 348,276, 348,276},
			// Stock r
			{384,276, 384,276, 384,276, 384,276},
			
			// Working
			{564,4, 564,4, 564,4, 564,4, 564,4, 564,4, 
				564,4, 564,4, 564,4, 564,4, 564,4, 564,4, 
				564,4, 564,4, 564,4, 564,4, 564,4, 564,4, 
				564,4, 564,4, 564,4, 564,4, 564,4, 564,4,
				564,4, 564,4, 564,4, 564,4, 564,4, 564,4,
				564,4, 564,4, 564,4, 564,4, 564,4, 564,4,
				564,4, 564,4, 564,4, 564,4, 564,4, 564,4,
				564,4, 564,4, 564,4, 564,4, 564,4, 564,4,},
	};
	public static final int[][] SPNR_SIZE = {
			{32, 64},
			{32, 64},
			{32, 64},
			{32, 64},
			{32, 96},
			{32, 96},
			{32, 96},
			{32, 96},
			{32, 96},
			{32, 96},
			{32, 96},
			{32, 96},
			{32, 64},
			{32, 64},
			{32, 64},
			{32, 64},
			{1, 1},
	};
	
	public static final int[][] WEVR = {
			// Walk l
			{420,4, 420,40, 420,4, 420,40},
			// Walk d
			{456,4, 456,40, 456,76, 456,112},
			// Walk u
			{492,4, 492,40, 492,76, 492,112},
			// Walk r
			{528,4, 528,40, 528,4, 528,40},
			
			// Carry l yarn
			{420,184, 420,268, 420,184, 420,268},
			// Carry d yarn
			{456,184, 456,268, 456,352, 456,436},
			// Carry u yarn
			{492,184, 492,268, 492,352, 492,436},
			// Carry r yarn
			{528,184, 528,268, 528,184, 528,268},
			
			// Carry l fbrc
			{420,520, 420,588, 420,520, 420,588},
			// Carry d fbrc
			{488,520, 488,588, 488,656, 488,724},
			// Carry u fbrc
			{556,520, 556,588, 556,656, 556,724},
			// Carry r fbrc
			{624,520, 624,588, 624,520, 624,588},
			
			// Stock l
			{420,148, 420,148, 420,148, 420,148},
			// Stock d
			{456,148, 456,148, 456,148, 456,148},
			// Stock u
			{492,148, 492,148, 492,148, 492,148},
			// Stock r
			{528,148, 528,148, 528,148, 528,148},
			
			// Working
			{564,4, 564,4, 564,4, 564,4, 564,4, 564,4, 
				564,4, 564,4, 564,4, 564,4, 564,4, 564,4, 
				564,4, 564,4, 564,4, 564,4, 564,4, 564,4, 
				564,4, 564,4, 564,4, 564,4, 564,4, 564,4,
				564,4, 564,4, 564,4, 564,4, 564,4, 564,4,
				564,4, 564,4, 564,4, 564,4, 564,4, 564,4,
				564,4, 564,4, 564,4, 564,4, 564,4, 564,4,
				564,4, 564,4, 564,4, 564,4, 564,4, 564,4,},
	};
	public static final int[][] WEVR_SIZE = {
			{32, 32},
			{32, 32},
			{32, 32},
			{32, 32},
			{32, 80},
			{32, 80},
			{32, 80},
			{32, 80},
			{64, 64},
			{64, 64},
			{64, 64},
			{64, 64},
			{32, 32},
			{32, 32},
			{32, 32},
			{32, 32},
			{1, 1},
	};
	
	public static final int[][] DYER = {
			// Walk l
			{4,4, 4,72, 4,4, 4,72},
			// Walk d
			{72,4, 72,72, 72,140, 72,208},
			// Walk u
			{140,4, 140,72, 140,140, 140,208},
			// Walk r
			{208,4, 208,72, 208,4, 208,72},
			
			// Carry l fbrc
			{4,344, 4, 444, 4,344, 4,444},
			// Carry d fbrc
			{72,344, 72,444, 72,544, 72,644},
			// Carry u fbrc
			{140,344, 140,444, 140,544, 140,644},
			// Carry r fbrc
			{208,344, 208, 444, 208,344, 208,444},
			
			// Carry l dfrc
			{4,744, 4,844, 4,744, 4,844},
			// Carry d dfrc
			{72,744, 72,844, 72,944, 72,1044},
			// Carry u dfrc
			{140,744, 140,844, 140,944, 140,1044},
			// Carry r dfrc
			{208,744, 208,844, 208,744, 208,844},
			
			// Stock l
			{4,276, 4,276, 4,276, 4,276},
			// Stock d
			{72,276, 72,276, 72,276, 72,276},
			// Stock u
			{140,276, 140,276, 140,276, 140,276},
			// Stock r
			{208,276, 208,276, 208,276, 208,276},
			
			// Working
			{564,4, 564,4, 564,4, 564,4, 564,4, 564,4, 
				564,4, 564,4, 564,4, 564,4, 564,4, 564,4, 
				564,4, 564,4, 564,4, 564,4, 564,4, 564,4, 
				564,4, 564,4, 564,4, 564,4, 564,4, 564,4,
				564,4, 564,4, 564,4, 564,4, 564,4, 564,4,
				564,4, 564,4, 564,4, 564,4, 564,4, 564,4,
				564,4, 564,4, 564,4, 564,4, 564,4, 564,4,
				564,4, 564,4, 564,4, 564,4, 564,4, 564,4,},
	};
	public static final int[][] DYER_SIZE = {
			{64, 64},
			{64, 64},
			{64, 64},
			{64, 64},
			{64, 96},
			{64, 96},
			{64, 96},
			{64, 96},
			{64, 96},
			{64, 96},
			{64, 96},
			{64, 96},
			{64, 64},
			{64, 64},
			{64, 64},
			{64, 64},
			{1, 1},
	};
	
	public static final int[][] WHEL = {
			// Idle
			{720,392},
			// Working
			{276,1144, 276,1144, 276,1232, 276,1232, 
				276,1320, 276,1320, 276,1408, 276,1408,
				276,1144, 276,1144, 276,1232, 276,1232, 
				276,1320, 276,1320, 276,1408, 276,1408,
				276,1144, 276,1144, 276,1232, 276,1232, 
				276,1320, 276,1320, 276,1408, 276,1408,
				276,1144, 276,1144, 276,1232, 276,1232, 
				276,1320, 276,1320, 276,1408, 276,1408,
				276,1144, 276,1144, 276,1232, 276,1232, 
				276,1320, 276,1320, 276,1408, 276,1408,
				276,1144, 276,1144, 276,1232, 276,1232, 
				276,1320, 276,1320, 276,1408, 276,1408,},
			// Broken
			{720,460},
	};
	public static final int[][] WHEL_SIZE = {
			{96, 64},
			{96, 84},
			{96, 64},
	};
	public static final int[][] LOOM = {
			// Idle
			{820,392},
			// Working
			{420,792, 488,792, 556,792, 624,792, 
				420,924, 488,924, 556,924, 624,924, 
				420,1056, 488,1056, 556,1056, 624,1056, 
				420,792, 488,792, 556,792, 624,792, 
				420,924, 488,924, 556,924, 624,924, 
				420,1056, 488,1056, 556,1056, 624,1056, 
				420,792, 488,792, 556,792, 624,792, 
				420,924, 488,924, 556,924, 624,924, 
				420,1056, 488,1056, 556,1056, 624,1056, 
				420,792, 488,792, 556,792, 624,792, 
				420,924, 488,924, 556,924, 624,924, 
				420,1056, 488,1056, 556,1056, 624,1056},
			// Broken
			{820,492},
	};
	public static final int[][] LOOM_SIZE = {
			{64, 96},
			{64, 128},
			{64, 96},
	};
	public static final int[][] BRRL = {
			// Idle
			{888,392},
			// Working
			{4,1144, 4,1144, 4,1144, 4,1144, 
				72,1144, 72,1144, 72,1144, 72,1144, 
				140,1144, 140,1144, 140,1144, 140,1144, 
				208,1144, 208,1144, 208,1144, 208,1144, 
				4,1244, 4,1244, 4,1244, 4,1244,
				72,1244, 72,1244, 72,1244, 72,1244, 
				140,1244, 140,1244, 140,1244, 140,1244, 
				208,1244, 208,1244, 208,1244, 208,1244, 
				4,1344, 4,1344, 4,1344, 4,1344, 
				72,1344, 72,1344, 72,1344, 72,1344, 
				140,1344, 140,1344, 140,1344, 140,1344, 
				208,1344, 208,1344, 208,1344, 208,1344},
			// Broken
			{888,460},
	};
	public static final int[][] BRRL_SIZE = {
			{64, 64},
			{64, 96},
			{64, 64},
	};
	
	public static final int[][] WOOL = {
			{960, 4},
			{960, 132},
			{920, 260},
	};
	public static final int[][] YARN = {
			{828, 4},
			{828, 132},
			{828, 260},
	};
	public static final int[][] FBRC = {
			{696, 4},
			{696, 132},
			{696, 260},
	};
	public static final int[][] DFRC = {
			{564, 4},
			{564, 132},
			{564, 260},
	};
}
