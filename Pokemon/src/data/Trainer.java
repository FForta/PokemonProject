package data;

import org.newdawn.slick.opengl.Texture;

import static helpers.Artist.*;

public class Trainer {

	private int width, height;
	private float x, y;
	int vision;
	private Texture texture;
	private Tile spawnTile;
	
	public Trainer(Texture texture, Tile startTile, int width, int height, int vision) {
		this.texture = texture;
		this.x = startTile.getX();
		this.y = startTile.getY();
		this.width = width; 
		this.height = height;
	}
	
	public void Draw() {
		DrawQuadTex(texture, x, y, width, height);
	}
}
