package game;

import java.awt.Color;

public class Block implements Drawable {
	
	private boolean hit;
	private double x, y;
	private Color color;
	
	public Block( double x, double y, Color c ) {
		this.hit = false;
		setPos( x, y );
		this.color = c;
	}
	
	public double[] getPos() {
		return new double[]{ x, y };
	}
	
	public void setPos( double x, double y ) {
		this.x = x;
		this.y = y;
	}
	
	public void draw() {
		StdDraw.setPenColor( color );
		StdDraw.filledRectangle( x, y, 0.005, 0.005 );
	}
	
	public String getType() {
		return "block";
	}
	
	public void destroy() {
		this.hit = true;
	}
	
	public boolean isHit() {
		return this.hit;
	}
}
