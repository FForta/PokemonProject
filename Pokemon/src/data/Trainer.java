package data;

import org.newdawn.slick.opengl.Texture;

import static helpers.Clock.*;
import static helpers.Artist.*;

public class Trainer {

	private int width, height;
	private float x, y;
	int speed;
	int vision;
	private Texture texture;
	private Tile spawnTile;
	private boolean first = true;
	//movement instructions? array of correlated directions and distance
	
	public Trainer(Texture texture, Tile startTile, int width, int height, int vision, int speed) {
		this.texture = texture;
		this.x = startTile.getX();
		this.y = startTile.getY();
		this.width = width; 
		this.height = height;
		this.vision = vision;
		this.speed = speed;
	}
	
	public void Update() {
		if (first)
			first = false;
		else
			x += Delta() * speed;
	}
	
	public void Draw() {
		DrawQuadTex(texture, x, y, width, height);
	}
}
