package game;

import java.awt.Color;

public class Building implements Drawable {

	private Block[][] struct;
	private int numBuilding;
	private final Color[] colors = new Color[]{ Color.RED, Color.BLUE, Color.GREEN, Color.YELLOW };
	private double x, y, height, width;
	
	public Building( int numBuilding ) { //FIXME
		this.height = Math.random() * 0.45 + 0.25;
		this.width = 0.09;
		struct = new Block[(int)(width*200)][(int)(height*200)];
		Color c = colors[(int) ( Math.random() * colors.length )];
		for ( int i = 0; i < struct.length; ++i ) {
			for ( int j = 0; j < struct[0].length; ++j ) {
				struct[i][j] = new Block( numBuilding / 10.0 + i*width/struct.length, j*height/struct[0].length, c );
			}
		}
	}
	
	public Block[][] getStruct() {
		return this.struct;
	}
	
	public void setPos( double x, double y ) {
		this.x = numBuilding / 10.0;
		this.y = 0;
	}
	
	public double[] getPos() {
		return new double[]{ x, y };
	}
	
	public void draw() {
		for ( Block[] line : struct ) {
			for ( Block b : line ) {
				if ( !b.isHit() ) {
					b.draw();
				}
			}
		}
	}
	
	public double getHeight() {
		return this.height;
	}
	
	public String getType() {
		return "building";
	}
	
}
