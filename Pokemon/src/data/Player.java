package data;

import static helpers.Artist.DrawQuadTex;

import java.awt.event.*;
import java.util.concurrent.TimeUnit;

public class Player {

	Encounter E = new Encounter();
	Route Tile = new Route();
	int PosX = 1;
	int PosY = 1; 
	
	DrawQuadTex(QuickLoad(""), x, y, width, height);
	
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