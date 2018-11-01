package game;

public class Projectile implements Drawable {

	private int playerID;
	private double angle, vel, x, y, accum;
	private static final double accel = -0.00098;
	
	public Projectile( int playerID, double angle, double vel ) {
		this.playerID = playerID;
		this.angle = angle;
		this.vel = vel;
	}
	
	public double[] getPos() {
		return new double[]{ x, y };
	}

	public void setPos(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public void draw() {
		setPos( x + Math.cos( angle * Math.PI / 180.0 ) * Math.cos( angle ) * vel * (playerID == 2  ? -1 : 1 ),
				y + Math.sin( angle * Math.PI / 180.0 ) * ( Math.sin( angle ) * vel + accum ) );
		this.accum += accel;
		StdDraw.filledCircle( x, y, 0.02 );
	}

	public String getType() {
		return "projectile";
	}
	
	public int getID() {
		return this.playerID;
	}
	
	public boolean isCollidingBlock( double x, double y ) {
		double dist = Math.hypot( this.x - x, this.y - y);
		return dist <= 0.02;
	}
	
	public boolean isCollidingGorilla( double x, double y ) {
		double dist = Math.hypot( this.x - x, this.y - y);
		return dist <= 0.03;
	}

}
