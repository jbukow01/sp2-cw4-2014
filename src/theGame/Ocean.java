/**
 * 
 */
package theGame;

/**
 * @author jbukow01
 *
 */
public class Ocean {

	Ship[][] ships = new Ship[10][10];
	Ship[] shipsArray = new Ship[10];

	int shotsFired;
	int hitCount;
	int shipsSunk;
	
	// constructor
	Ocean() {
		shotsFired = 0;
		hitCount = 0;
		shipsSunk = 0;
		
		shipsArray[0] = new Battleship();
		shipsArray[1] = new Cruiser();
		shipsArray[2] = new Cruiser();
		shipsArray[3] = new Destroyer();
		shipsArray[4] = new Destroyer();
		shipsArray[5] = new Destroyer();
		shipsArray[6] = new Submarine();
		shipsArray[7] = new Submarine();
		shipsArray[8] = new Submarine();
		shipsArray[9] = new Submarine();
	}

	void placeAllShipsRandomly() {

	}

	boolean isOccupied(int row, int column) {
		return false;
	}

	boolean shootAt(int row, int column) {
		shotsFired++;
		hitCount++;
		return false;
	}

	int getShotsFired() {
		return shotsFired;
	}

	int getHitCount() {
		return hitCount;
	}

	int getShipsSunk() {
		return shipsSunk;
	}

	boolean isGameOver() {
		return false;
	}

	void print() {
		System.out.println();
		System.out.println(" 0 1 2 3 4 5 6 7 8 9");
		System.out.println();
	}
}
