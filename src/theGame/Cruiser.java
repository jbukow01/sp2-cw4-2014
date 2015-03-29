/**
 * 
 */
package theGame;

/**
 * @author jbukow01
 *
 */
public class Cruiser extends Ship {
	
	// constructor
	Cruiser() {
		this.length = 3;
		this.hit = new boolean[3]; 
	}
	
	@Override
	String getShipType() {
		return "Cruiser";
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
