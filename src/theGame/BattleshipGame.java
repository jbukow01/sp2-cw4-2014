/**
 * 
 */
package theGame;

/**
 * @author jbukow01
 *
 */

public class BattleshipGame {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		boolean repeat = true;
		
		while (repeat) {
			Ocean o = new Ocean();
			
			o.placeAllShipsRandomly();
			
			System.out.println("Welcome to the Battleship Game!");
			
			while (!o.isGameOver()) {
				System.out.println("Number of ships sunk: " + o.getShipsSunk());
				System.out.println("Number of shots fired: " + o.getShotsFired());
				System.out.println("Number of hits: " + o.getHitCount());
				System.out.println();
				
				int row = o.input("row");
				int column = o.input("column");
				
				o.shootAt(row, column);
				
				o.print();		
			}
			
			System.out.println("You won. You fired: "+o.getShotsFired() + " shots to sunk all ships.");
			repeat = o.repeat(o.input(""));
		}
	}
}
