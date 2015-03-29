/**
 * 
 */
package theGame;

/**
 * @author jbukow01
 *
 */
public class Battleship extends Ship {
	
	// constructor
	Battleship() {
		this.length = 4;
		this.hit = new boolean[4]; 
	}
	
	@Override
	String getShipType() {
		return "Battleship";
	}
	
	@Override
	public String toString(int i, int j) {
		if (isSunk()) {
			return "X";
		}
		
		if (this.hit[i- this.getBowRow()]) {
			return "S";
		} else {
			return ".";
		}
	}
}
