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
