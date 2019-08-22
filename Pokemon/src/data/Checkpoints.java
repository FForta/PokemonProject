package data;

public class Checkpoints {

	private Tile tile;
	private int xDirection, yDirection;
	
	public Checkpoints(Tile tile, int xDirection, int yDirection) {
		this.tile = tile;
		this.xDirection = yDirection;
		this.yDirection = yDirection;
	}

	public Tile getTile() {
		return tile;
	}

	public int getxDirection() {
		return xDirection;
	}

	public int getyDirection() {
		return yDirection;
	}
	
	
	
}
