/**
 * 
 */
package theGame;

/**
 * @author jbukow01
 *
 */
public class Destroyer extends Ship {
	
	// constructor
	Destroyer() {
		this.length = 2;
		this.hit = new boolean[2]; 
	}
	
	@Override
	String getShipType() {
		return "Destroyer";
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
