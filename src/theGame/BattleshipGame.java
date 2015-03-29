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

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Ocean o = new Ocean();
		
		o.placeAllShipsRandomly();
		
		System.out.print("Enter row: ");
		int row = input.nextInt();

		System.out.print("Enter column: ");
		int column = input.nextInt();
		
		o.shootAt(row, column);
		
		o.print();

	}

}
