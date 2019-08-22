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
	
	Tile myTile = grid.GetTile((int) (x / 64), (int)(y / 64));
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
	
	/*
	public void keyPressed(KeyEvent e) throws InterruptedException{
        int KeyCode = e.getKeyCode();
        if(KeyCode == KeyEvent.VK_W){
        	if (Boot.grid[PosX][PosY] == 8) {
        		//teleport to new route and update currentRoute
        	}
            if (Boot.map[PosX][PosY--] != 0 || Boot.map[PosX][PosY--] != 4 || Tile.Route1[PosX][PosY--] != 5 || Tile.Route1[PosX][PosY--] != 6) {
            	if (Tile.Route1[PosX][PosY--] == 2) {
            		E.encounter();
            	}
            	PosY--;
            }
            TimeUnit.SECONDS.sleep(1);
        }
        if(KeyCode == KeyEvent.VK_S){
        	if (Tile.Route1[PosX][PosY] == 10) {
        		//teleport to new route and update currentRoute
        	}
        	if (Tile.Route1[PosX][PosY++] != 0 || Tile.Route1[PosX][PosY++] != 3 || Tile.Route1[PosX][PosY++] != 5 || Tile.Route1[PosX][PosY++] != 6) {
        		if (Tile.Route1[PosX][PosY++] == 2) {
            		E.encounter();
            	}
        		PosY++;
     
            }
            TimeUnit.SECONDS.sleep(1);
        }
        if(KeyCode == KeyEvent.VK_A){
        	if (Tile.Route1[PosX][PosY] == 9) {
        		//teleport to new route and update currentRoute
        	}
        	if (Tile.Route1[PosX--][PosY] != 0 || Tile.Route1[PosX--][PosY] != 4 || Tile.Route1[PosX--][PosY] != 5 || Tile.Route1[PosX--][PosY] != 3) {
        		if (Tile.Route1[PosX--][PosY] == 2) {
            		E.encounter();
            	}
        		PosX--;
    
            }
            TimeUnit.SECONDS.sleep(1);
       	 
        }
        if(KeyCode == KeyEvent.VK_D){
        	if (Tile.Route1[PosX][PosY] == 11) {
        		//teleport to new route and update currentRoute
        	}
        	if (Tile.Route1[PosX++][PosY] != 0 || Tile.Route1[PosX++][PosY] != 4 || Tile.Route1[PosX++][PosY] != 5 || Tile.Route1[PosX++][PosY] != 6) {
        		if (Tile.Route1[PosX--][PosY] == 2) {
            		E.encounter();
            	}
        		PosX++;
            }
            TimeUnit.SECONDS.sleep(1);
        } 
	     }
*/
   }