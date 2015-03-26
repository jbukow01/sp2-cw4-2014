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
		
		Ocean o = new Ocean();
		
		o.placeAllShipsRandomly();
		
		o.print();

	}

}
