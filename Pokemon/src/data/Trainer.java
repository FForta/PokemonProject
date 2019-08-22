package data;

import org.newdawn.slick.opengl.Texture;

import static helpers.Clock.*;

import java.util.ArrayList;

import static helpers.Artist.*;

public class Trainer {

	private int width, height;
	private float x, y;
	int speed;
	int vision;
	private Texture texture;
	private Tile spawnTile;
	private Route grid;
	private boolean first = true;
	//movement instructions? array of correlated directions and distance
	
	private ArrayList<Checkpoints> checkpoints;
	private int[] directions;
	
	public Trainer(Texture texture, Tile startTile, Route grid, int width, int height, int vision, int speed) {
		this.texture = texture;
		this.x = startTile.getX();
		this.y = startTile.getY();
		this.width = width; 
		this.height = height;
		this.vision = vision;
		this.speed = speed;
		
		this.checkpoints = new ArrayList<Checkpoints>();
		this.directions = new int[2];
		//X direction
		this.directions[0] = 0;
		//Y direction
		this.directions[1] = 0;
		directions = FindNextD(startTile);
	}
	
	public void Update() {
		if (first)
			first = false;
		else
			x += Delta() * directions[0];
			y += Delta() * directions[1];
		}
	
	private int[] FindNextD(Tile s) {
		int[] dir = new int[2];
				
		Tile u = grid.GetTile(s.getXPlace(), s.getYPlace() - 1);
		Tile r = grid.GetTile(s.getXPlace() + 1, s.getYPlace());
		Tile d = grid.GetTile(s.getXPlace(), s.getYPlace() + 1);
		Tile l = grid.GetTile(s.getXPlace() - 1, s.getYPlace());
		
		if (s.getType() == u.getType()) {
			dir[0] = 0;
			dir[1] = -1;
		}
		if (s.getType() == r.getType()) {
			dir[0] = 1;
			dir[1] = 0;
		}
		if (s.getType() == d.getType()) {
			dir[0] = 0;
			dir[1] = 1;
		}
		if (s.getType() == l.getType()) {
			dir[0] = -1;
			dir[1] = 0;
		}
		
		return dir;
	}
	
	public void Draw() {
		DrawQuadTex(texture, x, y, width, height);
	}
}
