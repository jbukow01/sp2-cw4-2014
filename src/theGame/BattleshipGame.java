/**
 * 
 */
package theGame;

import java.util.Scanner;

/**
 * @author jbukow01
 *
 */

public class BattleshipGame {

	private static Scanner input;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		input = new Scanner(System.in);
		
		Ocean o = new Ocean();
		
		o.placeAllShipsRandomly();
		
		System.out.println("Welcome to the Battleship Game!");
		
		while (!o.isGameOver()) {
			System.out.println("Number of ships sunk: " + o.getShipsSunk());
			System.out.println("Number of shots fired: " + o.getShotsFired());
			System.out.println("Number of hits: " + o.getHitCount());
			
			System.out.print("Enter row: ");
			
			int row = input.nextInt();
	
			System.out.print("Enter column: ");
			int column = input.nextInt();
			
			o.shootAt(row, column);
			
			o.print();
		}

	}

}
