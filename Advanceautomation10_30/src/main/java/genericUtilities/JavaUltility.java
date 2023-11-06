package genericUtilities;

import java.util.Random;
/*
 * 
 */

public class JavaUltility {
	/*
	 * 
	 */
	public int generateRandomNumber(int range) {
		Random r=new Random();
		return r.nextInt(range);
		
	}

}
