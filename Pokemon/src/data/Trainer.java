package data;

import org.newdawn.slick.opengl.Texture;

public class Trainer {

	private int x, y, width, height;
	Texture texture;
	
	public Trainer(Texture texture, int x, int y, int width, int height) {
		this.texture = texture;
		this.x = x;
		this.y = y;
		this.width = width; 
		this.height = height;
	}
}
