package data;

import org.newdawn.slick.opengl.Texture;

import static helpers.Clock.*;

import java.util.ArrayList;

import static helpers.Artist.*;

public class Trainer {

	private int width, height, currentCheckpoint;
	private float x, y;
	int speed;
	int vision;
	boolean left = false;
	boolean right = false;
	boolean up = false;
	boolean down = false;
	private Texture texture;
	private Tile spawnTile;
	private Route grid;
	private boolean first = true;
	private String movementInstructions;
	/* ex.
	 * 1,4,1
	 * direction, distance, wait time 
	 * 
	 * or
	 * 
	 * 1,4,1,3,2,2
	 * 
	 * direction, distance, wait time, direction, distance, wait time 
	*/
	public Trainer(Texture texture, Tile startTile, Route grid, int width, int height, 
			int vision, int speed, String movementInstructions) {
		this.texture = texture;
		this.x = startTile.getX();
		this.y = startTile.getY();
		this.width = width; 
		this.height = height;
		this.vision = vision;
		this.speed = speed;
		this.movementInstructions = movementInstructions;
	}

	
	
	public void ParseInstructions() throws InterruptedException {
		
		String[] instructions = movementInstructions.split(",");
		
		for (int i = 0; i < instructions.length; i += 3) {
			
			if (instructions[i].equalsIgnoreCase("1")) {
				up = true;
			}
			else if (instructions[i].equalsIgnoreCase("2")) {
				right = true;
			}
			else if (instructions[i].equalsIgnoreCase("3")) {
				down = true;
			}
			else if (instructions[i].equalsIgnoreCase("4")) {
				left = true;
			}
			
			int counter;
			try {
			   counter = Integer.parseInt(instructions[i+1]);
			}
			catch (NumberFormatException e)
			{
			   counter = 0;
			}
			
			while (counter != 0) {
				if (up = true) {
					while (y >= (y -= 64)) {
						y -= Delta() * speed;
					}
					counter--;
				}
				else if (right = true) {
					while (x <= (x += 64)) {
						x += Delta() * speed;
					}
					counter--;
				}
				else if (down = true) {
					while (y <= (y += 64)) {
						y += Delta() * speed;
					}
					counter--;
				}
				else if (left = true) {
					while (x >= (x -= 64)) {
						x -= Delta() * speed;
					}
					counter--;
				}
			}
			
			int wait;
			try {
			   wait = Integer.parseInt(instructions[i+2]);
			}
			catch (NumberFormatException e)
			{
			   wait = 0;
			}
			
			Thread.sleep(1000 * wait);
			
			up = false;
			right = false;
			down = false;
			left = false;
		}
		
	}
	
	/*public void Update() {
		if (first)
			first = false;
		else
			x += Delta() * speed;
			y += Delta() * speed;
		}
	*/
	public void Draw() {
		DrawQuadTex(texture, x, y, width, height);
	}
}
