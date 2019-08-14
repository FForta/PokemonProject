package data;

public enum TileType {

	Grass("grass1", true, 0.1), Space("space1", false, 0), Water("water1", true, 0.1);
	
	String textureName;
	boolean encounter;
	double encounterRate;
	
	TileType(String textureName, boolean encounter, double encounterRate){
		this.textureName = textureName;
		this.encounter = encounter;
		this.encounterRate = encounterRate;
	}
	
}
