package data;

public enum TileType {

	Grass("grass1", true, 0.1, false, false, false, false), Space("space1", false, 0, false, false, false, false), Water("water1", true, 0.1, true, true, true, true);
	
	String textureName;
	boolean encounter;
	double encounterRate;
	boolean northBlocked, southBlocked, westBlocked, eastBlocked;
	boolean smashable, cuttable, pushable, surfable, climbable, waterfallable;
	boolean eventTile;
	boolean teleport;
	String teleportRoute;
	int teleportX, teleportY;
	//fishable boolean?
	
	TileType(String textureName, boolean encounter, double encounterRate, boolean northBlocked, boolean southBlocked, boolean westBlocked, boolean eastBlocked){
		this.textureName = textureName;
		this.encounter = encounter;
		this.encounterRate = encounterRate;
	}
	
}
