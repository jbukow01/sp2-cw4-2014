/**
 * 
 */
package theGame;

/**
 * @author jbukow01
 *
 */
public class Submarine extends Ship {
	
	// constructor
	Submarine() {
		length = 1;
		hit = new boolean[1]; 
	}
	
	@Override
	String getShipType() {
		return "Submarine";
	}
	
	@Override
	public String toString() {
		return null;
	}

}
