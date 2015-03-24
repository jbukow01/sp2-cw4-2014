/**
 * 
 */
package theGame;

/**
 * @author jbukow01
 *
 */
import static org.junit.Assert.*;

import org.junit.Test;

public class OceanTest {

	@Test
	public void randoms() {
		
		Ocean o = new Ocean();
		
		System.out.println(o.getRandomInteger(10));
		System.out.println(o.getRandomInteger(10));
		System.out.println(o.getRandomInteger(10));
		
		System.out.println(o.getRandomBoolean());
		System.out.println(o.getRandomBoolean());
		System.out.println(o.getRandomBoolean());
	}

}
