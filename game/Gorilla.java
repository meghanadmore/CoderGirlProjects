package game;

public class Gorilla implements Drawable {
	
	private int playerID;
	private boolean alive, firing;
	private double x, y, angle, vel;
	private Projectile proj;
	
	public Gorilla( int playerID, double height ) {
		this.playerID = playerID;
		this.alive = true;
		this.firing = false;
		this.proj = null;
		setPos( playerID == 1 ? 0.03 : 0.94, height ); //FIXME
	}
	
	public double[] getPos() {
		return new double[]{ x, y };
	}
	
	public void setPos( double x, double y ) {
		this.x = x;
		this.y = y;
	}
	
	public void draw() {
		StdDraw.setPenColor();
		StdDraw.filledRectangle( getPos()[0], getPos()[1], 0.03, 0.03 );
	}
	
	public int getID() {
		return this.playerID;
	}
	
	public boolean getAlive() {
		return this.alive;
	}
	
	public void fire( double angle, double vel ) {
		if ( this.proj == null ) {
			this.proj = new Projectile( getID(), angle, vel );
			this.firing = true;
		}
	}
	
	public void stopFiring() {
		this.proj = null;
		this.firing = false;
	}
	
	public boolean getFiring() {
		return this.firing;
	}
	
	public Projectile getProj() {
		return this.proj;
	}
	
	public String getType() {
		return "gorilla";
	}
}