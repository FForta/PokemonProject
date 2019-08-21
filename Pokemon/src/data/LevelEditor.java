package data;

import static helpers.Artist.*;

import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;

public class LevelEditor {

	private Route grid;
	private TileType[] types;
	private int index;
	
	public LevelEditor(Route grid) {
		this.grid = grid;
		this.types = new TileType[3];
		this.types[0] = TileType.Space;
		this.types[1] = TileType.Grass;
		this.types[2] = TileType.Water;
		this.index = 0;
	}
	
	public void SetTile() {
		grid.setTile((int)Math.floor(Mouse.getX() / 64), 
				(int)Math.floor((HEIGHT - Mouse.getY() - 1) / 64), types[index]);
	}
	
	public void Update() {
		if (Mouse.isButtonDown(0)) {
			SetTile();
		}
		while (Keyboard.next()) {
			if (Keyboard.getEventKey() == Keyboard.KEY_RIGHT && Keyboard.getEventKeyState()) {
				MoveIndex();
			}
		}
	}
	private void MoveIndex() {
		index++;
		if (index > types.length - 1) {
			index = 0;
		}
	}
	
}
