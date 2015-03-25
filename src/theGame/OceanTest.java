/**
 * 
 */
package theGame;

import org.junit.Test;

public class OceanTest {

	@Test
	public void randomsTest() {
		
		Ocean o = new Ocean();
		
		System.out.println(o.getRandomInteger(10));
		System.out.println(o.getRandomInteger(10));
		System.out.println(o.getRandomInteger(10));
		
		System.out.println(o.getRandomBoolean());
		System.out.println(o.getRandomBoolean());
		System.out.println(o.getRandomBoolean());
	}
	
	@Test
	public void emptyOceanTest() {
		
		Ocean o = new Ocean();
		
		System.out.println("Location 0,0: " + o.ships[0][0]);
		System.out.println("Location 5,5: " + o.ships[5][5]);
		System.out.println("Location 9,9: " + o.ships[9][9]);
		
	}
	
	@Test
	public void battleshipPlacementTest() {
		
		Ocean o = new Ocean();
		
		o.placeAllShipsRandomly(0, 0, true);
		
		System.out.println(o.ships[0][0]);
		System.out.println(o.ships[0][1]);
		System.out.println(o.ships[0][2]);
		System.out.println(o.ships[0][3]);
		
		o.placeAllShipsRandomly(0, 9, false);
		
		System.out.println(o.ships[0][9]);
		System.out.println(o.ships[1][9]);
		System.out.println(o.ships[2][9]);
		System.out.println(o.ships[3][9]);
	}
	
	@Test
	public void printTest() {
		
		Ocean o = new Ocean();
		
		o.print();
	}

}
