package data;

import static helpers.Artist.*;

import java.util.ArrayList;

enum routeType
{
	PLAINS, DESERT, WATER, CAVE, 
};

public class Route {

	public Tile[][] area;
	private ArrayList<Trainer> trainerList;
	
	public Route() {
		area = new Tile[20][15];
		for (int i = 0; i < area.length; i++) {
			for (int j = 0; j < area[i].length; j++) {
				area[i][j] = new Tile(i * 64, j * 64, 64, 64, TileType.Grass);
			}
		}	
	}
	
	public Route(int[][] newArea) {
		area = new Tile[20][15];
		for (int i = 0; i < area.length; i++) {
			for (int j = 0; j < area[i].length; j++) {
				switch (newArea[j][i]) {
					case 0:
						area[i][j] = new Tile(i * 64, j * 64, 64, 64, TileType.Space);
						break;
					case 1:
						area[i][j] = new Tile(i * 64, j * 64, 64, 64, TileType.Grass);
						break;
					case 2:
						area[i][j] = new Tile(i * 64, j * 64, 64, 64, TileType.Water);
						break;
				}
			}
		}
	}
	
	public void setTile(int xCoord, int yCoord, TileType type) {
		area[xCoord][yCoord] = new Tile(xCoord * 64, yCoord * 64, 64, 64, type);
	}
	
	public Tile GetTile(int xCoord, int yCoord) {
		return area[xCoord][yCoord];
	}

	public void Draw() {
		for (int i = 0; i < area.length; i++) {
			for (int j = 0; j < area[i].length; j++) {
				area[i][j].Draw();
			}
		}
	}

//add trainer info

// add teleports

}

