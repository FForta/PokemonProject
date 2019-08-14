package data;

import java.awt.*;
import java.awt.event.*;
import org.newdawn.slick.opengl.Texture;

import static helpers.Artist.*;

	

	public class Tile{
		
		private float x, y, width, height;
		private Texture texture;
		private TileType type;
		
		public Tile(float x, float y, float width, float height, TileType type) {
			this.x = x;
			this.y = y;
			this.width = width;
			this.height = height;
			this.type = type;
			this.texture = QuickLoad(type.textureName);
		}
		
		public void Draw() {
			DrawQuadTex(texture, x, y, width, height);
		}
	
	/*
	 * KEY: 
	 * 0 is Border
	 * 1 is Normal
	 * 2 is Tall Grass
	 * 3 is North Faced Ledge
	 * 4 is West Facing Ledge
	 * 5 is South Facing Ledge
	 * 6 is East Facing Ledge
	 * 7 is trigger
	 * 8 is North facing teleport
	 * 9 is West facing teleport
	 * 10 is South facing teleport
	 * 11 is East facing Teleport
	*/


		public float getX() {
			return x;
		}



		public void setX(float x) {
			this.x = x;
		}



		public float getY() {
			return y;
		}



		public void setY(float y) {
			this.y = y;
		}



		public float getWidth() {
			return width;
		}



		public void setWidth(float width) {
			this.width = width;
		}



		public float getHeight() {
			return height;
		}



		public void setHeight(float height) {
			this.height = height;
		}



		public Texture getTexture() {
			return texture;
		}



		public void setTexture(Texture texture) {
			this.texture = texture;
		}



		public TileType getType() {
			return type;
		}



		public void setType(TileType type) {
			this.type = type;
		}



		
		
		
		
		
		public String getCurrentRoute() {
			return currentRoute;
		}


		public void setCurrentRoute(String currentRoute) {
			this.currentRoute = currentRoute;
		}


		public int[][] getRoute1() {
			return Route1;
		}


		public void setRoute1(int[][] route1) {
			Route1 = route1;
		}


		public int[][] getRoute2() {
			return Route2;
		}


		public void setRoute2(int[][] route2) {
			Route2 = route2;
		}



	String currentRoute;
	
	int[][] Route1 = {   {0,0,0,0,0},
	                     {0,1,1,2,0},
	                     {0,1,2,2,0},
	                     {0,1,2,2,0},
	                     {0,0,10,10,0}
	};            
	
	int[][] Route2 = {  {0,0,8,8,0},
			            {0,1,1,1,0},
			            {0,1,1,1,0},
			            {0,1,1,2,0},
			            {0,0,0,0,0}
};            
	
	
	public void DrawMap() {
		/*MakeTrainerArray();
		JFrame f = new JFrame("Map");
	    f.setSize(250, 250);
	    f.setLocation(300,200);
	    final JTextArea textArea = new JTextArea(10, 40);
	    f.getContentPane().add(BorderLayout.CENTER, textArea);
	    CurrentMap = new JLabel(Arrays.deepToString(Route1).replace("], ", "]\n"));
	    add(CurrentMap);
	    /*final JButton button = new JButton("Click Me");
	    f.getContentPane().add(BorderLayout.SOUTH, button);
	    button.addActionListener(new ActionListener() {

	        @Override
	        public void actionPerformed(ActionEvent e) {
	            textArea.append("Button was clicked\n");

	        }
	    });*/

	    //f.setVisible(true);
	}
	
	
}