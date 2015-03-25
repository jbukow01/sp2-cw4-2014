/**
 * 
 */
package theGame;

/**
 * @author jbukow01
 *
 */

import java.util.Random;

public class Ocean {

	Ship[][] ships = new Ship[10][10];
	Ship[] shipsArray = new Ship[10];
	int numberOfShips = shipsArray.length;
	int oceanSizeColumns = ships[0].length;
	int oceanSizeRows = ships[1].length;

	int shotsFired;
	int hitCount;
	int shipsSunk;
	Random random = new Random();
	
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
		
		//int oceanSize = ships.length;
		
		for (int i = 0; i < oceanSizeColumns; i++) {
			for (int j = 0; j < oceanSizeRows; j++) {
				ships[i][j] = new EmptySea();
			}
		}
	}
	
	int getRandomInteger(int range) {
		return random.nextInt(range);
	}
	
	boolean getRandomBoolean() {
		return Math.random() < 0.5;
	}

	void placeAllShipsRandomly(int row, int column, boolean horizontal) {
		
		for (int i = 0; i < numberOfShips; i++) {
			int shipLength = (shipsArray[i].length);
				for (int j = 0; j < shipLength; j++) {
					shipsArray[i].placeShipAt(row, column, horizontal, this);	
				}
		}
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
		System.out.print("  ");
		for (int i = 0; i < oceanSizeColumns; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		for (int i = 0; i < oceanSizeRows; i++) {
			System.out.println(i + " ");
		}
		System.out.println();
	}
}
