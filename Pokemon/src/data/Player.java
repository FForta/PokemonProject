package data;

import static helpers.Artist.*;
import static helpers.Clock.*;

import java.awt.event.*;
import java.util.concurrent.TimeUnit;

import org.lwjgl.input.Keyboard;
import org.newdawn.slick.opengl.Texture;

public class Player {

	Encounter E = new Encounter();
	Route Tile = new Route(); 
	private int width, height;
	private float x, y;
	private Texture texture;
	private Route grid;
	boolean lockedMovement = false;
	
	public Player(Texture texture, Tile startTile, Route grid, int width, int height) {
		this.texture = texture;
		this.x = startTile.getX();
		this.y = startTile.getY();
		this.width = width; 
		this.height = height;
		this.grid = grid;
	}
	
	public void Draw() {
		DrawQuadTex(texture, x, y, width, height);
	}
	
	/*Tile myTile = grid.GetTile((int) (x / 64), (int)(y / 64));
	Tile aboveTile = grid.GetTile((int) (x / 64), (int)(y / 64) - 1);
	Tile belowTile = grid.GetTile((int) (x / 64), (int)(y / 64) + 1);
	Tile rightTile = grid.GetTile((int) (x / 64) + 1, (int)(y / 64));
	Tile leftTile = grid.GetTile((int) (x / 64) - 1, (int)(y / 64));
	
	public void Movement() {
		while (lockedMovement == false) {
			while (Keyboard.next()) {
				if (Keyboard.getEventKey() == Keyboard.KEY_W && Keyboard.getEventKeyState()) {
					//if (aboveTile.encounterable == true) {
					//	E.encounter();
					//}
					
					//if (aboveTile.northBlocked != true) {
						myTile = aboveTile;
					//}
				}
			}
		}
	}
*/
   }