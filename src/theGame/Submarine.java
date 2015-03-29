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
		this.length = 1;
		this.hit = new boolean[1]; 
	}
	
	@Override
	String getShipType() {
		return "Submarine";
	}
	
	@Override
	public String toString() {
		if (isSunk()) {
			return "X";
		} else {
			return "S";
		}
	}

}
