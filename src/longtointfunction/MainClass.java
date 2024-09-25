package longtointfunction;

import java.util.function.LongToIntFunction;

public class MainClass {

	public static void main(String[] args) {

		/**
		 * @author Ali Kaan Arbay
		 * 
		 *         functional interface name: LongToIntFunction
		 * 
		 *         return type: int
		 * 
		 *         method name: applyAsInt
		 * 
		 *         numbers of parameters : 1 (long)
		 * 
		 */

		LongToIntFunction convertLongToInt = (x) -> (int) x;
		int applyAsInt = convertLongToInt.applyAsInt(100L);
		System.out.println("Converted to int: " + applyAsInt);

	}

}
