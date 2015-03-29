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
		
		if (this.isSunk()) {
			return "X";
		}
		
		if (!this.horizontal) {
			if (this.hit[i - this.getBowRow()]) {
				return "S";
			} else {
				return ".";
			}
		} else {
			if (this.hit[j - this.getBowColumn()]) {
				return "S";
			} else {
				return ".";
			}
		}
	}
}
