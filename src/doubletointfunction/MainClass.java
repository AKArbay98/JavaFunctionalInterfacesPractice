package doubletointfunction;

import java.util.function.DoubleToIntFunction;

public class MainClass {

	public static void main(String[] args) {

		/**
		 * @author Ali Kaan Arbay
		 * 
		 *         functional interface name: DoubleToIntFunction
		 * 
		 *         return type: int
		 * 
		 *         method name: applyAsInt
		 * 
		 *         numbers of parameters : 1 (double)
		 * 
		 */

		DoubleToIntFunction roundToNearestInt = (x) -> (int) Math.round(x);
		int applyAsInt = roundToNearestInt.applyAsInt(3.14);
		System.out.println(applyAsInt);

	}

}
