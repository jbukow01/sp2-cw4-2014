/**
 * 
 */
package theGame;

import java.util.Random;
import java.util.Scanner;

/**
 * @author jbukow01
 *
 */

public class Ocean {

	Ship[][] ships = new Ship[10][10];
	Ship[] shipsArray = new Ship[10];
	int numberOfShips = shipsArray.length;
	int oceanSize = ships.length;
	int boardSize = oceanSize - 1;

	int shotsFired;
	int hitCount;
	int shipsSunk;
	Random random = new Random();
	private Scanner input;
	
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
		
		for (int i = 0; i < oceanSize; i++) {
			for (int j = 0; j < oceanSize; j++) {
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
	
	boolean isOutOfBounds(int bow, int length) {
		if (bow + length > oceanSize) {
			return true;
		}
		return false;
	}

	void placeAllShipsRandomly() {
		
		for (int i = 0; i < numberOfShips; i++) {
			
			boolean floating = false;
			while (!floating) {
				int row = getRandomInteger(oceanSize);
				int column = getRandomInteger(oceanSize);
				boolean horizontal = getRandomBoolean();
				int shipLength = (shipsArray[i].length);
				
				if (shipsArray[i].okToPlaceShipAt(row, column, horizontal, this)) {
					for (int j = 0; j < shipLength; j++) {
						shipsArray[i].placeShipAt(row, column, horizontal, this);
					}
				floating = true;
				}
			}
		}
	}

	boolean isOccupied(int row, int column) {
		if (this.ships[row][column].getShipType().equals("EmptySea")) {
			return false;
		} else {
			return true;
		}
	}

	boolean shootAt(int row, int column) {
		this.shotsFired++;
		if (!this.isOccupied(row, column)) {
			if (this.ships[row][column].hit[0]) {
				this.ships[row][column].hit[0] = true;
			}
			return false;
		} else if (this.ships[row][column].isSunk()) {
			this.hitCount++;
			return false;
		} else {
			this.hitCount++;
			this.ships[row][column].shootAt(row, column);
			if (this.ships[row][column].isSunk()) {
				this.shipsSunk++;
				System.out.println();
				System.out.println(this.ships[row][column].getShipType() + " has been sunk.");
			}
		}
		return true;
	}

	int getShotsFired() {
		return this.shotsFired;
	}

	int getHitCount() {
		return this.hitCount;
	}

	int getShipsSunk() {
		return this.shipsSunk;
	}

	boolean isGameOver() {
		if (this.getShipsSunk() == 10) {
			return true;
		} else {
			return false;
		}
	}
	
	int input(String data) {
		input = new Scanner(System.in);
		int user = oceanSize + 1;

		if(data.equals("row") || data.equals("column")) {
			while (user > oceanSize || user < 0){
				
				System.out.print("Enter " + data + ": ");
				
				while (!input.hasNextInt()){					
					System.out.print(input.next() + " is not valid. Enter a valid number (between 0 and " + boardSize + ")");			
				}

				user = input.nextInt();

				if(user > 9 || user < 0){
					System.out.print(user + " is not valid. Enter a valid number (between 0 and " + boardSize + ")");				
				}
			}
		} else {
			System.out.print("Would you like to play again. Enter 1 if so.");
			int option = Integer.parseInt(input.next());
			repeat(option);
			System.out.println();
		}		
		return user;
	}
	
	boolean repeat(int option) {
		if (option == 1) {
			return true;
		} else {
			return false;
		}
	}

	void print() {
		System.out.println();
		System.out.print("  ");
		for (int i = 0; i < oceanSize; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		for (int i = 0; i < oceanSize; i++) {
			System.out.print(i + " ");
			for (int j = 0; j < numberOfShips; j++) {
				System.out.print(this.ships[i][j].toString(i, j) + " ");
			}
			System.out.println();
		}
		System.out.println();
	}
}
