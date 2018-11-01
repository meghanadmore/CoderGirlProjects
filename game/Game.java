package game;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;


/** TODO
 *  1) Angle/velocity changing via arrow keys (need ArcadeKeys brought in for multiplayer)
 *  2) Some game-end logic (max score, winner display, etc. if even necessary)
 */

public class Game {

	private int winner, playerTurn, numBuildings, p1score, p2score;
	private double wind;
	private static final int numPlayers = 2;

	public Game( int p1score, int p2score ) {
		this.playerTurn = (int) ( Math.random()*numPlayers ) + 1;
		this.p1score = p1score;
		this.p2score = p2score;
		this.wind = Math.random() * 0.01 * Math.signum(((int)(Math.random() * 3) - 1 ));
		this.numBuildings = 10;
	}

	public void playGame() {
		ArrayList<Building> buildings = new ArrayList<>();
		for ( int i = 0; i < numBuildings; ++i ) {
			buildings.add( new Building( i ) );
		}
		ArrayList<Gorilla> gorillas = new ArrayList<>();
		gorillas.add( new Gorilla( 1, buildings.get(0).getHeight() + 0.02 ) );
		gorillas.add( new Gorilla( 2, buildings.get(buildings.size()-1).getHeight() + 0.02 ) );
		ArrayList<Drawable> list = new ArrayList<>();
		list.addAll( buildings );
		list.addAll( gorillas );
		boolean firing = false, collided = false;
		while ( true ) {
			if ( StdDraw.isKeyPressed( KeyEvent.VK_COMMA ) ) {
				respawn();
			}
			StdDraw.clear();
			StdDraw.text( 0.15, 1, "Player 1 Score: " + p1score );
			StdDraw.text( 0.15, 0.95, "Player 2 Score: " + p2score );
			StdDraw.text( 0.85, 1, "Player " + playerTurn + "\'s turn" );
			StdDraw.text( 0.85, 0.95, "Wind: " + (int)(wind*10000.0)/10.0 + " MPH" );
			ListIterator<Drawable> drawableIter = list.listIterator();
			while ( drawableIter.hasNext() ) {
				Drawable d = drawableIter.next();
				d.draw();
				String type = d.getType();
				//Check if turn in progress
				firing = checkFiring( gorillas );
				//Gorilla firing logic
				Scanner in = new Scanner(System.in);
				if ( type.equals( "gorilla" ) ) {
					Gorilla g = (Gorilla) d;
					if ( !firing ) {

						if ( g.getID() == playerTurn ) {
							System.out.print("Enter angle (degrees): ");
							int angle = in.nextInt();
							System.out.print("\nEnter velocity as a number from 1-100: ");
							int vel = in.nextInt();
							g.fire( angle, vel / 1000.0 + ( g.getID() == 1 ? this.wind : -this.wind ) );
							g.getProj().setPos( g.getPos()[0], g.getPos()[1] );
							drawableIter.add( g.getProj() );
							//System.out.println( "Gorilla " + g.getID() + " is firing." );
						}
					}
				}
				//Projectile collision logic
				else if ( type.equals( "projectile" ) ) {
					Projectile proj = (Projectile) d;
					double[] projPos = proj.getPos();
					if ( projPos[0] <= 0 || projPos[0] >= 1 ) {
						firing = false;
						collided = true;
					}
					//Building collisions
					for ( Building building : buildings ) {
						Block[][] blocks = building.getStruct();
						for ( int i = 0; i < blocks.length; ++i ) {
							for ( int j = 0; j < blocks[0].length; ++j ) {
								double[] blockPos = blocks[i][j].getPos();
								if ( proj.isCollidingBlock( blockPos[0], blockPos[1] ) && !blocks[i][j].isHit() ) {
									collided = true;
									destroyNearby( buildings, blockPos[0], blockPos[1] );
								}
							}
						}
					}
					//Gorilla collisions
					for ( Gorilla g : gorillas ) {
						double[] gorillaPos = g.getPos();
						if ( proj.isCollidingGorilla( gorillaPos[0], gorillaPos[1] ) && !( g.getID() == proj.getID() ) ) {
							System.out.println("GORILLA COLLISION");
							if ( g.getID() == 1 ) {
								p2score++;
							}
							else {
								p1score++;
							}
							respawn();
						}
					}
				}
				if ( collided ) {
					drawableIter.remove();
					collided = false;
					firing = false;
					stopAllFiring( gorillas );
					nextTurn();
				}
			}
			StdDraw.show(10);
		}
	}

	private void stopAllFiring(ArrayList<Gorilla> gorillas) {
		for ( Gorilla g : gorillas ) {
			if ( g.getFiring() ) {
				g.stopFiring();
			}
		}
	}
	
	//FIXME -- remove lambda, use for loop
	private boolean checkFiring( ArrayList<Gorilla> gorillas ) {
		return gorillas.stream().anyMatch( g -> g.getFiring() );
	}

	private void destroyNearby( ArrayList<Building> buildings, double x, double y ) {
		ListIterator<Building> iter = buildings.listIterator();
		while ( iter.hasNext() ) {
			for ( Block[] b : iter.next().getStruct() ) {
				for ( Block block : b ) {
					if ( Math.hypot( x - block.getPos()[0] , y - block.getPos()[1] ) < 0.04 ) {
						block.destroy();
					}
				}
			}
		}
	}

	public void respawn() {
		this.playerTurn = (int) ( Math.random()*numPlayers ) + 1;
		this.wind = Math.random() * 0.01 * Math.signum(((int)(Math.random() * 3) - 1 ));
		playGame();
	}

	public void endGame() {
		//FIXME
	}

	private void nextTurn() {
		if ( playerTurn == 1 ) {
			playerTurn = 2;
		}
		else {
			playerTurn = 1;
		}
	}
}