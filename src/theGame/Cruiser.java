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
